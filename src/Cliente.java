import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private LocalDate dataNasc;
    private ArrayList<Endereco> enderecos = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String nome, String cpf, LocalDate dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNasc=" + dataNasc +
                ", enderecos=" + enderecos + // Agora imprime a lista completa
                '}';
    }
}