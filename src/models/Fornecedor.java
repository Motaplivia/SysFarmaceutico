package models;

public class Fornecedor {
    private String cnpj;


    public Fornecedor(int id, String nome, String telefone, String cnpj) {
        //super();
        this.cnpj = cnpj;
    }

    public Fornecedor(String nome, String cnpj, String telefone) {
    }


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }



    public void cadastrarFornecedor() {
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
