
public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    //void totalSaldo(double saldoT);

    void imprimirExtrato();

    //void imprimirtotalSaldo();

}
