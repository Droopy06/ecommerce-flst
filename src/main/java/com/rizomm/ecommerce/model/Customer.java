package com.rizomm.ecommerce.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ISEN on 15/12/2016.
 */
@Entity
@Table(name = "Clients")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String adress;
    private String mail;
    private String phoneNumer;
    @OneToMany(mappedBy = "idClient")
    private List<Order> order;

    public Customer() {
    }

    public Customer(String name, String surname, String mail, String phoneNumer) {
        this.surname = surname;
        this.surname = surname;
        this.mail = mail;
        this.phoneNumer = phoneNumer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumer() {
        return phoneNumer;
    }

    public void setPhoneNumer(String phoneNumer) {
        this.phoneNumer = phoneNumer;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }
}
