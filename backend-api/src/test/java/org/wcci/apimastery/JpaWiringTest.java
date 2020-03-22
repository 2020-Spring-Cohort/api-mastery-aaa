package org.wcci.apimastery;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.wcci.apimastery.Classes.Price;
import org.wcci.apimastery.Classes.Sector;
import org.wcci.apimastery.Classes.Stock;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class JpaWiringTest {
    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private SectorRepository sectorRepository;
    @Autowired
    private StockRepository stockRepository;
    @Autowired
    private PriceRepository priceRepository;

    private Sector testSector;
    private Stock testStock1;
    private Stock testStock2;
    private Price testPrice1;
    private Price testPrice2;
    private Date testDate;

    @BeforeEach
    void setUp(){
        testSector = new Sector("testSector");
        testStock1 = new Stock("testName1", testSector);
        testStock2 = new Stock("testName2",testSector);
        testPrice1 = new Price(66L,testSector,testStock1, testDate);

    }
    @Test
    public void sectorShouldHaveStocks(){
        sectorRepository.save(testSector);
        stockRepository.save(testStock1);
        stockRepository.save(testStock2);
        entityManager.flush();
        entityManager.clear();
        Sector retrievedSector = sectorRepository.findById(testSector.getId()).get();
        Stock retrievedStock1 = stockRepository.findById(testStock1.getId()).get();
        Stock retrievedStock2= stockRepository.findById(testStock2.getId()).get();
        assertThat(retrievedSector.getStocks()).contains(retrievedStock1, retrievedStock2);

    }
    @Test
    public void stocksShouldHavePrices(){
        sectorRepository.save(testSector);
        stockRepository.save(testStock1);
        priceRepository.save(testPrice1);
        priceRepository.save(testPrice2);
        entityManager.clear();
        entityManager.flush();
        Stock retrievedStock=stockRepository.findById(testStock1.getId()).get();
        Price retrievedPrice1 = priceRepository.findById(testPrice1.getId()).get();
        Price retrievedPrice2 = priceRepository.findById(testPrice2.getId()).get();
        assertThat(retrievedStock.getPrices()).contains(retrievedPrice1,retrievedPrice2);


    }


}
