package org.wcci.apimastery;

import org.springframework.data.repository.CrudRepository;
import org.wcci.apimastery.Classes.Price;

import java.util.Optional;

public interface PriceRepository extends CrudRepository<Price, Long> {
    Optional<Price> findById (Long id);
}
