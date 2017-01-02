package com.rizomm.ecommerce.service;

import com.rizomm.ecommerce.dao.CategoryDao;
import com.rizomm.ecommerce.model.Category;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by LAMOOT Alexandre on 02/01/2017.
 */
@Stateless
@Remote
public class CategoryServiceImpl implements CategoryService {

    @Inject
    CategoryDao categoryDao;

    public List<Category> getAllService() {
        return categoryDao.getAllCategories();
    }

    public Category getCategoryById(int id) {
        return categoryDao.getCategoryById(id);
    }

    public Category saveCategory(Category category) {
        return categoryDao.createCategory(category);
    }

    public Category updateCategory(Category category) {
        return categoryDao.updateCategory(category);
    }

    public void deleteCategory(int id) {
        Category category = categoryDao.getCategoryById(id);
        categoryDao.deleteCategory(category);
    }
}
