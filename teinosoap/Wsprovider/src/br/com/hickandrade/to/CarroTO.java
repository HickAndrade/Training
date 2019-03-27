package br.com.hickandrade.to;

import java.io.Serializable;

public class CarroTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int codigo;
	private String marca;
	private double pre�o;

	public CarroTO(int codigo, String marca, double pre�o) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.pre�o = pre�o;
	}

	public CarroTO() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}

}
