package ec.edu.utpl.poo.semana7.clases.banco;

public class Corriente extends Cuenta{
    private int nroMaxCheques;
    private SecuencialCheques secuenciaCh;

    public Corriente(double saldo, String numero) {
        super(saldo, numero);
    }

    public int getNroMaxCheques() {
        return nroMaxCheques;
    }

    public void setNroMaxCheques(int nroMaxCheques) {
        this.nroMaxCheques = nroMaxCheques;
    }

    public SecuencialCheques getSecuenciaCh() {
        return secuenciaCh;
    }

    public void setSecuenciaCh(SecuencialCheques secuenciaCh) {
        this.secuenciaCh = secuenciaCh;
    }
}
