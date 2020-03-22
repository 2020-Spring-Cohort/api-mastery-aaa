package org.wcci.apimastery.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.HashSet;


public class Stock {
    public Stock(){};


    private Long id;

    //this is the current price updated in real time
    private float var_price;

    //These are for price index such as historical prices

    Collection<Price> prices;

    public Stock(String title){
        this.title = title;
        prices = new HashSet<>();

    }

    private String title;
    private String description;



}
