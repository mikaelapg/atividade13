public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica pessoa1 = criarPessoaFisica("Mikaela","Rua 1","estágiaria","123456");
        PessoaJuridica pessoa2 = criarPessoaJuridica("Mika","Rua 2","analista","12354574545455454001");
    }

    private static PessoaFisica criarPessoaFisica(String nome, String endereco, String profissao, String cpf) {
        PessoaFisica pessoa1 = new PessoaFisica();

        pessoa1.setNome(nome);
        pessoa1.setEndereco(endereco);
        pessoa1.setProfissão(profissao);
        pessoa1.setCpf(cpf);

        pessoa1.imprimirPessoaFisica();
        return pessoa1;
    }

    private static PessoaJuridica criarPessoaJuridica(String nome, String endereco, String profissao, String cnpj) {
        PessoaJuridica pessoa2 = new PessoaJuridica();
        
        pessoa2.setNome(nome);
        pessoa2.setEndereco(endereco);
        pessoa2.setProfissão(profissao);
        pessoa2.setCnpj(cnpj);

        pessoa2.imprimirPessoaJuridica();
        return pessoa2;
    }
}
