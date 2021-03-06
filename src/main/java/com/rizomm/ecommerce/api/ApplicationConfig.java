package com.rizomm.ecommerce.api;

import com.rizomm.ecommerce.service.CategoryService;
import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("rest")
public class ApplicationConfig extends Application {

  // ======================================
  // =             Attributes             =
  // ======================================

  private final Set<Class<?>> classes;

  // ======================================
  // =            Constructors            =
  // ======================================

  public ApplicationConfig() {
    HashSet<Class<?>> c = new HashSet<>();
    c.add(CategoryService.class);
    c.add(ItemRestService.class);

    c.add(MOXyJsonProvider.class);

    classes = Collections.unmodifiableSet(c);
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  @Override
  public Set<Class<?>> getClasses() {
    return classes;
  }

}