package com.rizomm.ecommerce.api;

import com.rizomm.ecommerce.model.Category;
import com.rizomm.ecommerce.service.CategoryService;
import com.rizomm.ecommerce.service.CategoryServiceImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.List;

/**
 * Created by LAMOOT Alexandre on 02/01/2017.
 */
@Path("ecommerce/category")
public class CategoryRestService {

    @Context
    private UriInfo uriInfo;
    private CategoryService categoryService = new CategoryServiceImpl();

    @GET
    public List<Category> getAllCategory(){
        return categoryService.getAllService();
    }

    @GET
    @Path("/{id : \\d+}")
    public Category getCategoryById(@PathParam("id") String id){
        System.out.println("get category: " + id);
        int idCategory = Integer.parseInt(id);
        return categoryService.getCategoryById(idCategory);
    }

    @POST
    public Response createCategory(Category category){
        categoryService.saveCategory(category);
        URI categoryUri = uriInfo.getAbsolutePathBuilder().path(category.getId().toString()).build();
        return Response.created(categoryUri).build();
    }

    @PUT
    public Response updateCategory(Category category){
        categoryService.saveCategory(category);
        URI categoryUri = uriInfo.getAbsolutePathBuilder().path(category.getId().toString()).build();
        return Response.created(categoryUri).build();
    }

    @DELETE
    @Path("/{id : \\d+}")
    public Response deleteCategoryById(@PathParam("id") String id){
        System.out.println("deleteCategory : " + id);
        int idCategory = Integer.parseInt(id);
        categoryService.deleteCategory(idCategory);
        return Response.noContent().build();
    }

}
