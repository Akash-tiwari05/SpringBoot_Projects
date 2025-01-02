package com.cn.cnkart.service;


import com.cn.cnkart.dal.ItemDal;
import com.cn.cnkart.entity.Item;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    ItemDal itemDal;

    @Transactional
    public Item getItemById(int id) {
        return itemDal.getByID(id);
    }

    @Transactional
    public void saveItem(Item item)
    {
        itemDal.save(item);
    }

    @Transactional
    public void delete(int id) {
        itemDal.delete(id);
    }

    @Transactional
    public void update(Item updatedItem) {
        itemDal.update(updatedItem);
    }
}
