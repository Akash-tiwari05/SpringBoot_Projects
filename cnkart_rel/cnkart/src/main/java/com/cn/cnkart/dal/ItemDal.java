package com.cn.cnkart.dal;

import com.cn.cnkart.entity.Item;

public interface ItemDal {

    Item getByID(int id);

    void save(Item item);

    void delete(int id);

    void update(Item udatedItem);
}
