package org.wcci.apimastery;

import org.springframework.data.repository.CrudRepository;
import org.wcci.apimastery.Classes.Stock;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface StockRepository extends CrudRepository<Stock, Long> {

     Optional <Stock> findById(Long id);



     Stock findByName(String s);
}
