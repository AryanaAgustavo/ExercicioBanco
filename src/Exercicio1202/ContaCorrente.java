package Exercicio1202;

public class ContaCorrente implements Contas {
    public Cliente cliente;
    private double saldo;
    private double chequeEspecial;

// Criei um construtor:


    public ContaCorrente(Cliente cliente, double saldo, double chequeEspecial) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

// Métodos da conta corrente:
    @Override
    public void fazerDeposito(double valor) {
        if (valor> 0) {
            this.saldo = saldo + valor;
        } System.out.println("Deposito realizado. Novo saldo da Conta Corrente de: " + saldo);
    }

// Método de fazer saque. Caso o valor pedido seja maior que o saldo, o cliente poderá usar seu cheque especial no limite definido na abertura da conta

    @Override
    public void fazerSaque(double valor) {
        if (valor<=saldo) {
            this.saldo = saldo - valor;
            System.out.println("Saque realizado. Novo saldo da Conta Corrente de: " + saldo);

        } else if (valor>saldo && valor-saldo<=chequeEspecial ) {
            //this.saldo = saldo - valor;
            double diferencaCheque = valor - this.saldo;
            chequeEspecial -= diferencaCheque;
            this.saldo -= this.saldo;
            System.out.println("Você utilizou seu limite de Cheque Especial no valor de R$" + diferencaCheque);

        } else if (valor>saldo && valor-saldo>chequeEspecial) {
            System.out.println("Você não tem limite para sacar essa quantia.");
        }
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo na Conta Corrente é de: " + saldo);
    }

    public void depositarCheque (double valorCheque, String bancoEmissor, String dataPagamento) {
        this.saldo = valorCheque + saldo;
        System.out.println("Seu cheque no valor de R$" + valorCheque + " será depositado na data: " + dataPagamento + ". Banco emissor: " + bancoEmissor);
        System.out.println("Novo saldo da Conta Corrente é de: " + saldo);
    }

}
