package calculos;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    Calculadora calculadora;

    @Test
    public void testeCalculadorasoma(){


        calculadora = new Calculadora();
        int resultadoEsperado = 4;
        int resultado = calculadora.somar(2, 2);

        if (resultado == resultadoEsperado) {
            System.out.println("teste ok");
        } else {
            System.out.println("teste falhou");
        }

    }

}








