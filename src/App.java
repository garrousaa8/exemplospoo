public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "12333", 132144);


        Conta c1 = new Conta(123, 1000, 500, cliente);
//        c1.limite = 1000;
//        c1.numeroDaConta = 123;
//        c1.saldo = 500;
//        c1.cliente = new Cliente();
//        c1.cliente.cpf = "130.800.040-40";
//        c1.cliente.titular = "José";
//        c1.cliente.rg = 1241799;


        Conta c2 = new Conta();
        // usar set par6a modificar atributos privados
        c2.setNumeroDaConta(1125878);
        System.out.println(c2.getNumeroDaConta());
        c2.setCliente(cliente);
        c2.setSaldo(10);
//        System.out.println(c2.getSaldo());
        c2.depositar(10);
//        System.out.println(c2.getSaldo());



        c1.exibirDetalhes();
//        System.out.println("--------------");
//        c2.exibirDetalhes();
//        System.out.println("Saldo antes do saque: " + c1.saldo);
//        c1.sacar(150);
//        c1.depositar(200);
        //System.out.println("Saldo após o saque: " + c1.saldo);
        ContaPoupanca cp = new ContaPoupanca();
        cp.setCliente(cliente);
        cp.setSaldo(100);
        cp.setNumeroDaConta(123456);
        double rendimento =
                cp.calcularRendimento(cp.getSaldo());
        cp.setRendimento(rendimento);
        cp.exibirDetalhes();
        System.out.println("Rendimento poupança R$ " + cp.getRendimento());
    }
}
