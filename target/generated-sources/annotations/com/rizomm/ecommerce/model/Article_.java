package com.rizomm.ecommerce.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2016-11-17T17:21:54")
@StaticMetamodel(Item.class)
public class Article_ { 

    public static volatile SingularAttribute<Item, String> image;
    public static volatile SingularAttribute<Item, Integer> qte;
    public static volatile SingularAttribute<Item, Double> price;
    public static volatile SingularAttribute<Item, String> name;
    public static volatile SingularAttribute<Item, String> description;
    public static volatile SingularAttribute<Item, Integer> id;
    public static volatile SingularAttribute<Item, Category> category;

}