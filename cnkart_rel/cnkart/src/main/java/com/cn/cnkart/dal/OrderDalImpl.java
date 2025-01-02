package com.cn.cnkart.dal;


import com.cn.cnkart.entity.Order;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDalImpl implements OrderDal{
    @Autowired
    EntityManager entityManager;

    @Override
    public void saveOrder(Order saveOrder) {
        Session session = entityManager.unwrap(Session.class);
        session.save(saveOrder);
    }

    @Override
    public Order getOrderById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Order order= session.get(Order.class, id);
        return order;
    }

    @Override
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);
        Order order= session.get(Order.class, id);
        session.delete(order);
    }

}
