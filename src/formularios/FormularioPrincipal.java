package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.JToolBar;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;

public class FormularioPrincipal extends JFrame {

	private JPanel formulario;




	public FormularioPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\104881\\Desktop\\Java - Fundamentos\\06 - OO\\15 - Interface Gr\u00E1fica\\icone_java.png"));
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 233, 301);
		formulario = new JPanel();
		formulario.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(formulario);
		
		JButton botacadastro = new JButton("Cadastrar");
		botacadastro.setBounds(54, 34, 103, 32);
		botacadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				dispose();
				
				FormularioCadastro a = new FormularioCadastro();
				a.setVisible(true);
				
				
			}
		});
		formulario.setLayout(null);
		formulario.add(botacadastro);
		
		JButton botaopedido = new JButton("Pedido");
		botaopedido.setBounds(54, 77, 103, 32);
		botaopedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
				
				FormularioPedidos a = new FormularioPedidos();
				a.setLocationRelativeTo(null);
				a.setVisible(true);
				
			}
		});
		formulario.add(botaopedido);
		
		JButton botaohistorico = new JButton("Hist\u00F3rico");
		botaohistorico.setBounds(54, 120, 103, 32);
		botaohistorico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		formulario.add(botaohistorico);
		
		JButton botaoestatistica = new JButton("Est\u00E1tisticas");
		botaoestatistica.setBounds(54, 163, 103, 32);
		botaoestatistica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		formulario.add(botaoestatistica);
		
		JButton botaosair = new JButton("Sair");
		botaosair.setBounds(54, 206, 103, 32);
		botaosair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				dispose();
			}
		});
		formulario.add(botaosair);
	}
}
