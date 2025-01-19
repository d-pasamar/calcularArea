package figuras;

/**
 * La clase pública Test contiene el método main
 *
 * @author David
 * @version 1.0
 */

public class Test {

    /**
     * Método principal del programa para ejecutar la aplicación
     * Crea tres objetos de la clase Circunferencia y realiza dos comparaciones
     * Imprime en consola si las circunferencias son iguales según considere los decimales o no
     */
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia(5.5);
        Circunferencia c2 = new Circunferencia(10.1);
        Circunferencia c3 = new Circunferencia(10.9);

        if (c2.esIgual(false, c3))
            System.out.println("c2 y c3: iguales sin considerar decimales");

        if (c2.esIgual(true, c3))
            System.out.println("c2 y c3: iguales considerando decimales");
    }

}