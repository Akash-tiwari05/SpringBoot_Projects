package com.cn.cnkart.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    private ItemDetails itemDetails;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
   // @JoinColumn(name="item_id") due to by directional i don't need to tell it
    @JsonManagedReference
    private List <ItemReview> itemReview;

    @ManyToMany(mappedBy ="items")
    @JsonIgnore
    private List<Order> order;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ItemDetails getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(ItemDetails itemDetails) {
        this.itemDetails = itemDetails;
    }

    public List<ItemReview> getItemReview() {
        return itemReview;
    }

    public void setItemReview(List<ItemReview> itemReview) {
        this.itemReview = itemReview;
    }
}
