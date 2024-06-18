import java.util.Date;

public abstract class Operacao {

    private Date data;
    private char tipo;
    private double valor;

    private static int totalOperacoes = 0;

    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        data = new Date();
        Operacao.totalOperacoes++;
    }

    public abstract double calcularTaxa();

    @Override
    public String toString() {
        return String.format("%s\t%s\t%s", this.data, this.tipo, this.valor);
    }

    public static int getTotalOperacoes() {
        return Operacao.totalOperacoes;
    }
}
