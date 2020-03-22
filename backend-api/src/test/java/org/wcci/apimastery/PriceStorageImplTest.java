package org.wcci.apimastery;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.wcci.apimastery.Classes.Price;
import org.wcci.apimastery.Classes.Sector;
import org.wcci.apimastery.Classes.Stock;

import java.util.Collections;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class PriceStorageImplTest {
    private PriceRepository priceRepository;
    private PriceStorageJpaImpl underTest;
    private Price testPrice1;
    private Price testPrice2;
    private Sector testSector;
    private Stock testStock;
    private Date testDate;


    @BeforeEach
    void setUp(){
        priceRepository = mock(PriceRepository.class);
        underTest = new PriceStorageJpaImpl(priceRepository);
        testSector = new Sector("HealthCare");
        testStock = new Stock("ABC Inc", testSector);
        testPrice1 = new Price(23L,testSector, testStock, testDate);
        testPrice2 = new Price(24L,testSector, testStock, testDate);

    }
    @Test
    public void shouldBeAbleToFindAllPrices(){
        when(priceRepository.findAll()).thenReturn(Collections.singletonList(testPrice1));
        underTest.store(testPrice1);
        underTest.store(testPrice2);
        verify(priceRepository).save(testPrice1);
        verify(priceRepository).save(testPrice2);
        assertThat(underTest.findAllPrices()).contains(testPrice1);
    }

}
