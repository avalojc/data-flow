package com.talentpath.amazin.api.item;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;

//The @CrossOrigin annotation allows the client to interact with our server. ie enables cross origin resource sharing
@CrossOrigin(origins = { "http://localhost:3000" })
@RestController //The @RestController is an annotation that combines @Controller and @ResponseBody.
                //Allows this component to be autodetected as a controller and indicates that the methods are bound to the web response body
public class ItemResource {

    //this is where we "connect" or autowire the service to the resource.
    @Autowired
    private ItemHardcodedService itemManagementService;

    //Get mapping is shorthand for @RequestMapping(method = RequestMethod.GET). This is used for mapping web requests onto methods in request-handling classes
    @GetMapping("/item")
    public List<Item> getAllItems() {
        return itemManagementService.findAll();  // by using the itemManagementService we are able to invoke
                                                        // the find all method we created in that ItemHardcodedService
                                                        // Now when we go to http://localhost:8080/item/ we will
                                                        // see the data we coded being served as json.
    }

    @GetMapping("/item/{id}")
    public Item getItem( @PathVariable long id) {
        return itemManagementService.findById(id); // much like the method getAllItems, when we go to
                                                        // http://localhost:8080/item/1 we will see the data we
                                                        // coded being served as json but instead of the entire list we
                                                        // one Item with the id of 1.
    }

    //This resource is where we can code the resource portion of remaining CRUD(postmapping, puttmapping, deletemapping, and so on).
    // But for the sake of focusing on how data flows. Lets stick to just these two methods for now.
}