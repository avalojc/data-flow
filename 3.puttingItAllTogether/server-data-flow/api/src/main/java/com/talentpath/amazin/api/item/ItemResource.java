package com.talentpath.amazin.api.item;

import java.util.List;

import com.talentpath.amazin.api.item.ItemRepository;
import java.util.Optional;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    private ItemRepository itemRepository;

    //Get mapping is shorthand for @RequestMapping(method = RequestMethod.GET). This is used for mapping web requests onto methods in request-handling classes
    @GetMapping("/item/")
    @Query("SELECT * FROM jca00")
    public List<Item> getAllItems() {
        return (List<Item>) itemRepository.findAll();
    }
    
    
    

    @GetMapping("/item/{id}")
    @Query("SELECT * FROM jca00 WHERE itemid = :itemid")
    public Optional<Item> getItemById(@PathVariable("itemid") long itemid){
        return itemRepository.findById(itemid);
    }

    //This resource is where we can code the resource portion of remaining CRUD(postmapping, puttmapping, deletemapping, and so on).
    // But for the sake of focusing on how data flows. Lets stick to just these two methods for now.
}