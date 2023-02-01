package cn.jrq.service.impl;

import cn.jrq.mapper.OrderMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderServiceImplTest {

    @Autowired
    private OrderMapper orderMapper;
    @Test
    void listAll() {
        System.out.println(orderMapper.listAll());
    }
}