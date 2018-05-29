package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import controladores.Acao;

import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoValor;


	public FormularioCadastro() {
		setTitle("Cadastro de pedidos");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 239, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		campoNome = new JTextField();
		campoNome.setBounds(66, 25, 101, 26);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblProduto.setBounds(10, 31, 46, 14);
		contentPane.add(lblProduto);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblValor.setBounds(10, 79, 46, 14);
		contentPane.add(lblValor);
		
		campoValor = new JTextField();
		campoValor.setBounds(66, 73, 101, 26);
		contentPane.add(campoValor);
		campoValor.setColumns(10);
		
		Acao a = new Acao();
		
		JTable tabela = new JTable(a.listar());
			
			JScrollPane barra = new JScrollPane(tabela);
			barra.setBounds(10, 150, 200, 200);
		
		
		
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String nome = campoNome.getText();
			double valor = Double.parseDouble(campoValor.getText());
			
			a.cadastrar(nome, valor);
			tabela.setModel(a.listar());
			
			
			
			
			
			
			}
		});
		btnNewButton.setBounds(10, 113, 89, 26);
		contentPane.add(btnNewButton);
		contentPane.add(barra);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
				FormularioPrincipal a = new FormularioPrincipal();
				a.setLocationRelativeTo(null);
				a.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(106, 113, 94, 26);
		contentPane.add(btnNewButton_1);
	}
}
