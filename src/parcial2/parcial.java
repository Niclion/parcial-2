
package parcial2;

public class parcial {

    public String calcularRaices(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("el coeficiente no es 0.");}

        double discriminante = b * b - 4 * a * c;

        if (discriminante < 0) {
            throw new IllegalArgumentException(" no hay  tiene raíces reales.");}

        if (discriminante == 0) {
            double x = -b / (2 * a);
            return "x1 = x2 = " + formatear(x);}

        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

        return "x1 = " + formatear(x1) + ", x2 = " + formatear(x2);}

    private String formatear(double numero) {
        if (numero == (long) numero) {
            return String.valueOf((long) numero);}
        return String.format("%.2f", numero);}}
