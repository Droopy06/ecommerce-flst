package com.rizomm.ecommerce.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by LAMOOT Alexandre on 17/11/2016.
 */
@Entity
@Table(name = "Commandes")
public class Order {
    @Id
    @GeneratedValue
    private Long idOrder;
    private Date OrderDate;
    @OneToMany(mappedBy = "idOrder")
    private List<OrderLine> items;
    @ManyToOne
    @JoinColumn(name = "idCustomer")
    private Customer customer;

    public Order() {
    }

    public Order(Date orderDate) {
        OrderDate = orderDate;
    }

    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date orderDate) {
        OrderDate = orderDate;
    }

    public List<OrderLine> getItems() {
        return items;
    }

    public void setItems(List<OrderLine> items) {
        this.items = items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
