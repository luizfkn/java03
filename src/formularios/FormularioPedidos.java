package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormularioPedidos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public FormularioPedidos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 237, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do Cliente");
		lblNewLabel.setBounds(10, 30, 78, 37);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(88, 30, 113, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPedido = new JLabel("Pedido");
		lblPedido.setBounds(10, 85, 46, 14);
		contentPane.add(lblPedido);
	}
}
