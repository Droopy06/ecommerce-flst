package com.rizomm.ecommerce.dao;

import com.rizomm.ecommerce.model.Customer;
import com.rizomm.ecommerce.model.Order;
import com.rizomm.ecommerce.model.OrderLine;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;

/**
 * Created by ISEN on 31/12/2016.
 */
@Local
@Stateless
public class OrderDaoImpl implements OrderDao {
    @PersistenceContext(unitName = "ecommercePU")
    protected EntityManager em;

    public Order saveOrder(Panier p, Customer client){
    em.persist(client);
        Order cmd = new Order();
        cmd.setOrderDate(new Date());
        cmd.setCustomer(client);
        cmd.setItems(p.getItems());
        for (OrderLine lc : p.getItems()){
            em.persist(lc);
        }
        em.persist(cmd);
        return cmd;

    }

}
