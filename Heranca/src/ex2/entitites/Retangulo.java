package ex2.entitites;

public class Retangulo extends Figura {
    private double lado1;
    private double lado2;
    public double area;

    public Retangulo() {

    }

    public Retangulo(double lado1, double lado2, String cor) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.cor = cor;
        this.area = lado1 * lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double area(){
        return lado1*lado2;
    }

    @Override
    public String toString() {
        return super.toString() + "A figura com os lados: " + lado1 + " e " + lado2 + ", tem a área de: " + area;
    }
}
