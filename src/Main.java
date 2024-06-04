public class Main {
    public static void main(String[] args) {

        Cliente venilton = new Cliente();
        Cliente joanderson = new Cliente();

        venilton.setNome("Venilton");
        joanderson.setNome("Joanderson");

        Conta cc = new ContaCorrente(venilton);
        Conta cp = new ContaPoupanca(joanderson);

        cc.depositar(100);
        cc.imprimirExtrato();

        cp.depositar(120);
        cc.imprimirExtrato();

        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
