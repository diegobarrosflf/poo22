package banco;

public class TesteContas {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        ContaCorrente c2 = new ContaCorrente();
        ContaPoupanca c3 = new ContaPoupanca();

        c1.deposita(1000);
        c2.deposita(1000);
        c3.deposita(1000);

        c1.atualiza(0.1);
        c2.atualiza(0.1);
        c3.atualiza(0.1);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
        System.out.println(c3.getSaldo());
    }
}
