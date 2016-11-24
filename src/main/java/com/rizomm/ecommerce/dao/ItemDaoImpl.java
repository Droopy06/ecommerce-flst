package com.rizomm.ecommerce.dao;

import com.rizomm.ecommerce.model.Item;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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

    public Item getArticleById(int id) {
        return em.find(Item.class, id);
    }

    public Item createArticle(Item item) {
        em.persist(item);
        return item;
    }

    public void deleteArticle(Item item) {
        em.remove(em.merge(item));
    }

    public Item updateArticle(Item item) {
        return em.merge(item);
    }
}
