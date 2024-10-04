package models;

public class Medicamento {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;
    private Fornecedor fornecedor;


    public Medicamento(int id, String nome, double preco, int quantidade, Fornecedor fornecedor) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
    }

    public Medicamento(String nome, String codigo, String preco, int quantidade) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }



    public void cadastrarMedicamento() {
        //System.out.println("Medicamento cadastrado: " + nome);
    }

    public void editarMedicamento() {
        // System.out.println("Medicamento editado: " + nome);
    }

    public void removerMedicamento() {
        //System.out.println("Medicamento removido: " + nome);
    }

    public void listarMedicamento() {
        //System.out.println("Medicamento: " + nome + ", Preço: " + preco);
    }
}
