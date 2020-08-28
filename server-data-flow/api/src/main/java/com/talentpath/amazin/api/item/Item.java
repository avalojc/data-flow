package com.talentpath.amazin.api.item;
import java.util.ArrayList;

//this is the class Item. Here is where we set up the schema. This entity contains the constructors, getters, and setters.
// for the sake of simplicity we have limited the class to only have two variables.
public class Item {
    private Long id;
    private String data;

    public Item(){

    }

    public Item(long id, String data){
        super();
        this.id = id;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


}