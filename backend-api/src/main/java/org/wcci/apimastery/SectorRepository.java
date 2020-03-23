package org.wcci.apimastery;

import org.springframework.data.repository.CrudRepository;
import org.wcci.apimastery.Classes.Sector;

public interface SectorRepository extends CrudRepository<Sector, Long> {

    Sector findByName(String n);
}
