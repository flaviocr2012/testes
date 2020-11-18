package calculos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest2 {
    @Test
    public void testsomar(){
        Calculadora calculadora = new Calculadora();
        int resultadoEsperado = 10;

        int resultado = calculadora.somar(4, 6);

        // assertTrue(resultado == resultadoEsperado);
        // assertEquals(resultadoEsperado, resultado);
        assertEquals(10, resultado);
    }


}
