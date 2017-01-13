package com.rizomm.ecommerce.api;

import com.rizomm.ecommerce.model.Item;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.xml.bind.JAXBException;
import java.net.URI;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lamoot Alexandre on 12/01/2017.
 */
public class ItemRestServiceIT {
    private static URI uri = UriBuilder.fromUri("http://localhost/ecommerce-1.0/ecommerce/rest/item").port(8080).build();
    private static Client client = ClientBuilder.newClient();

    @Test
    public void shouldCreateAndDeleteAItem() throws JAXBException {

        Item item = new Item("clef usb","clef usb 4 GO","usb.png",10L,13.25);

        // POSTs a Item
        Response response = client.target(uri).request().post(Entity.entity(item, MediaType.APPLICATION_JSON));
        assertEquals(Response.Status.CREATED.getStatusCode(), response.getStatus());
        URI itemURI = response.getLocation();

        // With the location, GETs the Item
        response = client.target(itemURI).request().get();
        item = response.readEntity(Item.class);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals("clef usb 4 GO", item.getDescription());

        // Gets t
        // he Item id and DELETEs it
        String itemId = itemURI.toString().split("/")[6];
        response = client.target(uri).path(itemId).request().delete();
        assertEquals(Response.Status.NO_CONTENT.getStatusCode(), response.getStatus());

        // GETs the Item and checks it has been deleted
        response = client.target(itemURI).request().get();
        assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());

    }

    @Test
    public void shouldNotCreateANullItem() throws JAXBException {

        // POSTs a Null Book
        Response response = client.target(uri).request().post(Entity.entity(null, MediaType.APPLICATION_JSON));
        assertEquals(Response.Status.BAD_REQUEST.getStatusCode(), response.getStatus());
    }

    @Test
    public void shouldNotFindTheItemID() throws JAXBException {

        // GETs a Book with an unknown ID
        Response response = client.target(uri).path("invalidID").request().get();
        assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
    }
}
