public class Conta {
    private Cliente cliente;
    private double saldo;


    public Conta(Cliente cliente, double saldo) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public String saque(double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
            return "saldo =" + saldo;
        } else {
            return "saldo insuficiente";
        }
    }

    public String deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
        return "Deposito realizado com sucesso";
    }
}





    //public Conta (double saldoAberto) {
    //this.saldo = saldoAberto;
    // }

    // public double getSaldo() {
    //     return saldo;
    // }

    // public void setSaldo(double saldoAberto) {
    //     this.saldo = saldoAberto;
    // }

