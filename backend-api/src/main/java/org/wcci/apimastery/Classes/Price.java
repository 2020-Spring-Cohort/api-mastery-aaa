package org.wcci.apimastery.Classes;


import javax.persistence.*;
import java.sql.Date;

@Entity
public class Price {

    @Id
    private Date date;

    @GeneratedValue
    private Long id;

    public Stock getStock() {
        return stock;
    }

    @ManyToOne
    private Stock stock;

    public Price(Stock stock, Date date){
        this.date = date;
        this.stock = stock;
    }
    private float lowPrice;
    private float highPrice;
    private float openPrice;
    private float closePrice;

    private float volume;

    protected Price(){}

    public Date getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Price)) return false;

        Price price = (Price) o;

        if (Float.compare(price.lowPrice, lowPrice) != 0) return false;
        if (Float.compare(price.highPrice, highPrice) != 0) return false;
        if (Float.compare(price.openPrice, openPrice) != 0) return false;
        if (Float.compare(price.closePrice, closePrice) != 0) return false;
        if (Float.compare(price.volume, volume) != 0) return false;
        if (getDate() != null ? !getDate().equals(price.getDate()) : price.getDate() != null) return false;
        if (id != null ? !id.equals(price.id) : price.id != null) return false;
        return getStock() != null ? getStock().equals(price.getStock()) : price.getStock() == null;
    }

    @Override
    public int hashCode() {
        int result = getDate() != null ? getDate().hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (getStock() != null ? getStock().hashCode() : 0);
        result = 31 * result + (lowPrice != +0.0f ? Float.floatToIntBits(lowPrice) : 0);
        result = 31 * result + (highPrice != +0.0f ? Float.floatToIntBits(highPrice) : 0);
        result = 31 * result + (openPrice != +0.0f ? Float.floatToIntBits(openPrice) : 0);
        result = 31 * result + (closePrice != +0.0f ? Float.floatToIntBits(closePrice) : 0);
        result = 31 * result + (volume != +0.0f ? Float.floatToIntBits(volume) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Price{" +
                "date=" + date +
                ", id=" + id +
                ", stock=" + stock +
                ", lowPrice=" + lowPrice +
                ", highPrice=" + highPrice +
                ", openPrice=" + openPrice +
                ", closePrice=" + closePrice +
                ", volume=" + volume +
                '}';
    }
}
