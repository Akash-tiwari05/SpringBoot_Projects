package com.cn.cnkart.controller;


import com.cn.cnkart.entity.Order;
import com.cn.cnkart.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/save")
    public void saveOrder(@RequestBody Order order){
        orderService.saveOrder(order);
    }

    @GetMapping("/id/{id}")
    public Order getItemById(@PathVariable int id)
    {
        return orderService.getOrderById(id);
    }

    @DeleteMapping("/delete/id/{id}")
    public String deleteOrder(@PathVariable int id){
        orderService.delete(id);
        return "Order has been deleted by id : " + id;
    }

}
