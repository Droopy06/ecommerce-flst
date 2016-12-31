package com.rizomm.ecommerce.dao;

import com.rizomm.ecommerce.model.Category;
import com.rizomm.ecommerce.model.Item;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
import static com.rizomm.ecommerce.model.Item.*;


/**
 * Created by LAMOOT Alexandre on 17/11/2016.
 */
@Local
@Stateless
public class ItemDaoImpl implements ItemDao {

    @PersistenceContext(unitName = "ecommercePU")
    protected EntityManager em;

    public List<Item> getAllArticles() {
        TypedQuery<Item> query = em.createNamedQuery(FIND_ALL, Item.class);
        em.joinTransaction();
        return query.getResultList();
    }

    public List<Item> getArticlesByCategory(Category cat) {
        Query req = em.createQuery("select p from Articles p where p.category.id =:x");
        req.setParameter("x",cat.getId());
        return req.getResultList();
    }

    public List<Item> getArticlesByKeyWord(String keyWord) {

        Query req = em.createQuery("select p from Articles p where p.name like:x or p.description like :x");
        req.setParameter("x","%+keyWord+%");
        return req.getResultList();
    }

    public Item getArticleById(int id) {
        return em.find(Item.class, id);
    }

    public Item createArticle(Item item, Category cat) {
        item.setCategory(cat);
        em.persist(item);
        return item;
    }

    public Item createArticle(Item item) {
        em.persist(item);
        return item;
    }

    public void deleteArticle(Item item)
    {
        em.remove(em.merge(item));
    }

    public Item updateArticle(Item item) {
        em.merge(item);
        return getArticleById(item.getIdItem());
    }
}
