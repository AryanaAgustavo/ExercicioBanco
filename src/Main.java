public class Main {
    public static void main (String[] args) {
        Cliente cliente1 = new Cliente("Ary", "417");

        Conta conta1 = new Conta(cliente1, 0);

        System.out.println(conta1.deposito(100));
        System.out.println(conta1.saque(50));
    }
}
