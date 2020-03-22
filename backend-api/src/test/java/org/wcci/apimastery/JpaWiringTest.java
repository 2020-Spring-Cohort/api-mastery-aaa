package org.wcci.apimastery;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.DirtiesContext;
import org.wcci.apimastery.Classes.Price;
import org.wcci.apimastery.Classes.Sector;
import org.wcci.apimastery.Classes.Stock;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

@DirtiesContext
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
    private Date testDate1;
    private Date testDate2;


    @BeforeEach
    void setUp(){
        testDate1 = new Date(2000, 0, 28);
        testDate2 = new Date(2000, 11, 27);
        testSector = new Sector("testSector");
        testStock1 = new Stock("testName1", testSector);
        testStock2 = new Stock("testName2",testSector);
        testPrice1 = new Price(testStock1, testDate1);
        testPrice2 = new Price(testStock1, testDate2);
        sectorRepository.save(testSector);
        stockRepository.save(testStock1);

    }
    @Test
    public void sectorShouldHaveStocks(){

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
    public void stocksShouldHaveManyPrices(){
        priceRepository.save(testPrice1);
        priceRepository.save(testPrice2);
        stockRepository.save(testStock1);


//        entityManager.flush();
//        entityManager.clear();

        Stock retrievedStock = stockRepository.findById(testStock1.getId()).get();
        Date retrievedDate1 = testPrice1.getDate();
        Date retrievedDate2 = testPrice2.getDate();
        Price retrievedPrice1 = priceRepository.findByDateAndStock(retrievedDate1, retrievedStock);
        Price retrievedPrice2 = priceRepository.findByDateAndStock(retrievedDate2, retrievedStock);
        assertThat(retrievedStock.getName()).isEqualTo("testName1");
        assertThat(retrievedPrice1.getStock()).isEqualTo(testStock1);
        System.out.println("Prices: " + retrievedStock.getPrices());
        System.out.println("Date1 " + retrievedDate1);
        System.out.println("Date2 " + retrievedDate2);
        assertThat(retrievedStock.getPrices()).contains(retrievedPrice1);

    }


}
