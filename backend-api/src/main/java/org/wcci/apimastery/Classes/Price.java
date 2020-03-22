package org.wcci.apimastery.Classes;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Price {

    @Id
    @GeneratedValue
    private Long id;
    private Date date;
    private float price;
    private Sector sector;

    @ManyToOne
    private Stock stock;

    protected Price(){
    }

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Stock getStock() {
        return stock;
    }

    public float getPrice() {
        return price;
    }

    public Sector getSector() {
        return sector;
    }

    public Price(Long price, Sector sector, Stock stock, Date date){
        this.price = price;
        this.sector = sector;
        this.stock = stock;
        this.date = date;

    }
}
