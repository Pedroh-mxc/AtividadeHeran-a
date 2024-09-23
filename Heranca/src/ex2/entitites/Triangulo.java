package ex2.entitites;

public class Triangulo extends Figura {
    private double base;
    private double altura;
    public double area;

    public Triangulo(double base, double altura, String cor) {
        this.base = base;
        this.altura = altura;
        this.cor = cor;
        this.area = base*altura/2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return ((base * altura) / 2);
    }

    @Override
    public String toString() {
        return super.toString() + "A figura com a base: " + base + " e altura: " + altura + ", tem a área de: " + area;
    }
}
