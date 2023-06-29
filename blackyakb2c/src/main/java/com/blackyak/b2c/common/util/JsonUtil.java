package com.blackyak.b2c.common.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	
	private static final ObjectMapper objectMapper = new ObjectMapper();

    public static String JavaToJson(Object object) throws JsonProcessingException {
        return objectMapper.writeValueAsString(object);
    }
    
    public static boolean isJSONContent(String contentString) {
    	try {
            objectMapper.readTree(contentString); 
            return true;
        } catch (JsonProcessingException e) {
            return false;
        }
    }

}
