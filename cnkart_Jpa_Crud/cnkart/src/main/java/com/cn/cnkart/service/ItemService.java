package com.cn.cnkart.service;


import com.cn.cnkart.dal.ItemRepository;
import com.cn.cnkart.entity.Item;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public Item getItemById(int id) {
        return itemRepository.findById(id).get();//basically get fetching optional
    }


    public void saveItem(Item item)
    {
        itemRepository.save(item);
    }


    public void delete(int id)
    {
        itemRepository.deleteById(id);
    }


    public void update(Item updatedItem)
    {
        itemRepository.save(updatedItem);
    }

    public List<Item> getItem() {
        List<Item> itemList = new ArrayList<>();
        itemRepository.findAll().forEach(item->itemList.add(item));
        return itemList;
    }
}
