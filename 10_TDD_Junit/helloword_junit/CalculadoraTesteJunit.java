package helloword_junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTesteJunit {

    @Test
    public void somarDoisNumerosPositivos(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3, 7);

        Assertions.assertEquals(10,soma);
    }

    @Test
    public void somarDoisNumerosNegativos(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar(-3, -7);

        Assertions.assertEquals(-10,soma);
    }
}
