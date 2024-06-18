import java.util.Date;
import java.util.Objects;

public class PessoaFisica extends Cliente {

    private String cpf;
    private int idade;
    private char genero;

    public PessoaFisica(String nome, String endereco, Date data, String cpf, int idade, char genero) {
        super(nome, endereco, data);
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
    }

    @Override
    public boolean autenticar(String chave) {
        return chave.equals(cpf);
    }

    @Override
    public String toString() {
        return "cpf=" + cpf + '\n' +
                "idade=" + idade + '\n' +
                "genero=" + genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof PessoaFisica) {
            PessoaFisica pessoa = (PessoaFisica) o;
            return Objects.equals(cpf, pessoa.cpf);
        }
        return false;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
