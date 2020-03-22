package org.wcci.apimastery.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wcci.apimastery.Classes.Price;
import org.wcci.apimastery.PriceRepository;

import java.util.Collection;

@RestController
public class PriceController {
    private PriceRepository priceRepository;
    public PriceController(PriceRepository priceRepository){
        this.priceRepository = priceRepository;
    }
    @GetMapping("/prices")
    public Collection<Price>retrievePrices(){
        return (Collection<Price>) priceRepository.findAll();
        }
    @GetMapping("/prices/{id}")
    public Price retrieveSinglePrice(@PathVariable Long id){
        return priceRepository.findById(id).get();
    }
}
