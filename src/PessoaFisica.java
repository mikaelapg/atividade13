public class PessoaFisica extends Pessoa{
    
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void imprimirPessoaFisica() {
        System.out.println("Nome da Pessoa Fisica: " + this.getNome() + " " +
                            "Endereço: " + this.getEndereco() + " " +
                            "Profissão: " + this.getProfissão() + " " +
                            "CPF: " + this.getCpf());
    }
}
