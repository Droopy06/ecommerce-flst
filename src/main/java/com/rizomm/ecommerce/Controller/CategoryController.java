package com.rizomm.ecommerce.Controller;

import com.rizomm.ecommerce.dao.CategoryDaoImpl;
import com.rizomm.ecommerce.model.Category;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.List;

/**
 * Created by ISEN on 07/01/2017.
 */
@RequestScoped
@Named
public class CategoryController {
    private Category categorie = new Category();

    public Category getCategorie() {
        return categorie;
    }

    public void setCategorie(Category categorie) {
        this.categorie = categorie;
    }
    @EJB
    CategoryDaoImpl cat;
    public String saveCategory(){
        cat.createCategory(getCategorie());
        return "categories.xhtml";
    }
public List<Category> GetAllCat(){
    return cat.getAllCategories();

}

}
