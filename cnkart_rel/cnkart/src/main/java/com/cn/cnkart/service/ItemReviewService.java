package com.cn.cnkart.service;

import com.cn.cnkart.dal.ItemReviewDal;
import com.cn.cnkart.entity.ItemReview;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemReviewService {

    @Autowired
    ItemReviewDal itemReviewDal;

     @Transactional
    public void save(ItemReview review) {
       itemReviewDal.save(review);
    }
}
