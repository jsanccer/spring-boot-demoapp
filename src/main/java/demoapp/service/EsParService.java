package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class EsParService {

    public String resultado(int numero) {

        if (numero % 2 == 0)
            return "El numero es par.";
        else
            return "El numero es impar.";
    }

}
