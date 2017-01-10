package com.rizomm.ecommerce.service;

import com.rizomm.ecommerce.model.Item;
import com.rizomm.ecommerce.model.OrderLine;
import com.sun.xml.ws.developer.Stateful;

import javax.ejb.Remote;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LAMOOT Alexandre on 07/01/2017.
 */
public interface PanierService{
    public void addItem(Item it);
    public List<OrderLine> getItems();
    public  double getTotal();
    public int getSize();
    public void delete(OrderLine orderLine);
    public void clearPannier();
}

