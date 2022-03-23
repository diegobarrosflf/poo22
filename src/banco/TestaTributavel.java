package banco;

public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1024);
        SeguroDeVida sgv = new SeguroDeVida();

        Tributavel t1 = cc;
        Tributavel t2 = sgv;

        System.out.println(t1 + " tributo: " + t1.calculaTributos());
        System.out.println(t2 + " tributo: " + t2.calculaTributos());

    }
}
