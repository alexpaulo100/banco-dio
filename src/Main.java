public class Main {

    public static void main(String[] args) {
        Cliente  manoel = new Cliente();
        manoel.setNome("Manoel");

        Conta cc = new ContaCorrente(manoel);
        Conta poupanca = new ContaPoupanca(manoel);

        cc.depositar(1000);
        cc.transferir(130, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
