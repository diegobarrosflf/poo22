package banco;

public class TestaAreaCalculcavel {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10.0);
        Retangulo retangulo = new Retangulo(10.0, 20.0);
        Circulo circulo = new Circulo(10.0);

        AreaCalculavel[] areas = {quadrado,retangulo,circulo};

        for (AreaCalculavel obj : areas) {
            System.out.println(obj + " área:" + obj.calcularArea());
        }
    }
}
