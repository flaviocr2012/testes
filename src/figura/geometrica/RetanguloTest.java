package figura.geometrica;

import org.junit.jupiter.api.Test;

public class RetanguloTest {

    Retangulo retangulo;
    @Test
    public boolean testCalcularArea() {
        retangulo = new Retangulo(10, 2);
        int resultadoEsperado = 20;

        int resultado = retangulo.calcularArea();

        if (resultado == resultadoEsperado) {
            return true;
        } else {
            return false;
        }
    }
    @Test
    public boolean testCalcularPerimetro() {
        retangulo = new Retangulo(10, 2);
        int resultadoEsperado = 24;

        int resultado = retangulo.calcularPerimetro();

        if (resultado == resultadoEsperado) {
            return true;
        } else {
            return false;
        }
    }


}
