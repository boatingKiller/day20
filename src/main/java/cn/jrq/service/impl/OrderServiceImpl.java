package cn.jrq.service.impl;

import cn.jrq.domain.Order;
import cn.jrq.mapper.OrderMapper;
import cn.jrq.service.IOrderService;
import cn.jrq.vo.EmpVo;
import cn.jrq.vo.UserEmpVo;
import cn.jrq.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public Order selectHighestSale(String dateTime) {
        BigDecimal salePrice = orderMapper.selectHighestSale(dateTime);
        Order order = orderMapper.selectHighestOrder(salePrice);
        return order;
    }

    @Override
    public List<Order> listAll() {
        return orderMapper.listAll();
    }

    @Override
    public List<EmpVo> queryByDate(String dateTime) {
        List<EmpVo> empVos = orderMapper.queryByDate(dateTime);
        return empVos;
    }

    @Override
    public List<UserVo> queryUserSale() {
        return orderMapper.queryUserSale();
    }

    @Override
    public List<UserEmpVo> queryUserEmpRelation() {
        return orderMapper.queryUserEmpRelation();
    }
}
