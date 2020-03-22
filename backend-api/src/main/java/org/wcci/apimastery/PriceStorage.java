package org.wcci.apimastery;


import org.wcci.apimastery.Classes.Price;
import org.wcci.apimastery.Classes.Stock;

import java.util.Collection;
import java.util.Date;

public interface PriceStorage {
    Collection<Price> findAllPrices();

    Price findStockPriceOnDate(Date d, Stock s);

    void store(Price price);

}
