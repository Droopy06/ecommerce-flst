package com.rizomm.ecommerce.model;

import com.rizomm.ecommerce.model.Category;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2016-11-17T16:10:12")
@StaticMetamodel(Article.class)
public class Article_ { 

    public static volatile SingularAttribute<Article, String> image;
    public static volatile SingularAttribute<Article, Integer> qte;
    public static volatile SingularAttribute<Article, Double> price;
    public static volatile SingularAttribute<Article, String> name;
    public static volatile SingularAttribute<Article, String> description;
    public static volatile SingularAttribute<Article, Integer> id;
    public static volatile SingularAttribute<Article, Category> category;

}