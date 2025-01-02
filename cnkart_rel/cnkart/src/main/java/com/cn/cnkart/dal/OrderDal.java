package com.cn.cnkart.dal;

import com.cn.cnkart.entity.Order;

public interface OrderDal {
    void saveOrder(Order saveOrder);

    Order getOrderById(int id);

    void delete(int id);

}
