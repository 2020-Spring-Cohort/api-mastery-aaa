package org.wcci.apimastery.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wcci.apimastery.Classes.Stock;
import org.wcci.apimastery.StockRepository;

import java.util.Collection;

@RestController
public class StockController {
    private StockRepository stockRepository;
    public StockController(StockRepository stockRepository){
        this.stockRepository = stockRepository;
    }
    @GetMapping("/stocks")
    public Collection<Stock> retrieveStocks(){
        return (Collection<Stock>) stockRepository.findAll();
    }
    @GetMapping("/stocks/{id}")
    public Stock retrieveSingleStock(@PathVariable Long id){
        return stockRepository.findById(id).get();
    }
}
