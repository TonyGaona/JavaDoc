package ec.edu.utpl.poo.semana7.clases.banco;
/**
 * Secuencial cheques va a representar las secuencias
 * de los cheques que estan dentro de la cuenta corriente.
 * Este tipo de cuenta tiene como valores el inicio y fin
 * de la secuencia de los cheques.
 * @author Tony Gaona
 * @version 1.0, 03/06/2021
 */
public class SecuencialCheques {
    private String inicio;
    private String fin;

    /**
     * Obtiene el inicio de la secuencia de los cheques
     * de la cuenta corriente.
     * @return El inicio de la seuencia de los cheques.
     */
    public String getInicio() {
        return inicio;
    }

    /**
     * Recibe el inicio de la secuencia que se le
     * asignará a los cheques.
     * @param inicio El inicio de la secuencia de los cheques.
     */
    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    /**
     * Obtiene el fin de la secuencia de los cheques
     * de la cuenta corriente.
     * @return El fin de la seuencia de los cheques.
     */
    public String getFin() {
        return fin;
    }

    /**
     * Recibe el fin de la secuencia que se le
     * asignará a los cheques.
     * @param fin El fin de la secuencia de los cheques.
     */
    public void setFin(String fin) {
        this.fin = fin;
    }
}
