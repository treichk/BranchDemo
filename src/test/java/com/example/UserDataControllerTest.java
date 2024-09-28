package com.example;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.service.UserDataService;

@WebMvcTest
class UserDataControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserDataService service;

    @Test
    public void shouldReturnMessage() throws Exception {
        this.mockMvc.perform(get("/users/test"))
                    .andExpect(status().isOk());
    }
    
    @Test
    void whenInvalidChar_thenReturnBadRequest() throws Exception {
    	mockMvc.perform(get("/users/bad@char"))
              .andExpect(status().isBadRequest());
    }

}
