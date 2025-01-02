package com.cn.cnkart.dal;

import com.cn.cnkart.entity.Item;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ItemDalImpl implements ItemDal
{

    @Autowired
    EntityManager entityManager;

    @Override
    public Item getByID(int id) {
        Session session = entityManager.unwrap(Session.class);
        Item item= session.get(Item.class, id);
       return item;
    }

    @Override
    public void save(Item item) {
        Session session = entityManager.unwrap(Session.class);
        session.save(item);
    }

    @Override
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);
        Item item= session.get(Item.class, id);
        session.delete(item);
    }

    @Override
    public void update(Item updatedItem) {
        Session session = entityManager.unwrap(Session.class);
        //fetch the current item detail from the database
        Item currentItem= session.get(Item.class, updatedItem.getId());
        //update the details in the current item
        currentItem.setDescription(updatedItem.getDescription());
        currentItem.setName(updatedItem.getName());
        //update the data base
        session.update(currentItem);
    }
}
