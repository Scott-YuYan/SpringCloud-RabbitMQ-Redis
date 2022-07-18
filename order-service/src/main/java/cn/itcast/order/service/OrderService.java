package cn.itcast.order.service;

import cn.itcast.order.model.vo.OrderVo;
import org.springframework.stereotype.Service;

public interface OrderService {

    OrderVo queryOrderById(Long orderId);

}
