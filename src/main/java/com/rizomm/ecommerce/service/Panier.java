package com.rizomm.ecommerce.service;

import com.rizomm.ecommerce.model.Item;
import com.rizomm.ecommerce.model.OrderLine;
import com.sun.xml.ws.developer.Stateful;

import javax.ejb.Remote;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ISEN on 07/01/2017.
 */
@Stateful
@Remote
public class Panier implements Serializable {
    private List<OrderLine> items = new ArrayList<OrderLine>();
    public void addArticle(Item it)
    {
        if(items.size()> 0) {
            for (OrderLine lc:items)
                if (lc.getItem() == it)
                {
                    lc.setQuantity(lc.getQuantity()+1);
                    lc.setPrice(lc.getPrice()+it.getPrice());
                    return;
                }
        }
            OrderLine lc = new OrderLine();
            lc.setItem(it);
            lc.setQuantity(it.getQuantity());
            lc.setPrice(it.getPrice());
             items.add(lc);

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
    public void viderPanier(){
        items.clear();
    }
}

