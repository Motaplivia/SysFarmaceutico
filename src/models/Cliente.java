package models;

public class Cliente extends Pessoa {
    private String cpf;


    public Cliente(int id, String nome, String telefone, String cpf) {
        super(id, nome, telefone);
        this.cpf = cpf;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    public void cadastrarCliente() {
        //System.out.println("Cliente cadastrado: " + getNome());
    }

    public void editarCliente() {
        //System.out.println("Cliente editado: " + getNome());
    }

    public void removerCliente() {
        //System.out.println("Cliente removido: " + getNome());
    }

    public void listarCliente() {
        // System.out.println("Cliente: " + getNome() + ", CPF: " + cpf);
    }
}
