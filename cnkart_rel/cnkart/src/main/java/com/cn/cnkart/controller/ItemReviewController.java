package com.cn.cnkart.controller;

import com.cn.cnkart.entity.ItemReview;
import com.cn.cnkart.service.ItemReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/review")
public class ItemReviewController {

    @Autowired
    ItemReviewService itemReviewService;

    @PostMapping("/save")
    public void save(@RequestBody ItemReview review){
        itemReviewService.save(review);
    }
}
