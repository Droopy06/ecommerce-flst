package com.rizomm.ecommerce.model;

import javax.persistence.*;

import static com.rizomm.ecommerce.model.Category.*;

/**
 * Created by LAMOOT Alexandre on 17/11/2016.
 */
@Entity
@Table(name = "categorie")
@NamedQuery(name = FIND_ALL_CATEGORIES, query = "SELECT c FROM Category c")
public class Category {

    // ======================================
    // =             Constants              =
    // ======================================
    public static final String FIND_ALL_CATEGORIES = "category.getAllCategories";

    // ======================================
    // =             Attributes             =
    // ======================================

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;
    private String family;

    public Category() {
    }

    public Category(String name, String description, String family) {
        this.name = name;
        this.description = description;
        this.family = family;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
