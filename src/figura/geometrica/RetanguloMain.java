package figura.geometrica;

public class RetanguloMain {
    public static void main(String[] args) {
        RetanguloTest teste = new RetanguloTest();
        boolean resultado;

        resultado = teste.testCalcularArea();
        System.out.println("testCacularArea: " + resultado);

        resultado = teste.testCalcularPerimetro();
        System.out.println("testCalcularPerimetro " + resultado);
    }
}
