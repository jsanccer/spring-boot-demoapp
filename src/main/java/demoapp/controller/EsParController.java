package demoapp.controller;

import demoapp.service.EsParService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class EsParController {

    @Autowired
    private EsParService servicio;

    @GetMapping("/esparform")
    public String esParForm(EsPar esPar) { return "EsParForm"; }

    @PostMapping("/esparform")
    public String checknumero(@ModelAttribute @Valid EsPar esPar, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "EsParForm";
        }
        model.addAttribute("mensaje", servicio.resultado(esPar.getNumero()));
        return "SalidaEsPar";
    }
}
