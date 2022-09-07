package com.example.interview.contoller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@ExtendWith(MockitoExtension.class)
class NumberControllerTest {
    MockMvc mockMvc;
    @BeforeEach
    void setUp() {

        mockMvc= MockMvcBuilders.standaloneSetup(NumberController.class).build();
    }
@Test
    public void receiveNumbers() throws Exception {
    mockMvc.perform(get("/checknumber").param("sum","2").param("numbers","[1,2,3,4,5,0]").accept(MediaType.APPLICATION_JSON));

}
}