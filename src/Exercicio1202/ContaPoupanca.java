package Exercicio1202;

public class ContaPoupanca  implements Contas {
    public Cliente cliente;
    private double saldo;
    public double taxaJuros;

    // Criei um construtor para acessar os dados privados:

    public ContaPoupanca(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

//Métodos da conta poupança:
    @Override
    public void fazerDeposito(double valor) {
        if (valor> 0) {
            this.saldo = saldo + valor;
        } System.out.println("Deposito realizado. Novo saldo da Conta Poupança é de: " + saldo);
    }

    @Override
    public void fazerSaque(double valor) {
        if (valor<=saldo) {
            this.saldo = saldo - valor;
            System.out.println("Saque realizado. Novo saldo da Conta Poupança é de: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque na Poupança.");
        }
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo na Conta Poupança é de: " + saldo);
    }

    public void recolherJuros(){
        this.saldo = saldo + (saldo * 0.003);
        System.out.println("Juros recolhidos, agora seu saldo na Conta Poupança é de: " + saldo);
    }
}