package br.com.produtos.webservice.cliente.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import br.com.produtos.webservice.cliente.controle.CtrlCadastrarProdutos;
import br.com.produtos.webservice.cliente.modelo.Produtos;

public class FormCadastarProdutos extends JFrame {

	private static final long serialVersionUID = 3421556120203255294L;

	private JLabel labelNome, labelValor;
	private JTextField nome, valor;
	private JButton cadastrar;
	private JTable table;
	private CtrlCadastrarProdutos controle = new CtrlCadastrarProdutos();
	private DefaultTableModel tableModel = new DefaultTableModel(new String[] {
			"nome", "valor" }, 0);

	public FormCadastarProdutos() {
		setSize(500, 500);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel(new FlowLayout());

		/* Configura tabela */
		table = new JTable(tableModel);
		JScrollPane jScrollPane = new JScrollPane(table);
		jScrollPane.setPreferredSize(new Dimension(500, 500));
		
		labelNome = new JLabel("Nome");
		labelNome.setSize(100, 10);
		nome = new JTextField(20);
		nome.setName("name");
		JPanel panelName = new JPanel();
		panelName.setSize(500, 10);
		panelName.add(labelNome);
		panelName.add(nome);

		labelValor = new JLabel("Valor");
		labelValor.setSize(100, 10);
		valor = new JTextField(20);
		valor.setSize(100, 10);
		valor.setName("valor");
		JPanel panelValor = new JPanel();
		panelValor.add(labelValor);
		panelValor.add(valor);
		
		cadastrar = new JButton("Cadastrar");
		cadastrar.setName("cadastrar");
		JPanel panelButtom = new JPanel();
		panelButtom.add(cadastrar);

		panel.add(panelName);
		panel.add(panelValor);
		panel.add(panelButtom);
		panel.add(jScrollPane);

		cadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					controle.newProduto(nome.getText(), Double.parseDouble(valor.getText()));
					atualizaLista();
				} catch (Exception exception) {
					JOptionPane.showMessageDialog(null, "Valor informado é inválido");
				}
			}
		});

		getContentPane().add(panel);

		atualizaLista();
	}

	private void atualizaLista() {
		tableModel.getDataVector().removeAllElements();
		tableModel.fireTableDataChanged();
		for (Produtos produto : controle.getProdutos()) {
			tableModel.addRow(new String[] { produto.getNome(),
					String.valueOf(produto.getValor()) });
		}
	}

	public static void main(String[] args) {
		FormCadastarProdutos frame = new FormCadastarProdutos();
		frame.setVisible(true);
	}

}
