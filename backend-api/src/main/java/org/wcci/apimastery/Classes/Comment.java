package org.wcci.apimastery.Classes;


import org.springframework.boot.CommandLineRunner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    private long id;
    public long getId(){
        return id;
    }
    private String text;
    @ManyToOne
    private Sector sector;
    @ManyToOne
    private Stock stock;
    @ManyToOne
    private Price price;

    public String getText(){
        return text;
    }
    public Comment(String text, Sector sector,Stock stock,Price price){
        this.text= text;
        this.sector= sector;
        this.stock=stock;
        this.price=price;
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
