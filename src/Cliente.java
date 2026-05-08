import java.time.LocalDate;
import java.util.Date;

public class Cliente {
    private String nome;
    private String cpf;
    private LocalDate dataNasc;

    public Cliente() {
    }

    public Cliente(Date dataNasc, String cpf, String nome) {
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.nome = nome;
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

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNasc=" + dataNasc +
                '}';
    }
}