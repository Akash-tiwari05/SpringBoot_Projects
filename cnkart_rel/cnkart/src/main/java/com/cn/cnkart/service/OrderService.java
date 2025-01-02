package com.cn.cnkart.service;

import com.cn.cnkart.dal.ItemDal;
import com.cn.cnkart.dal.OrderDal;
import com.cn.cnkart.entity.Item;
import com.cn.cnkart.entity.Order;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderDal orderDal;

    @Autowired
    ItemDal itemDal;

    @Transactional
    public void saveOrder(Order order) {
        //save order
        Order saveOrder = new Order();
        saveOrder.setOrderType(order.getOrderType());
        List<Item> itemList = new ArrayList<>();
        //for fetching order one by one we need for each loop
        for(Item item: order.getItems())
        {
            Item currentItem = itemDal.getByID(item.getId());
            itemList.add(currentItem);
        }
        saveOrder.setItems(itemList);

        orderDal.saveOrder(saveOrder);
    }

    @Transactional
    public Order getOrderById(int id) {
        return orderDal.getOrderById(id);
    }
    @Transactional
    public void delete(int id) {
        orderDal.delete(id);
    }

}
