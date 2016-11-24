package com.rizomm.ecommerce.dao;

import com.rizomm.ecommerce.model.Item;

import java.util.List;

/**
 * Created by LAMOOT Alexandre on 17/11/2016.
 */
public interface ItemDao {

    List<Item> getAllArticles();
    Item getArticleById(int id);
    Item createArticle(Item item);
    void deleteArticle(Item item);
    Item updateArticle(Item item);
}
