package com.rizomm.ecommerce.service;

import com.rizomm.ecommerce.model.Item;

import javax.ejb.Remote;
import java.util.List;

/**
 * Created by LAMOOT Alexandre on 17/11/2016.
 */
@Remote
public class ItemServiceImpl implements ItemService {

    public List<Item> getAllService() {
        return null;
    }

    public void saveArticle(Item item) {

    }

    public void deleteArticle(Item item) {

    }
}
