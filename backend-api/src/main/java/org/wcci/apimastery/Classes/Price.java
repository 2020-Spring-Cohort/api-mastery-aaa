package org.wcci.apimastery.Classes;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Price {


    private Date date;

    @Id
    @GeneratedValue
    Long id;


    private float lowPrice;
    private float highPrice;
    private float openPrice;
    private float closePrice;
    private float volume;


    @ManyToOne
    private Stock stock;

    protected Price(){
    }

    public Date getDate() {
        return date;
    }

    public Stock getStock() {
        return stock;
    }

    public Price(Stock stock, Date date){
        this.stock = stock;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Price)) return false;

        Price price = (Price) o;

        if (getDate() != null ? !getDate().equals(price.getDate()) : price.getDate() != null) return false;
        if (id != null ? !id.equals(price.id) : price.id != null) return false;
        return getStock() != null ? getStock().equals(price.getStock()) : price.getStock() == null;
    }

    @Override
    public int hashCode() {
        int result = getDate() != null ? getDate().hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (getStock() != null ? getStock().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Price{" +
                "date=" + date +
                ", id=" + id +
                ", lowPrice=" + lowPrice +
                ", highPrice=" + highPrice +
                ", openPrice=" + openPrice +
                ", closePrice=" + closePrice +
                ", volume=" + volume +
                ", stock=" + stock +
                '}';
    }
}
