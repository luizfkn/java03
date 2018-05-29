package controladores;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Acao {

	static JCheckBox caixa;
	
	public void cadastrar(String produto, double valor){
		Produto a = new Produto();
		a.produto = produto;
		a.valor = valor;
		
		a.dados.add(a);
	}

	public DefaultTableModel listar(){
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Produto");
		modelo.addColumn("Valor");
		
		for(int i = 0; i < Produto.dados.size(); i++){
			modelo.addRow(new Object[]{
			Produto.dados.get(i).getProduto(),
			Produto.dados.get(i).getValor()
					
			});
			
		}
		
		return modelo;
	}
	
	
public static JPanel estrutura(){
		
		JPanel painel = new JPanel();
		painel.setBounds(10, 10, 400, 400);
		
		for(int i=0; i<10; i++){
			caixa = new JCheckBox();
			caixa.setText(String.valueOf(i));
			caixa.setBounds(10, i*20, 100, 20);
			painel.add(caixa);
		}
		
		return painel;
		
	}
	
}

	
	

