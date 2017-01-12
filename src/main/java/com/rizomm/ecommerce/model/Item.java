package com.rizomm.ecommerce.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by ISEN on 07/01/2017.
 */
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idItem;
    private String designation;
    private String description;
    private String picture;
    private Long quantity;
    @NotNull
    @Min(value = 0)
    private Double price;
    @ManyToOne
    @JoinColumn(name = "categorieId")
    private Category category;

    public Item() {
    }

    public Item(String designation, String description, Long quantity, Double price) {
        this.designation = designation;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public Item(String designation, String description, String picture, Long quantity, Double price) {
        this.designation = designation;
        this.description = description;
        this.picture = picture;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getIdItem() {
        return idItem;
    }

    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
