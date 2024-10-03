package models;

public class Fornecedor extends Pessoa {
    private String cnpj;


    public Fornecedor(int id, String nome, String telefone, String cnpj) {
        super(id, nome, telefone);
        this.cnpj = cnpj;
    }


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }



    public void cadastrarFornecedor() {
        // System.out.println("Fornecedor cadastrado: " + getNome());
    }

    public void editarFornecedor() {
        // System.out.println("Fornecedor editado: " + getNome());
    }

    public void removerFornecedor() {
        // System.out.println("Fornecedor removido: " + getNome());
    }

    public void listarFornecedor() {
        // System.out.println("Fornecedor: " + getNome() + ", CNPJ: " + cnpj);
    }
}
