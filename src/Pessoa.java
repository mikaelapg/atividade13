public abstract class Pessoa {

    private String nome;
    private String endereco;
    private String profissao;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProfissão() {
        return profissao;
    }
    
    public void setProfissão(String profissão) {
        this.profissao = profissão;
    }
}
