package com.cn.cnkart.dal;

import com.cn.cnkart.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {

}
