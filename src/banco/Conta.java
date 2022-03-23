package banco;

public class Conta {

    private static int qtdContas;

    //atributos
    private String numero;
    private Cliente cliente;
    private double saldo;
    //default
    public Conta(){

    }

    //construtor
    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public Conta(String numero, Cliente cliente, double saldo) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
        qtdContas++;
    }

    //getters e setters
    public String getNumero() {
        return this.numero;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public static int getQtdContas() {
        return qtdContas;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //métodos
    public void deposita(double valor) {
        saldo = saldo + valor;
    }

    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }
}
