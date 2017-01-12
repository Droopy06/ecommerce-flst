package com.rizomm.ecommerce.api;

import com.rizomm.ecommerce.factory.ItemFactory;
import com.rizomm.ecommerce.model.Item;
import com.rizomm.ecommerce.service.ItemService;
import com.rizomm.ecommerce.service.ItemServiceImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.List;

/**
 * Created by LAMOOT Alexandre on 02/01/2017.
 */
@Path("ecommerce/item")
public class ItemRestService {

    @Context
    private UriInfo uriInfo;
    private ItemService itemService = new ItemServiceImpl();
    private List<Item> itemList;

    public ItemRestService() {
        itemList = ItemFactory.getAllItems();
    }

    @GET
    public List<Item> getAllItems(){
        return itemList;
        //return itemService.getAllService();
    }

    @GET
    @Path("/{id : \\d+}")
    public Item getItemById(@PathParam("id") String id){
        System.out.println("get category: " + id);
        int idItem = Integer.parseInt(id);
        return itemList.get(idItem);
        //return itemService.getItemById(idItem);
    }

    @POST
    public Response createItem(Item item){
        //itemService.saveItem(item);
        itemList.add(item);
        URI itemUri = uriInfo.getAbsolutePathBuilder().path(item.getIdItem().toString()).build();
        return Response.created(itemUri).build();
    }

    @PUT
    public Response updateCategory(Item item){
        //itemService.updateItem(item);
        URI categoryUri = uriInfo.getAbsolutePathBuilder().path(item.getIdItem().toString()).build();
        return Response.created(categoryUri).build();
    }

    @DELETE
    @Path("/{id : \\d+}")
    public Response deleteCategoryById(@PathParam("id") String id){
        System.out.println("deleteCategory : " + id);
        int idItem = Integer.parseInt(id);
        itemList.remove(idItem);
        //itemService.deleteArticle(idItem);
        return Response.noContent().build();
    }

}
