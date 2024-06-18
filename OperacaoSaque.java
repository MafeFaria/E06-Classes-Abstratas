public class OperacaoSaque extends Operacao {

    public OperacaoSaque(double valor) {
        super('s', valor);
    }

    @Override
    public double calcularTaxa() {
        // Implementação específica para taxa de saque, se necessário
        return 0; // No caso simples, não há taxa de saque
    }
}
