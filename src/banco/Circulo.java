package banco;

public class Circulo implements AreaCalculavel{
    private double raio;
    private final double pi = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return pi*raio*raio;
    }
}
