package org.wcci.apimastery.Classes;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Sector {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "sector")
    Collection<Stock> stocks;


    private String name;

    protected Sector(){
    }
    public Sector(String name){
        this.name = name;
    }
    public Long getId(){
        return id;
    }
    public Collection<Stock> getStocks(){
        return stocks;
    }
    public String getName(){
        return name;
    }

}
