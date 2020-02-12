package Exercicio1202;

public class Main {
  public static void main(String[] args) {
        Cliente cliente1 = new Cliente("1","Silva", "386", "417");
        ContaPoupanca contaP = new ContaPoupanca(cliente1, 0);
        ContaCorrente contaC = new ContaCorrente(cliente1, 0,1000);

        contaC.fazerDeposito(500);
        contaC.fazerSaque(1000);
        contaC.consultarSaldo();
        contaP.consultarSaldo();
        contaP.fazerDeposito(100);
        contaP.fazerSaque(200);

    }
}
