package ec.edu.utpl.poo.semana7.clases.banco;

public class ClienteBanco {
    public static void main(String[] args) {
        Ahorro ctAh1 = new Ahorro(100, "01", 0.05);
        System.out.println(ctAh1.getSaldo());

        Corriente ctCnt1 = new Corriente(345, "50");
        System.out.println(ctCnt1.getSaldo());
    }
}
