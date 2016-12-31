package com.rizomm.ecommerce.dao;

import com.rizomm.ecommerce.model.Category;
import com.rizomm.ecommerce.model.Item;

import java.util.List;

/**
 * Created by LAMOOT Alexandre on 17/11/2016.
 */
public interface ItemDao {

    List<Item> getAllArticles();
    List<Item> getArticlesByCategory(Category cat);
    List<Item> getArticlesByKeyWord(String keyWord);
    Item getArticleById(int id);
    Item createArticle(Item item, Category cat);
    void deleteArticle(Item item);
    Item updateArticle(Item item);

}
