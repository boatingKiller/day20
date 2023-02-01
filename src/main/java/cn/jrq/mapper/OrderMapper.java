package cn.jrq.mapper;

import cn.jrq.domain.Order;
import cn.jrq.vo.EmpVo;
import cn.jrq.vo.UserEmpVo;
import cn.jrq.vo.UserVo;

import java.math.BigDecimal;
import java.util.List;

public interface OrderMapper {

    Order selectHighestOrder(BigDecimal salePrice);

    BigDecimal selectHighestSale(String dateTime);

    List<Order> listAll();

    List<EmpVo> queryByDate(String dateTime);

    List<UserVo> queryUserSale();

    List<UserEmpVo> queryUserEmpRelation();
}
