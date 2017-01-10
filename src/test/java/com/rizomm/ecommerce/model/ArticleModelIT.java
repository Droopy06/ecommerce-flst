package com.rizomm.ecommerce.model;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by LAMOOT Alexandre on 17/11/2016.
 */
public class ArticleModelIT extends AbstractPersistentTest  {

    @Test
    public void shouldFindACustomer() throws Exception{
        Item item = new Item("designationProd1","Description Produit1",100L,1800D);
        Category category = new Category("category 1","Description of category 1","family 1");
        item.setCategory(category);
        tx.begin();
        em.persist(item);
        em.persist(category);
        tx.commit();

        assertNotNull(item.getIdItem());
        assertNotNull(category.getId());
        // Clear
        em.clear();

        item = em.find(Item.class, item.getIdItem());
        assertNotNull(item);
    }
}
