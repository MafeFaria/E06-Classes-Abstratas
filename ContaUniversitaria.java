public class ContaUniversitaria extends Conta {

    public ContaUniversitaria(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }

    @Override
    public void setLimite(double limite) {
        // Conta universitária tem limite máximo de 500 e mínimo de 0
        if (limite < 0) {
            limite = 0;
        } else if (limite > 500) {
            limite = 500;
        }
        this.limite = limite;
    }
}
