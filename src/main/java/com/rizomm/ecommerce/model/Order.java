package com.rizomm.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by LAMOOT Alexandre on 17/11/2016.
 */
@Entity
@Table(name = "commande")
public class Order {
    @Id
    @GeneratedValue
    private Integer id;
    private List<Item> items;
    private String email;
}
