package com.rizomm.ecommerce.Controller;

import com.rizomm.ecommerce.dao.ItemDaoImpl;
import com.rizomm.ecommerce.factory.ItemFactory;
import com.rizomm.ecommerce.model.Item;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.List;

/**
 * Created by ISEN on 07/01/2017.
 */
@RequestScoped
@Named
public class ItemController {
    @EJB
    ItemDaoImpl items;

    public String viewAllItems(){
        return "produits.xhtml";
    }

    public List<Item> getItemList(){
        return ItemFactory.getAllItems();
    }
}
