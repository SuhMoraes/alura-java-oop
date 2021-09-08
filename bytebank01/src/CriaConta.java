public class CriaConta {
    public static void main(String[] args) {
        Conta cc1 = new Conta();

        cc1.saldo = 200;
        cc1.agencia = 001;
        cc1.numero = 12334-8;
        cc1.titular = "Fernando";

        System.out.println("Conta: " + cc1.numero);


    }
}
