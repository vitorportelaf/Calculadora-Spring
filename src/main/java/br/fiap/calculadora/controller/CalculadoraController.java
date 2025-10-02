package br.fiap.calculadora.controller;

import br.fiap.calculadora.service.CalculadoraService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CalculadoraController {

    private final CalculadoraService service;

    public CalculadoraController(CalculadoraService service) {
        this.service = service;
    }

    @PostMapping("/calcular")
    public String calcular(@RequestParam double valor1,
                           @RequestParam double valor2,
                           @RequestParam String operacao, Model model){
        double resultado = 0;
        if(operacao.equalsIgnoreCase("soma")){
            resultado = service.somarValor(valor1, valor2);
        }
        if(operacao.equalsIgnoreCase("subtracao")){
            resultado = service.subtrairValor(valor1, valor2);
        }
        if(operacao.equalsIgnoreCase("multiplicacao")){
            resultado = service.multiplicarValor(valor1, valor2);
        }
        if(operacao.equalsIgnoreCase("divisao")){
            resultado = service.dividirValor(valor1, valor2);
        }
        model.addAttribute("resultado", resultado);
        return "index";
    }

}
