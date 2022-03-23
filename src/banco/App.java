package banco;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Cliente cli1 = new Cliente("José", "321.654.987.-56");
        Cliente cli2 = new Cliente("Maria", "654.654.852.-68");

        Conta c1 = new Conta("123",cli1,1234.58);
        Conta c2 = new Conta("321",cli1,4322.58);

        Conta[] contas = {c1,c2};

        for (Conta conta: contas) {
            System.out.println("Conta: " + conta.getNumero());
            System.out.println("Nome:" + conta.getCliente().getNome());
            System.out.println("Saldo: " + conta.getSaldo());
        }

    }
}
