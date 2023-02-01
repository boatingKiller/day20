package cn.jrq.web.controller;

import cn.jrq.domain.Order;
import cn.jrq.service.IOrderService;
import cn.jrq.vo.EmpVo;
import cn.jrq.vo.UserEmpVo;
import cn.jrq.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    private IOrderService orderService;


    @GetMapping("/highest")
    public Order selectHighestSaleOrder(String dateTime) {
        Order order = orderService.selectHighestSale(dateTime);
        return order;
    }

    @GetMapping("/query")
    public List<EmpVo> queryByDate(String dateTime) {
        List<EmpVo> empVos = orderService.queryByDate(dateTime);
        return empVos;
    }

    @GetMapping("/queryUserSale")
    public List<UserVo> queryUserSale() {
        return orderService.queryUserSale();
    }


    @GetMapping("/queryUserEmpRelation")
    public List<UserEmpVo> queryUserEmpRelation() {
        return orderService.queryUserEmpRelation();
    }
}
