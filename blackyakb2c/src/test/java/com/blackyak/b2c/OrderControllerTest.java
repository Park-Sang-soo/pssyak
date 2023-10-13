package com.blackyak.b2c;

import com.blackyak.b2c.api.order.vo.OrderStateVo;
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
public class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testGetOrderState() throws Exception {
        // 요청 객체 생성
        OrderStateVo.Request request = new OrderStateVo.Request();
        request.setCoOrderNo("20220724-BA279-B2C");
        request.setCoSequence("1");

        // API 호출 및 응답 검증
        mockMvc.perform(MockMvcRequestBuilders.get("/orders/orderstate/{coOrderNo}", request.getCoOrderNo())
        		.param("coSequence", request.getCoSequence())
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andDo(print());
    }
}

