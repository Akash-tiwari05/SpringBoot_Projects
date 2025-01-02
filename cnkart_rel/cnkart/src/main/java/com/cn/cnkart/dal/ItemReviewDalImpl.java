package com.cn.cnkart.dal;

import com.cn.cnkart.entity.ItemReview;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ItemReviewDalImpl implements ItemReviewDal{

    @Autowired
    EntityManager entityManager;

    @Override
    public void save(ItemReview review) {
        Session session = entityManager.unwrap(Session.class);
        session.save(review);
    }
}
