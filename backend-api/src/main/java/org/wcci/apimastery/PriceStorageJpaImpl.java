package org.wcci.apimastery;


import org.springframework.stereotype.Service;
import org.wcci.apimastery.Classes.Price;
import org.wcci.apimastery.PriceRepository;
import java.util.Collection;


@Service
public class PriceStorageJpaImpl implements PriceStorage {
    private PriceRepository priceRepository;

    public PriceStorageJpaImpl(PriceRepository priceRepository){
        this.priceRepository = priceRepository;
    }
    @Override
    public Collection<Price> findAllPrices(){
        return (Collection<Price>) priceRepository.findAll();
    }
    @Override
    public void store(Price price){
        priceRepository.save(price);
    }
//    @Override
//    public Price findPriceById(long id) throws PriceNotFoundException{
//        return priceRepository.findById(id).get();
//    }


}