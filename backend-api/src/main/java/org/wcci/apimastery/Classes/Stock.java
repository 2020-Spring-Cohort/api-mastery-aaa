package org.wcci.apimastery.Classes;


import javax.persistence.*;
import java.util.Collection;

@Entity
public class Stock {

    private String name;
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Sector sector;
    @OneToMany(mappedBy = "stock")
    private  Collection<Price> prices;
    @OneToMany(mappedBy = "sector")
    Collection<Stock> stocks;

    public Stock(String name, Sector sector){
        this.name = name;
        this.sector = sector;
    }
    protected Stock(){
     }
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
     public Collection<Stock>getStocks(){
        return  stocks;
     }
}
