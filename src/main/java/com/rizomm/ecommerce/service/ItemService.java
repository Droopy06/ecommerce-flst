package com.rizomm.ecommerce.service;

import com.rizomm.ecommerce.model.Item;

import java.util.List;

/**
 * Created by LAMOOT Alexandre on 17/11/2016.
 */
public interface ItemService {
    List<Item> getAllService();
    void saveArticle(Item item);
    void deleteArticle(Item item);
}
