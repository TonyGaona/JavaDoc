package ec.edu.utpl.poo.semana7.clases.banco;

/**
 * Ahorro va a representar un tipo de cuenta.
 * Este tipo de cuenta tiene como valor diferencial el interes anueal que se cobra.
 * @author Francisco González
 * @version 1.0, 03/06/2021
 */
public class Ahorro extends Cuenta{
    private double interesAnual;

    /**
     * Crea el tipo de cuenta ahorro recibiendo el saldo inicial,
     * el número que se le asignará y el interes que se le cobrará anualmente.
     * @param saldo El saldo inicial con el que se creará la cuenta.
     * @param numero El número que se asignará a la cuemta.
     * @param interesAnual El interes que se cobrará anualmente.
     */
    public Ahorro(double saldo, String numero, double interesAnual) {
        super(saldo, numero);
        this.interesAnual = interesAnual;
    }

    /**
     * Obtiene el número de cuenta.
     * @see ec.edu.utpl.poo.semana7.clases.banco.Cuenta {@link #getNumero()}
     * @return El número de cuenta con un formato.
     */
    @Override
    public String getNumero(){
        return "CTA-AH-".concat(super.getNumero());
    }

    /**
     * Obtiene el interés que se cobra anualmente.
     * @return El interés anual que le cobrán a la cuenta.
     */
    public double getInteresAnual() {
        return interesAnual;
    }

    /**
     * Evaluará si el monto es negativo.
     * @param monto El monto que se retirará de la cuenta.
     * @return True si el monto es positivo y False si el monto es negativo.
     */
    private boolean isMontoValido(double monto){
        return monto > 0;
    }

    /**
     * Realiza el retiro de un monto de dinero de la cuenta,
     * siempre y cuando el monto no sea positivo.
     * @param monto El monto que desea retirar de la cuenta.
     * @throws IllegalArgumentException el monto que desea retirar no tiene el formato deseado.
     */
    public void retirar(double monto){
        if (isMontoValido(monto)){
            setSaldo(getSaldo()-monto);
        }else{
            throw new IllegalArgumentException("El monto no es válido");
        }
    }
}
