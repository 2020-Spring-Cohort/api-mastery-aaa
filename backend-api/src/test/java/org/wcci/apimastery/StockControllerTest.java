package org.wcci.apimastery;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.wcci.apimastery.Classes.Sector;
import org.wcci.apimastery.Classes.Stock;
import org.wcci.apimastery.Controllers.StockController;

import java.util.Collection;
import java.util.Collections;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class StockControllerTest {

    private StockController underTest;
    private StockRepository stockRepository;
    private Stock testStock;
    private Sector testSector;
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        stockRepository = mock(StockRepository.class);
        underTest = new StockController(stockRepository);
        testSector = new Sector("Banking");
        testStock = new Stock("testStock", testSector);
        when(stockRepository.findAll()).thenReturn(Collections.singletonList(testStock));
        mockMvc = MockMvcBuilders.standaloneSetup(underTest).build();
    }
    @Test
    public void retrievedStocksReturnsListOfStocks() {
        underTest.retrieveStocks();
        verify(stockRepository).findAll();
    }
    @Test
    public void retrieveStocksReturnsListOfStocksContainingMockStocks(){
        Collection<Stock> result = underTest.retrieveStocks();
        assertThat(result).contains(testStock);
    }
    @Test
    public void controllerIsWiredCorrectly() throws Exception{
        mockMvc.perform(get("/stocks"))
                .andExpect(status().isOk());
    }
//    @Test
//    public void underTestIsWiredCorrectlyForSingleStock() throws Exception{
//        when(stockRepository.findById(1L)).thenReturn(Optional.of(testStock));
//        mockMvc.perform(get("/stocks/1/"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$.name",is("testName")));
    }

