package Practica02.ejercicio3;

class Vector3D {
    double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D sumar(Vector3D v) {
        return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    public Vector3D multiplicar(double k) {
        return new Vector3D(this.x * k, this.y * k, this.z * k);
    }

    public double longitud() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public Vector3D normalizar() {
        double len = longitud();
        return new Vector3D(x/len, y/len, z/len);
    }

    public double productoEscalar(Vector3D v) {
        return this.x*v.x + this.y*v.y + this.z*v.z;
    }

    public Vector3D productoVectorial(Vector3D v) {
        double i = this.y*v.z - this.z*v.y;
        double j = this.z*v.x - this.x*v.z;
        double k = this.x*v.y - this.y*v.x;
        return new Vector3D(i, j, k);
    }

    public boolean esPerpendicular(Vector3D v) {
        return this.productoEscalar(v) == 0;
    }

    public Vector3D proyeccion(Vector3D v) {
        double escalar = this.productoEscalar(v) / v.productoEscalar(v);
        return v.multiplicar(escalar);
    }

    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
