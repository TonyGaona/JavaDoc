package ec.edu.utpl.poo.semana7.clases.banco;
/**
 * Corriente va a representar un tipo de cuenta.
 * Este tipo de cuenta tiene como valores el número
 * máximo de cheques y secuencia de cheques.
 * @author Tony Gaona
 * @version 1.0, 03/06/2021
 */
public class Corriente extends Cuenta{
    private int nroMaxCheques;
    private SecuencialCheques secuenciaCh;

    /**
     * Crea el tipo de cuenta corriente recibiendo el saldo inicial
     * y el número que se le asignará.
     * @param saldo El saldo inicial con el que se creará la cuenta.
     * @param numero El número que se asignará a la cuemta.
     */
    public Corriente(double saldo, String numero) {
        super(saldo, numero);
    }

    /**
     * Obtiene el número máximo de cheques.
     * @return El número máximo de chques que tiene la cuenta.
     */
    public int getNroMaxCheques() {
        return nroMaxCheques;
    }

    /**
     * Recibe el número máximo de cheques que se le
     * asignará a la cuenta.
     * @param nroMaxCheques El número máximo de cheques que tendrá la cuenta.
     */
    public void setNroMaxCheques(int nroMaxCheques) {
        this.nroMaxCheques = nroMaxCheques;
    }

    /**
     * Obtiene la secuencia de los cheques.
     * @return La secuencia de los cheques que tiene la cuenta.
     */
    public SecuencialCheques getSecuenciaCh() {
        return secuenciaCh;
    }

    /**
     * Recibe la secuencia de los cheques que se le
     * asignarán a la cuenta.
     * @param secuenciaCh La seuencia de los cheques que tendrá la cuenta.
     */
    public void setSecuenciaCh(SecuencialCheques secuenciaCh) {
        this.secuenciaCh = secuenciaCh;
    }
}
