package com.blackyak.b2c;

import com.blackyak.b2c.api.product.vo.ProductVo;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testGetProduct() throws Exception {
        // 요청 객체 생성
    	ProductVo.Request request = new ProductVo.Request();
        request.setCompanyCode("003");
        request.setProductCode("ABYSHX3915");
        request.setColorCode("BE");
        request.setSizeCode("235");

        // API 호출 및 응답 검증
        mockMvc.perform(MockMvcRequestBuilders.get("/products/product/{productCode}", request.getProductCode())
        		.param("companyCode", request.getCompanyCode())
        		.param("colorCode", request.getColorCode())
        		.param("sizeCode", request.getSizeCode())
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andDo(print());
    }
}

