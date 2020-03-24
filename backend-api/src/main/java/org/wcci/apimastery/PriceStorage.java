package org.wcci.apimastery;


import org.wcci.apimastery.Classes.Price;
import org.wcci.apimastery.Classes.Stock;

import java.util.Collection;
import java.sql.Date;

public interface PriceStorage {
    Collection<Price> findAllPrices();



    void store(Price price);

}
