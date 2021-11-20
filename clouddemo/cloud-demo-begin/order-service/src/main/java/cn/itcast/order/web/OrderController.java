package cn.itcast.order.web;

import cn.itcast.order.pojo.Order;
import cn.itcast.order.pojo.User;
import cn.itcast.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.sql.ResultSet;

@RestController
@RequestMapping("order")
public class OrderController {

   @Autowired
   private OrderService orderService;

   @Autowired
   private RestTemplate restTemplate;

    @GetMapping("{orderId}")
    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId) {
        // 根据id查询订单并返回
//        return orderService.queryOrderById(orderId);
        Order order = orderService.queryOrderById(orderId);

        //拿到userId并发送get请求,接受get请求的返回值，拿到User对象
        User user = restTemplate.getForObject("http://localhost:8081/user/"+order.getUserId(), User.class);

        //因为order中user是null，因此封装set注入user对象
        order.setUser(user);

        return order;
    }
}
