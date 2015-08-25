package br.com.produtos.webservices.cliente.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import br.com.produtos.webservices.cliente.Produtos;
import br.com.produtos.webservices.cliente.controle.CtrlCadastrarProdutos;

public class FormCadastarProdutos extends JFrame {

	private static final long serialVersionUID = 3421556120203255294L;

	private JTextField nome, valor;
	private JButton cadastrar;
	private JTable table;
	private CtrlCadastrarProdutos controle = new CtrlCadastrarProdutos();

	public FormCadastarProdutos() {
		setSize(500, 500);

		JPanel panel = new JPanel(new FlowLayout());
		panel.setSize(100, 10);

		nome = new JTextField(20);
		nome.setName("name");

		valor = new JTextField(20);
		valor.setSize(100, 10);
		valor.setName("valor");

		cadastrar = new JButton("Cadastrar");
		cadastrar.setName("cadastrar");

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("teste");
		arrayList.add("teste");

		DefaultTableModel tableModel = new DefaultTableModel(new String[] {
				"nome", "valor" }, 0);

		table = new JTable(tableModel);

		JScrollPane jScrollPane = new JScrollPane(table);
		jScrollPane.setPreferredSize(new Dimension(500, 200));

		panel.add(nome);
		panel.add(valor);
		panel.add(cadastrar);
		panel.add(jScrollPane);

		cadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				controle.newProduto(nome.getText(), Double.parseDouble(valor.getText()));
				tableModel.addRow(new String[] { nome.getText(), valor.getText() });
				atualizaLista();
			}
		});

		getContentPane().add(panel);
	}

	private void atualizaLista() {
		controle.getProdutos();
		for (Produtos produtos : controle.getProdutos()) {
		     //TODO retorna uma lista de produtos incompativel com a classe de produtos do servidor
		}
	}

	public static void main(String[] args) {
		FormCadastarProdutos frame = new FormCadastarProdutos();
		frame.setVisible(true);
	}

}
