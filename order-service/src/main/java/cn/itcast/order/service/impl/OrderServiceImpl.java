package cn.itcast.order.service.impl;

import cn.itcast.order.mapper.OrderMapper;
import cn.itcast.order.model.po.OrderDao;
import cn.itcast.order.model.vo.OrderVo;
import cn.itcast.order.service.OrderService;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.itcase.common.utils.BeanConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public OrderVo queryOrderById(Long orderId){
        LambdaQueryWrapper<OrderDao> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(OrderDao::getId,orderId);
        OrderDao orderDao = orderMapper.selectOne(queryWrapper);
        return BeanConvertUtils.convertTo(orderDao,OrderVo::new);
    }

}
