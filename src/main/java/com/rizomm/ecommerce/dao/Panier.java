package com.rizomm.ecommerce.dao;

import com.rizomm.ecommerce.model.Item;
import com.rizomm.ecommerce.model.OrderLine;

import java.io.Serializable;
import java.util.*;


/**
 * Created by ISEN on 15/12/2016.
 */
public class Panier implements Serializable{
    private List<OrderLine> items = new ArrayList<OrderLine>();
    public void addArticle(Item it, int quantite)
    {
       if(items.get(it.getIdItem())== null) {
           OrderLine lc = new OrderLine();
           lc.setItem(it);
           lc.setQuantity(quantite);
           lc.setPrice(it.getPrice());
       }
       else{
           OrderLine lc = items.get(it.getIdItem());
           lc.setQuantity(quantite);
       }
    }
    public List<OrderLine> getItems(){
        return items;

    }
    public  double getTotal(){
        double tot =0;
        for (OrderLine lc:items){
            tot+=lc.getPrice()*lc.getQuantity();
        }
        return tot;

    }
    public int getSize(){
        return items.size();
    }
    public void delete(OrderLine lgncmd){
        items.remove(lgncmd);
    }
}
