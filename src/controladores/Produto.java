package controladores;

import java.util.ArrayList;

public class Produto {

	String produto;
	double valor;
	
	public static ArrayList<Produto > dados = new ArrayList<>();

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	
}
