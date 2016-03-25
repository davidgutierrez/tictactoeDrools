package com.sample;

import java.util.Scanner;

public class Movimiento {

	public static final String VACIO = "VACIO";
	public static final String LLENO = "LLENO";
	private String estado;
	private int fila,columna;
	public Movimiento(){
		setEstado(VACIO);
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}
	
	@Override
	public String toString() {
		return "Movimiento [estado=" + estado +"]";
	}
	
	public void leerMovimiento(){
		setFila(leer("fila"));
		setColumna(leer("columna"));
		setEstado(LLENO);
	}
	
	public void limpiar(){
		setEstado(VACIO);		
	}
	private static int leer(String celda) {
		int fila =-1;
		do {
			try {
		        System.out.println( "Señale la "+celda );
		    	Scanner scanner = new Scanner(System.in);
		    	String filaStr = scanner.nextLine();
		    	fila= Integer.parseInt(filaStr.trim());
		    	if(fila<-1 || fila>3)
		    		System.err.println("El valor ingresado debe estar entre 0 y 2");
			} catch (Exception e) {
				System.err.println("El valor ingresado no es numerico");
				fila=leer(celda);
				
			}
		} while (fila<-1 || fila>3);
		return fila;
	}



}
