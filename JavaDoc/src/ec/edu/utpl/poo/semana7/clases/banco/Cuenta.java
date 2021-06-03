package ec.edu.utpl.poo.semana7.clases.banco;
import java.time.LocalDate;

/**
 * <h1>Cuentas de Banco</h1>
 * Cuenta va a representar los tipos de cuentas que se pueden crear.
 * Cada tipo de cuenta tiene un saldo y un número determinado.
 * @author Francisco González
 * @version 1.0, 03/06/2021
 */
public class Cuenta {
    private double saldo;
    protected String numero;
    private LocalDate fechaApertura;

    /**
     * Crea un tipo cuenta recibiendo como parametros el saldo y el número.
     * @param saldo El saldo inicial con el que se creará la cuenta.
     * @param numero El número que se le asignará a la cuenta.
     */
    public Cuenta(double saldo, String numero) {
        setSaldo(saldo);
        this.numero = numero;
        fechaApertura = LocalDate.now();
    }

    /**
     * Devuelve el saldo que tiene una cuenta en específica.
     * @return El saldo que tiene la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Recibe el saldo que se le asignará a una cuenta.
     * @param saldo El saldo inicial de la cuenta.
     * @throws IllegalArgumentException el saldo a ingresarse no tiene el formato deseado.
     */
    public final void  setSaldo(double saldo) {
        if (!validarSaldoNoNegativo(saldo)){
            this.saldo = saldo;
        }else {
            throw new IllegalArgumentException("Saldo negativo");
        }
    }

    /**
     * Devuelve el número de la cuenta..
     * @return El número de cuenta.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Recibe el número que se le asignará a una cuenta.
     * @param numero El número de cuenta.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Evalua si el valor inicial del saldo es negativo.
     * @param saldo Recibe el saldo que se ingresará en la cuenta.
     * @return True si el saldo es negativo y False no lo es.
     */
    private boolean validarSaldoNoNegativo(double saldo){
        return saldo < 0;
    }

    /**
     * Realizara el deposito de un monto de dinero, siempre y cuando sea mayor a cero.
     * @param monto Recibe el monto que incrementará el saldo actual.
     * @throws IllegalArgumentException el monto a depositarse no tiene el formato deseado.
     */
    public void depositar(double monto){
        if(monto > 0){
            this.saldo = this.saldo + monto;
        }else{
            throw new IllegalArgumentException("Monto negativo");
        }
    }
}
