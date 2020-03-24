package org.wcci.apimastery.Classes;


import org.springframework.boot.CommandLineRunner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    private long id;

    private String text;

    private Date date;

    @ManyToOne
    private Sector sector;

    @ManyToOne
    private Stock stock;

    @ManyToOne
    private Price price;

    public String getText(){
        return text;
    }

    public Comment(String text){
        this.text= text;
    }
    public long getId(){
        return id;
    }
    public Comment(){

    }
    public Sector getSector(){
        return sector;
    }
    public Stock getStock(){
        return stock;
    }
    public Price getPrice(){
        return price;
    }
}
