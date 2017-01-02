package com.rizomm.ecommerce.service;

import com.rizomm.ecommerce.model.Category;

import java.util.List;

/**
 * Created by LAMOOT Alexandre on 02/01/2017.
 */
public interface CategoryService {
    List<Category> getAllService();
    Category getCategoryById(int id);
    Category saveCategory(Category category);
    Category updateCategory(Category category);
    void deleteCategory(int id);
}
