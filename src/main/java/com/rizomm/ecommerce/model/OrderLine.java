package com.rizomm.ecommerce.model;

import javax.persistence.*;

/**
 * Created by ISEN on 15/12/2016.
 */
@Entity
@Table(name = "LigneCommandes")
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idOrderLine;
    private int quantity;
    private double price;
    @ManyToOne
    @JoinColumn(name = "idItem")
    private Item item;

    public OrderLine() {
    }

    public OrderLine(int quantity, double price, Item item) {
        this.quantity = quantity;
        this.price = price;
        this.item = item;
    }

    public Long getIdOrderLine() {
        return idOrderLine;
    }

    public void setIdOrderLine(Long idOrderLine) {
        this.idOrderLine = idOrderLine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
