public class Conta {

    int numeroDaConta;
    double saldo;
    double limite;
    Cliente cliente;

    public Conta(int numeroDaConta, double saldo,
                 double limite, Cliente cliente){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    public void exibirDetalhes(){
        System.out.println("R$ " + saldo);
        System.out.println(limite);
        System.out.println(numeroDaConta);
        System.out.println(cliente.titular);
        System.out.println(cliente.cpf);
        System.out.println(cliente.rg);
    }

    public void sacar(double valorSaque){
        saldo -= valorSaque;
        System.out.println("Saque realizado com sucesso!");
        System.out.println("Saldo após o saque: " + saldo);
    }

    public void depositar(double valorDeposito){
        saldo += valorDeposito;
        System.out.println("Deposito realizado com sucesso!");
        System.out.println("Saldo após o depósito: " + saldo);
    }
}

