package com.rizomm.ecommerce.dao;

import com.rizomm.ecommerce.model.Category;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
import static com.rizomm.ecommerce.model.Category.FIND_ALL_CATEGORIES;

/**
 * Created by LAMOOT Alexandre on 17/11/2016.
 */
@Local
@Stateless
public class CategoryDaoImpl implements CategoryDao {

    @PersistenceContext(unitName = "ecommercePU")
    protected EntityManager em;

    public List<Category> getAllCategories() {
        TypedQuery<Category> query = em.createNamedQuery(FIND_ALL_CATEGORIES, Category.class);
        em.joinTransaction();
        return query.getResultList();
    }

    public Category getCategoryById(int id) {
        return em.find(Category.class,id);
    }

    public Category createCategory(Category category) {
        em.persist(category);
        return category;
    }

    public void deleteCategory(Category category) {
        em.remove(category);

    }

    public void updateCategory(Category category) {
        em.merge(category);
    }
}
