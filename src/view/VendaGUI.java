package view;

import models.Venda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendaGUI extends JFrame {
    private JTextField clienteField;
    private JTextField medicamentoField;
    private JTextField quantidadeField;
    private JTextField precoField;
    private JTextArea listArea;

    public VendaGUI() {
        setTitle("Gerenciamento de Vendas");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Painel lateral para navegação
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(4, 1));
        JButton clienteButton = new JButton("Cliente");
        JButton fornecedorButton = new JButton("Fornecedor");
        JButton vendasButton = new JButton("Vendas");
        JButton medicamentosButton = new JButton("Medicamentos");

        menuPanel.add(clienteButton);
        menuPanel.add(fornecedorButton);
        menuPanel.add(vendasButton);
        menuPanel.add(medicamentosButton);

        // Painel de entrada e botões
        JPanel actionPanel = new JPanel();
        actionPanel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Campos de entrada
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel clienteLabel = new JLabel("Cliente:");
        inputPanel.add(clienteLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        clienteField = new JTextField(20);
        inputPanel.add(clienteField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel medicamentoLabel = new JLabel("Medicamento:");
        inputPanel.add(medicamentoLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        medicamentoField = new JTextField(20);
        inputPanel.add(medicamentoField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel quantidadeLabel = new JLabel("Quantidade:");
        inputPanel.add(quantidadeLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        quantidadeField = new JTextField(20);
        inputPanel.add(quantidadeField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        JLabel precoLabel = new JLabel("Preço:");
        inputPanel.add(precoLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        precoField = new JTextField(20);
        inputPanel.add(precoField, gbc);

        // Botões de ação
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 4));
        JButton cadastrarButton = new JButton("Cadastrar");
        JButton listarButton = new JButton("Listar");
        JButton atualizarButton = new JButton("Atualizar");
        JButton removerButton = new JButton("Remover");

        buttonPanel.add(cadastrarButton);
        buttonPanel.add(listarButton);
        buttonPanel.add(atualizarButton);
        buttonPanel.add(removerButton);

        actionPanel.add(inputPanel, BorderLayout.CENTER);
        actionPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Área de listagem
        listArea = new JTextArea(10, 40);
        listArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(listArea);

        add(menuPanel, BorderLayout.WEST);
        add(actionPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        // Ações de navegação
        clienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ClienteGUI();
                dispose();
            }
        });

        fornecedorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FornecedorGUI();
                dispose();
            }
        });

        medicamentosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MedicamentoGUI();
                dispose();
            }
        });

        // Ações CRUD
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarVenda();
            }
        });

        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarVendas();
            }
        });

        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarVenda();
            }
        });

        removerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerVenda();
            }
        });

        setVisible(true);
    }

    private void cadastrarVenda() {
        String cliente = clienteField.getText();
        String medicamento = medicamentoField.getText();
        String quantidade = quantidadeField.getText();
        String preco = precoField.getText();
        Venda venda = new Venda(cliente, medicamento, Integer.parseInt(quantidade), Double.parseDouble(preco));
        JOptionPane.showMessageDialog(this, "Venda cadastrada com sucesso!");
        clearFields();
    }

    private void listarVendas() {
        listArea.setText("");
        // Lógica para listar vendas
    }

    private void atualizarVenda() {
        // Lógica para atualizar vendas
    }

    private void removerVenda() {
        // Lógica para remover vendas
    }

    private void clearFields() {
        clienteField.setText("");
        medicamentoField.setText("");
        quantidadeField.setText("");
        precoField.setText("");
    }

    public static void main(String[] args) {
        new VendaGUI();
    }
}
