public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }

    @Override
    public void setLimite(double limite) {
        // Conta poupança tem limite máximo de 1000 e mínimo de 100
        if (limite < 100) {
            limite = 100;
        } else if (limite > 1000) {
            limite = 1000;
        }
        this.limite = limite;
    }
}
