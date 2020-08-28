package com.talentpath.amazin.api.item;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

//This is our service. The data is hardcoded because we want to focus on routes and how they work


//The service annotation is used to mark the class as a service so that Spring can autodetect it
@Service
public class ItemHardcodedService { //class declaration

    //this is creating the list of <Item>s and naming this list "ListOfOurItems"
    private static List<Item> ListOfOurItems = new ArrayList<>();

    //here we are adding 3 Items to the ListOfOurItems list.
    static {
        ListOfOurItems.add(new Item(1L, "Data1")); //Since this is hardcoded data, here is where we create the info
        ListOfOurItems.add(new Item(2L, "Data2")); //as you can see, we are hardcoding our id and our data
        ListOfOurItems.add(new Item(3L, "Data3")); //we can add as many objects as we want but for simplicity I added 3
    }

    //this method findAll(), returns a list of <Item>es.
    // Specifically it returns the entire list "ListOfOurItems", the hardcoded data we created above in lines 16-23
    public List<Item> findAll() {
        return ListOfOurItems;
    }

    //This method findById(id) does just that.
    //It loops through the list we created and with each iteration it checks to see if the id of the Item.id matches the id we ***gave it*** in the method.
    public Item findById(long id) {
        for (Item Item : ListOfOurItems) {
            if (Item.getId() == id) {
                return Item;
            }
        }
        return null;
    }
    //This service is where we can code the service portion of remaining CRUD. But for the sake of focusing
    // on how data flows. Lets stick to just these two methods for now.

}