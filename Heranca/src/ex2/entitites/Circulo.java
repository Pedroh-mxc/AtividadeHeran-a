package ex2.entitites;

public class Circulo extends Figura {
    private double raio;
    public double area;

    public Circulo(){

    }

    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
        this.area = Math.PI*Math.pow(raio, 2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String toString() {
        return super.toString() + "A figura com o raio: " + raio + ", tem a área de: " + area;
    }
}
