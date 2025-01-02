package com.cn.cnkart.service;

import com.cn.cnkart.dal.ItemDetailsDal;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemDetailsService {

    @Autowired
    ItemDetailsDal itemDetailsDal;

    @Transactional
    public void delete(int id) {
        itemDetailsDal.delete(id);
    }
}
