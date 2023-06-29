package com.blackyak.b2c.common.filter;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import com.blackyak.b2c.common.util.JsonUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class LoggingFilter extends OncePerRequestFilter{	
		
	@Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
					
        MDC.put("traceId", UUID.randomUUID().toString().replace("-", "").substring(0, 10));
        doFilterWrapped(request, response, filterChain);
        MDC.clear();
        
    }

    public void doFilterWrapped(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws IOException, ServletException {
    	
        ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper(request); 
        ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(response);
        
        try {
            logRequest(requestWrapper);
            doFilter(requestWrapper, responseWrapper, filterChain);
        } finally {
            logResponse(responseWrapper);
            responseWrapper.copyBodyToResponse();
        }
    }

    public void logRequest(ContentCachingRequestWrapper request) throws IOException {
    	
        String queryString = request.getQueryString();
                        
        log.info("\n==========[ Request ]==========" + "\n" 
        	   + "Method=[{}] " + "\n"
        	   + "uri=[{}] " + "\n"
        	   + "Header referer=[{}]" + "\n"
        	   + "Header host=[{}]" + "\n"
        	   + "Header userAgent=[{}]" + "\n"
        	   + "content-type=[{}]",
                request.getMethod(),
                queryString == null ? request.getRequestURI() : request.getRequestURI() + "?" +queryString,
        		request.getHeader("referer"),
        		request.getHeader("host"),
        		request.getHeader("user-Agent"),
                request.getContentType()
                
        );
        
        if(request.getContentType() == null)
            return;
    }

    public void logResponse(ContentCachingResponseWrapper response) throws IOException {
        
        byte[] content = StreamUtils.copyToByteArray(response.getContentInputStream());
        String contentString = new String(content); 
                
        if (content.length > 0 && content != null) {      
        	ObjectMapper objectMapper = new ObjectMapper();
            
            if (JsonUtil.isJSONContent(contentString)) {     
	            Object json = objectMapper.readValue(contentString, Object.class);
	            contentString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(json);       
            }
        } else {
        	contentString = "";
        }
        	
    	log.info("\n==========[ Response ]==========" + "\n"
                + "Status=[{}] " + "\n"
                + "Content={}",
                response.getStatus(),
                contentString
        );
    }
}
