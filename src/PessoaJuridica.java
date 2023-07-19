public class PessoaJuridica extends Pessoa {
    
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void imprimirPessoaJuridica() {
        System.out.println("Nome da Pessoa Juridica: " + this.getNome() + " " +
                            "Endereço: " + this.getEndereco() + " " +
                            "Profissão: " + this.getProfissão() + " " +
                            "CNPJ: " + this.getCnpj());
    }
}
