package ex2.entitites;

public class Quadrado extends Retangulo {
    public Quadrado() {
    }

    public Quadrado(double lado1, String cor) {
        super(lado1, lado1, cor);
    }

    @Override
    public double area() {
        return Math.pow(this.getLado1(), 2); }

    @Override
    public String toString() {
        String lado1;
        return super.toString();
    }
}
