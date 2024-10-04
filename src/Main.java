import db.ConexaoBancoDeDados;
import models.Cliente;
import models.Pessoa;
import view.ClienteGUI;
import view.FornecedorGUI;
import view.MedicamentoGUI;
import view.VendaGUI;

import java.sql.Connection;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        //Pessoa p = new Pessoa("Robson","2");
        //p.Save();
        //Cliente p = Cliente.Find(1);
        //System.out.println(p.toString());
        //p.setTelefone("11981806389");
        //p.Save();

        //Cliente c = new Cliente("Robson","2","123123123123");
        //Cliente c = Cliente.Find(1);
        //System.out.println(c.toString());
        //c.setTelefone("11981806389");
        //c.Save();
        Main.Tela();
    }

    static void TesteDB(){
        Connection connection = ConexaoBancoDeDados.getConnection();

        if (connection != null) {
            System.out.println("Conexão bem-sucedida!");
            // Aqui você pode adicionar código para trabalhar com o banco de dados.
        } else {
            System.out.println("Falha na conexão!");
        }
    }

    static void Tela(){
        SwingUtilities.invokeLater(() -> {
            JFrame mainFrame = new JFrame("Sistema Farmacêutico");
            mainFrame.setSize(800, 600);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setLocationRelativeTo(null);

            JPanel menuPanel = new JPanel();
            menuPanel.setLayout(new GridLayout(0, 1));
            JButton btnCliente = new JButton("Clientes");
            JButton btnFornecedor = new JButton("Fornecedores");
            JButton btnMedicamento = new JButton("Medicamentos");
            JButton btnVenda = new JButton("Vendas");

            menuPanel.add(btnCliente);
            menuPanel.add(btnFornecedor);
            menuPanel.add(btnMedicamento);
            menuPanel.add(btnVenda);

            mainFrame.getContentPane().add(menuPanel, BorderLayout.WEST);

            mainFrame.setVisible(true);

            btnCliente.addActionListener(e -> {
                ClienteGUI clienteGUI = new ClienteGUI();
                clienteGUI.setVisible(true);
                mainFrame.dispose();
            });

            btnFornecedor.addActionListener(e -> {
                FornecedorGUI fornecedorGUI = new FornecedorGUI();
                fornecedorGUI.setVisible(true);
                mainFrame.dispose();
            });

            btnMedicamento.addActionListener(e -> {
                MedicamentoGUI medicamentoGUI = new MedicamentoGUI();
                medicamentoGUI.setVisible(true);
                mainFrame.dispose();
            });

            btnVenda.addActionListener(e -> {
                VendaGUI vendaGUI = new VendaGUI();
                vendaGUI.setVisible(true);
                mainFrame.dispose();
            });
        });
    }
}
