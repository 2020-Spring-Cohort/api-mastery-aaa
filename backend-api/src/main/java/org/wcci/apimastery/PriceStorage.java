package org.wcci.apimastery;


import org.wcci.apimastery.Classes.Price;

import java.util.Collection;

public interface PriceStorage {
    Collection<Price> findAllPrices();

    void store(Price price);

}
