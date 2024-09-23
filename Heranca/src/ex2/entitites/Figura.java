package ex2.entitites;

public class Figura {
    protected String cor;

    public Figura() {
    }

    public Figura(String cor) {
        super();
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Figura [cor=" + cor + "]\n";
    }

    
}
