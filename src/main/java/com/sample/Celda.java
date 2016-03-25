package com.sample;

public class Celda
{
	public static final String EQUIS = "X";
	public static final String OES = "O";
	public static final String NADA = "-";

	private int i;
	private int j;
	private String valor;

	public Celda (int i, int j)
	{
		super ();
		this.i = i;
		this.j = j;
		valor = NADA;
	}
	
	public String getValor ()
	{
		return valor;
	}
	
	public void setValor (String valor)
	{
		this.valor = valor;
	}
	
	public int getI ()
	{
		return i;
	}
	
	public int getJ ()
	{
		return j;
	}


	public boolean esVacia(){
		return valor.equals(NADA);
	}
	
	@Override
	public String toString() {
		return "Celda [i=" + i + ", j=" + j + ", valor=" + valor + "]";
	}

}
