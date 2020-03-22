package org.wcci.apimastery;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.wcci.apimastery.Classes.Sector;
import org.wcci.apimastery.Controllers.SectorController;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Collections;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class SectorControllerTest {

    private SectorController underTest;
    private SectorRepository sectorRepository;
    private Sector testSector;

    @BeforeEach
    void setUp(){
        sectorRepository = mock(SectorRepository.class);
        underTest = new SectorController(sectorRepository);
        testSector = new Sector("Tech");
        when(sectorRepository.findAll()).thenReturn(Collections.singleton(testSector));
//        when(sectorRepository.findAllById(1)).thenReturn(java.util.Optional.ofNullable(testSector));
    }
    @Test
    public void retrieveSectorRetrievesListOfSectorsFromMockRepo(){
        underTest.retrieveSectors();
        verify(sectorRepository).findAll();
    }
    @Test
    public void underTestIsWiredCorrectlyWithAnnotations() throws Exception{
    MockMvc mockMvc = MockMvcBuilders.standaloneSetup(underTest).build();
    mockMvc.perform(get("/sectors/"))
            .andExpect(status().isOk());
    }

}
