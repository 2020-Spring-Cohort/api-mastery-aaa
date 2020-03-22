package org.wcci.apimastery.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wcci.apimastery.Classes.Sector;
import org.wcci.apimastery.SectorRepository;

import java.util.Collection;

@RestController
public class SectorController {
    private SectorRepository sectorRepository;

    public SectorController(SectorRepository sectorRepository) {
        this.sectorRepository = sectorRepository;
    }
    @GetMapping("/sectors/")
    public Collection<Sector> retrieveSectors() {
        return (Collection<Sector>) sectorRepository.findAll();
    }
    @GetMapping("/sectors/{id}")
    public Sector retrieveSingleSector(@PathVariable Long id){
        return sectorRepository.findById(id).get();
    }
}
