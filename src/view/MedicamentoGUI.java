package view;

import models.Medicamento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MedicamentoGUI extends JFrame {
    private JTextField nomeField;
    private JTextField codigoField;
    private JTextField precoField;
    private JTextField quantidadeField;
    private JTextArea listArea;

    public MedicamentoGUI() {
        setTitle("Gerenciamento de Medicamentos");
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
        JLabel nomeLabel = new JLabel("Nome:");
        inputPanel.add(nomeLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        nomeField = new JTextField(20);
        inputPanel.add(nomeField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel codigoLabel = new JLabel("Código:");
        inputPanel.add(codigoLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        codigoField = new JTextField(20);
        inputPanel.add(codigoField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel precoLabel = new JLabel("Preço:");
        inputPanel.add(precoLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        precoField = new JTextField(20);
        inputPanel.add(precoField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        JLabel quantidadeLabel = new JLabel("Quantidade:");
        inputPanel.add(quantidadeLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        quantidadeField = new JTextField(20);
        inputPanel.add(quantidadeField, gbc);

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

        vendasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VendaGUI();
                dispose();
            }
        });

        // Ações CRUD
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarMedicamento();
            }
        });

        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarMedicamentos();
            }
        });

        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarMedicamento();
            }
        });

        removerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerMedicamento();
            }
        });

        setVisible(true);
    }

    private void cadastrarMedicamento() {
        String nome = nomeField.getText();
        String codigo = codigoField.getText();
        String preco = precoField.getText();
        String quantidade = quantidadeField.getText();
        Medicamento medicamento = new Medicamento(nome, codigo, preco, Integer.parseInt(quantidade));
        JOptionPane.showMessageDialog(this, "Medicamento cadastrado com sucesso!");
        clearFields();
    }

    private void listarMedicamentos() {
        listArea.setText("");
        // Lógica para listar medicamentos
    }

    private void atualizarMedicamento() {
        // Lógica para atualizar medicamento
    }

    private void removerMedicamento() {
        // Lógica para remover medicamento
    }

    private void clearFields() {
        nomeField.setText("");
        codigoField.setText("");
        precoField.setText("");
        quantidadeField.setText("");
    }

    public static void main(String[] args) {
        new MedicamentoGUI();
    }
}
