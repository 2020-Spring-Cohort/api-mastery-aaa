package org.wcci.apimastery.Controllers;


import org.springframework.web.bind.annotation.*;
import org.wcci.apimastery.Classes.Sector;
import org.wcci.apimastery.Classes.Stock;
import org.wcci.apimastery.SectorRepository;
import org.wcci.apimastery.StockRepository;

import java.util.Collection;

@RestController
public class SectorController {
    private SectorRepository sectorRepository;
    private StockRepository stockRepository;

    public SectorController(SectorRepository sectorRepository, StockRepository stockRepository) {
        this.sectorRepository = sectorRepository;
        this.stockRepository = stockRepository;
    }
    @GetMapping("/sectors/")
    public Collection<Sector> retrieveSectors() {
        return (Collection<Sector>) sectorRepository.findAll();
    }

    @GetMapping("/sectors/{id}")
    public Sector retrieveSingleSector(@PathVariable Long id){
        return sectorRepository.findById(id).get();
    }

<<<<<<< HEAD
    //this method adds a stock within the given sector
    @PatchMapping("/sectors/{sectorName}")
    public Sector addStock( @RequestBody Stock stockToPatch,
                            @PathVariable String sectorName){
        Sector sectorToAddStockTo = sectorRepository.findByName(sectorName);
        Stock requestBodyStock = new Stock(stockToPatch.getName(), sectorToAddStockTo);
        stockRepository.save(requestBodyStock);
        sectorRepository.save(sectorToAddStockTo);
        return sectorToAddStockTo;
    }

=======
>>>>>>> 91dc0707ab754f6de8723346e6b1739dcc675101
}
