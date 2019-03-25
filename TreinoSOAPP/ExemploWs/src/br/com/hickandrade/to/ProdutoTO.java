package br.com.hickandrade.to;

import java.io.Serializable;

public class ProdutoTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private int codigo;
	private String nome;
	private double pre�o;

	public ProdutoTO(int codigo, String nome, double pre�o) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.pre�o = pre�o;
	}

	public ProdutoTO() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}

}
