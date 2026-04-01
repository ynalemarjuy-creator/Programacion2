package Practica02.ejercicio2;

import static java.lang.Math.*;
public class AlgebraVectorial {

    private double x;
    private double y;

    public AlgebraVectorial() {
        this.x = 0;
        this.y = 0;
    }

    public AlgebraVectorial(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double norma() {
        return sqrt(x * x + y * y);
    }

    public double productoPunto(AlgebraVectorial b) {
        return this.x * b.x + this.y * b.y;
    }

    public boolean perpendicular1(AlgebraVectorial b) {
        AlgebraVectorial suma = new AlgebraVectorial(x + b.x, y + b.y);
        AlgebraVectorial resta = new AlgebraVectorial(x - b.x, y - b.y);
        return abs(suma.norma() - resta.norma()) < 1e-6;
    }

    public boolean perpendicular2(AlgebraVectorial b) {
        AlgebraVectorial ab = new AlgebraVectorial(x - b.x, y - b.y);
        AlgebraVectorial ba = new AlgebraVectorial(b.x - x, b.y - y);
        return abs(ab.norma() - ba.norma()) < 1e-6;
    }

    public boolean perpendicular3(AlgebraVectorial b) {
        return abs(productoPunto(b)) < 1e-6;
    }

    public boolean perpendicular4(AlgebraVectorial b) {
        AlgebraVectorial suma = new AlgebraVectorial(x + b.x, y + b.y);
        return abs(pow(suma.norma(), 2) - (pow(this.norma(), 2) + pow(b.norma(), 2))) 
        < 1e-6;
    }

    public boolean paralela1(AlgebraVectorial b) {
        if (b.x != 0) {
            double r = this.x / b.x;
            return abs(this.y - r * b.y) < 1e-6;
        } else if (b.y != 0) {
            double r = this.y / b.y;
            return abs(this.x - r * b.x) < 1e-6;
        }
        return false;
    }

    public boolean paralela2(AlgebraVectorial b) {
        return abs(this.x * b.y - this.y * b.x) < 1e-6;
    }

    public AlgebraVectorial proyeccion(AlgebraVectorial b) {
        double normaB = b.norma();
        if (normaB == 0) return new AlgebraVectorial(0, 0);

        double escalar = productoPunto(b) / (normaB * normaB);
        return new AlgebraVectorial(escalar * b.x, escalar * b.y);
    }

    public double componente(AlgebraVectorial b) {
        double normaB = b.norma();
        if (normaB == 0) return 0;

        return productoPunto(b) / normaB;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
