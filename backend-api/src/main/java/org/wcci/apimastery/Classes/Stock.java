package org.wcci.apimastery.Classes;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@Entity
public class Stock {

    private String name;

    @Id
    @GeneratedValue
    private long id;

    @JsonIgnore
    @ManyToOne
    private Sector sector;

    //these are historical prices in their own class tied to a stock

    @OneToMany(mappedBy = "stock")
    private Collection<Price> prices;

    //this is a single price which fluctuates in the day, does not get saved
    private float var_price;

    public Stock(String name, Sector sector){
        this.name = name;
        this.sector = sector;
    }


    protected Stock(){}


     public String getName(){
        return name;
     }
     public Long getId(){
        return id;
     }
     public Sector getSector(){
        return sector;
     }

     public Collection<Price> getPrices(){
        return prices;
     }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", sector=" + sector +
                ", var_price=" + var_price +
                '}';
    }
}
