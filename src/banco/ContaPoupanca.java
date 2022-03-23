package banco;

public class ContaPoupanca extends Conta{

    @Override
    public void atualiza(double taxa) {
        super.atualiza(taxa*3);
    }
    @Override
    public void deposita(double valor){
        super.deposita(valor - 0.1);
    }
}
