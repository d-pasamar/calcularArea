package figuras;

/**
 * La clase Circunferencia representa una circunferencia con los atributos radio y color
 * Contiene métodos para imprimir en consola su color, diámetro y calcular el área y puede comparar si dos circunferencias son iguales
 */
public class Circunferencia {
    private double radio;
    private String color;

    /**
     * Método que crea una circunferencia con un radio dado
     *
     * @param radio El parámetro radio define el radio de la circunferencia
     */
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    /**
     * Método que obtiene el radio de la circunferencia
     *
     * @return devuelve el radio de la circunferencia
     */
    public double getRad() {
        return radio;
    }

    /**
     * Método que establece el radio de la circunferencia
     *
     * @param rad El parámetro rad define el radio de la circunferencia
     */
    public void setRad(double rad) {
        this.radio = rad;
    }

    /**
     * Método que imprime atributos de la circunferencia:
     * diámetro, color, área
     */
    public void imprimir() {
        color = "rojo";
        System.out.println("Di�metro: " + 2 * radio);
        System.out.println("Color: " + color);
        double area = 2 * 3.1416 * radio * radio;
        System.out.println(area);
    }

    /**
     * Método que compara dos circunferencias si tienen los radios iguales
     *
     * @param considerarDecimales El parámetro considerarDecimales define si tenemos en cuenta los decimales o no; En caso de true, compara ambos radios y nos devuelve true o false;
     *                            En caso de false, comprueba que la diferencia sin decimales de ambos radios sea inferior a 1 y devuelve true, en caso contrario false
     * @param otro                El parámetro otro define el radio de la segunda circunferencia
     * @return devuelve booleano siendo true si las circunferncias son iguales, o tienen una diferencia de radio inferior a 1, si no comparamos con los decimales
     */
    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.radio;
        double radio2 = otro.getRad();
        if (considerarDecimales) {
            if (radio1 == radio2)
                return true;
            else
                return false;
        } else {
            if (Math.abs(radio1 - radio2) < 1)
                return true;
            else
                return false;
        }
    }
}