package org.wcci.apimastery;


import org.junit.jupiter.api.BeforeEach;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.mock;

public class SectorControllerTest {

    private SectorController underTest;
    private SectorRepository sectorRepository;
    private Stock testStock;
    private Price testPrice;
    private MockMvc mockMvc;

    @BeforeEach
    void setUp(){
        sectorRepository = mock(SectorRepository.class);
        underTest = new SectorController(sectorRepository);
        testPrice = new Price()
    }
}
