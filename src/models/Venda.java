package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
    private int id;
    private Cliente cliente;
    private Medicamento medicamento;
    private int quantidade;
    private Date data;
    private double precoTotal;

    private static List<Venda> vendas = new ArrayList<>();

    public Venda(int id, Cliente cliente, Medicamento medicamento, int quantidade, Date data) {
        this.id = id;
        this.cliente = cliente;
        this.medicamento = medicamento;
        this.quantidade = quantidade;
        this.data = data;
        this.precoTotal = medicamento.getPreco() * quantidade;
        vendas.add(this);
    }

    public Venda(String cliente, String medicamento, int quantidade, double v) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) { // Corrigido para void
        this.medicamento = medicamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) { // Corrigido para void
        this.quantidade = quantidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public static List<Venda> getVendas() {
        return vendas;
    }

    public void realizarVenda() {
        // System.out.println("Venda realizada para o cliente: " + cliente.getNome() + ", Medicamento: " + medicamento.getNome() + ", Quantidade: " + quantidade);
    }

    public static void historicoVendas() {
        System.out.println("Lista de Vendas:");
        for (Venda venda : vendas) {
            ///System.out.println("Cliente: " + venda.cliente.getNome() + ", Medicamento: " + venda.medicamento.getNome() + ", Data: " + venda.data);
        }
    }
}
