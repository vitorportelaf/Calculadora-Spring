package br.fiap.calculadora.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    public double somarValor(double valor1, double valor2){
        return valor1+valor2;
    }
    public double subtrairValor(double valor1, double valor2){
        return valor1-valor2;
    }
    public double multiplicarValor(double valor1, double valor2){
        return valor1*valor2;
    }
    public double dividirValor(double valor1, double valor2){
        return valor1/valor2;
    }
}
