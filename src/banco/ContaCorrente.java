package banco;

public class ContaCorrente extends Conta implements Tributavel{
    @Override
    public void atualiza(double taxa) {
        super.atualiza(taxa*2);
    }

    @Override
    public double calculaTributos() {
        return 0.01*getSaldo();
    }
}
