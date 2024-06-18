public class OperacaoDeposito extends Operacao {

    public OperacaoDeposito(double valor) {
        super('d', valor);
    }

    @Override
    public double calcularTaxa() {
        // Implementação específica para taxa de depósito, se necessário
        return 0; // No caso simples, não há taxa de depósito
    }
}
