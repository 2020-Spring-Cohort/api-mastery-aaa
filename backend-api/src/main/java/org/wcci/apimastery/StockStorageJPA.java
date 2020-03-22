package org.wcci.apimastery;

import org.springframework.stereotype.Service;

@Service
public class StockStorageJPA implements StockStorage {

    StockRepository stockRepository;

    public StockStorageJPA(StockRepository stockRepo){
        this.stockRepository = stockRepo;

    }
}
