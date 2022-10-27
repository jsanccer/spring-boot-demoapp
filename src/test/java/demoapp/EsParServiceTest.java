package demoapp;

import demoapp.service.EsParService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class EsParServiceTest {

    @Autowired
    EsParService servicio;

    @Test
    public void contexLoads() throws Exception {
        assertThat(servicio).isNotNull();
    }

    @Test
    public void pruebaResultado() throws Exception {
        assertThat(servicio.resultado(3)).isEqualTo("El numero es impar.");
    }
}
