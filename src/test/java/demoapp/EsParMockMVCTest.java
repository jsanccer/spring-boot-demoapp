package demoapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class EsParMockMVCTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void peticionPostOK() throws Exception {
        this.mockMvc.perform(post("/esparform").param("numero", String.valueOf(3)))
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().string(containsString("El numero es impar.")));
    }
}
