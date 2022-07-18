package cn.itcast.order.controller;

import cn.itcast.order.model.vo.OrderVo;
import cn.itcast.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;


    @PostMapping(path = "/getOrderById")
    private OrderVo getOrderVoById(@RequestParam(value = "orderId")Long orderId){
        return orderService.queryOrderById(orderId);
    }
}
