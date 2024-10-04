package view;

import models.Fornecedor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FornecedorGUI extends JFrame {
    private JTextField nomeField;
    private JTextField cnpjField;
    private JTextField telefoneField;
    private JTextArea listArea;

    public FornecedorGUI() {
        setTitle("Gerenciamento de Fornecedores");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

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

        JPanel actionPanel = new JPanel();
        actionPanel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

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
        JLabel cnpjLabel = new JLabel("CNPJ:");
        inputPanel.add(cnpjLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        cnpjField = new JTextField(20);
        inputPanel.add(cnpjField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel telefoneLabel = new JLabel("Telefone:");
        inputPanel.add(telefoneLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        telefoneField = new JTextField(20);
        inputPanel.add(telefoneField, gbc);

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

        listArea = new JTextArea(10, 40);
        listArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(listArea);

        add(menuPanel, BorderLayout.WEST);
        add(actionPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        clienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ClienteGUI();
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

        medicamentosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MedicamentoGUI();
                dispose();
            }
        });

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarFornecedor();
            }
        });

        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarFornecedores();
            }
        });

        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarFornecedor();
            }
        });

        removerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerFornecedor();
            }
        });

        setVisible(true);
    }

    private void cadastrarFornecedor() {
        String nome = nomeField.getText();
        String cnpj = cnpjField.getText();
        String telefone = telefoneField.getText();
        Fornecedor fornecedor = new Fornecedor(nome, cnpj, telefone);
        JOptionPane.showMessageDialog(this, "Fornecedor cadastrado com sucesso!");
        clearFields();
    }

    private void listarFornecedores() {
        listArea.setText("");
        // Lógica para listar fornecedores (de acordo com a estrutura de dados implementada)
    }

    private void atualizarFornecedor() {
        // Lógica para atualizar fornecedores
    }

    private void removerFornecedor() {
        // Lógica para remover fornecedores
    }

    private void clearFields() {
        nomeField.setText("");
        cnpjField.setText("");
        telefoneField.setText("");
    }

    public static void main(String[] args) {
        new FornecedorGUI();
    }
}
