package ec.edu.utpl.poo.semana7.clases.banco;

public class Ahorro extends Cuenta{
    private double interesAnual;

    public Ahorro(double saldo, String numero, double interesAnual) {
        super(saldo, numero);
        this.interesAnual = interesAnual;
    }

    @Override
    public String getNumero(){
        return "CTA-AH-".concat(super.getNumero());
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    private boolean isMontoValido(double monto){
        return monto > 0;
    }

    public void retirar(double monto){
        if (isMontoValido(monto)){
            setSaldo(getSaldo()-monto);
        }else{
            throw new IllegalArgumentException("El monto no es válido");
        }
    }
}
