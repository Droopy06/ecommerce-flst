package com.rizomm.ecommerce.model;

import javax.persistence.*;

import static com.rizomm.ecommerce.model.Item.FIND_ALL;

/**
 * Created by LAMOOT Alexandre on 17/11/2016.
 */
@Entity
@Table(name = "article")
@NamedQuery(name = FIND_ALL, query = "SELECT a FROM Item a JOIN a.category b")
public class Item {

    // ======================================
    // =             Constants              =
    // ======================================
    public static final String FIND_ALL = "article.getAllArticles";

    // ======================================
    // =             Attributes             =
    // ======================================

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private double price;
    private String description;
    private String image;
    private Integer qte;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Category_id")
    private Category category;

    public Item() {
    }

    public Item(String name, double price, String description, String image, int qte) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
        this.qte = qte;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
