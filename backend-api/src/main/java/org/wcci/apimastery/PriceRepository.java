package org.wcci.apimastery;

import org.springframework.data.repository.CrudRepository;
import org.wcci.apimastery.Classes.Price;
import org.wcci.apimastery.Classes.Stock;

import javax.swing.text.html.Option;
import java.util.Date;
import java.util.Optional;

public interface PriceRepository extends CrudRepository<Price, Date> {
    Optional<Price> findById (Date date);

    Optional<Price> findByDateAndStock(Date date, Stock stock);



}
