public class Endereco {
    private String logradouro;
    private String bairro;
    private String cidade;
    private Double cep;
    private String descrincao;

    public Endereco() {
    }

    public Endereco(String logradouro, String bairro, String cidade, Double cep, String descrincao) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.descrincao = descrincao;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Double getCep() {
        return cep;
    }

    public void setCep(Double cep) {
        this.cep = cep;
    }

    public String getDescrincao() {
        return descrincao;
    }

    public void setDescrincao(String descrincao) {
        this.descrincao = descrincao;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + logradouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", cep=" + cep +
                ", descrincao='" + descrincao + '\'' +
                '}';
    }
}
