
public class Main {

    public static void main(String[] args) {
        Cliente Filipe = new Cliente();
        Filipe.setNome("Filipe Barbosa");

        Conta cc = new ContaCorrente(Filipe);
        Conta poupanca = new ContaPoupanca(Filipe);

        cc.depositar(14000);
        cc.transferir(2000, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        //imprimirsaldoTotal();
    }

}
