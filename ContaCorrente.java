public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }

    @Override
    public void setLimite(double limite) {
        // Conta corrente não tem limite máximo
        if (limite < -100) {
            limite = -100;
        }
        this.limite = limite;
    }
}
