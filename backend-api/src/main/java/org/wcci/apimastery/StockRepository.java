package org.wcci.apimastery;

import org.springframework.data.repository.CrudRepository;
import org.wcci.apimastery.Classes.Stock;

public interface StockRepository extends CrudRepository<Stock, Long> {
}
