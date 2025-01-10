package utilidades;

public class Circulo {
    private final double rad;

    public Circulo(double radio) {
        this.rad = radio;
    }

    public void imprimir() {
        String color = "rojo";
        System.out.println("Di�metro: " + 2 * rad);
        System.out.println("Color: " + color);
        double area = 2 * 3.1416 * rad * rad;
        System.out.println(area);
    }

    public boolean esIgual(Circulo otro, boolean conDecimales) {
        double radio1 = this.rad;
        double radio2 = otro.getRad();
        if (conDecimales) {
            return radio1 == radio2;
        } else {
            return Math.abs(radio1 - radio2) < 1;
        }
    }
}

