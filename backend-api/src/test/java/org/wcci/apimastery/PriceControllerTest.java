package org.wcci.apimastery;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.wcci.apimastery.Classes.Price;
import org.wcci.apimastery.Classes.Sector;
import org.wcci.apimastery.Classes.Stock;
import org.wcci.apimastery.Controllers.PriceController;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class PriceControllerTest {
    private PriceRepository priceRepository;
    private PriceController underTest;
    private Price testPrice;
    private Sector testSector;
    private Stock testStock;
    private Date testDate;
    private PriceStorage priceStorage;
    private MockMvc mockMvc;

    @BeforeEach
    void setUp(){
        priceRepository = mock(PriceRepository.class);
        underTest = new PriceController(priceRepository);
        testSector = new Sector("Emerging Markets");
        testStock = new Stock("Europe Extreme",testSector);
        testPrice = new Price(testStock, testDate);
        when(priceRepository.findAll()).thenReturn(Collections.singleton(testPrice));
        mockMvc = MockMvcBuilders.standaloneSetup(underTest).build();
        priceStorage = mock(PriceStorage.class);
    }
    @Test
    public void retrievePricesReturnsListOfPricesFromMockRepo(){
        underTest.retrievePrices();
        verify(priceRepository).findAll();
    }
    @Test
    public void retrievePricesReturnsListOfPricesContainingMockPrice(){
        Collection<Price> result = underTest.retrievePrices();
        assertThat(result).contains(testPrice);
    }
    @Test
    public void underTestIsWiredCorrectlyWithAnnotations() throws Exception{
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(underTest).build();
        mockMvc.perform(get("/prices/"))
               .andExpect(status().isOk());
    }
//    @Test
//    public void shouldGoToIndividualEndPoint()throws Exception {
//        when(priceRepository.findById(1L)).thenReturn(Optional.of(testPrice));
//        mockMvc.perform(get("/prices/1/"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$."))
//    }
}
