package com.sample;

public class Turno 
{
	public static final String MI_TURNO = "Mi turno";
	public static final String SU_TURNO = "Su turno";
	public static final String TERMINAR = "Terminar";
	
	private String turno;
	
	public Turno ()
	{
		double t = Math.random ();
		turno = t < .5 ? MI_TURNO : SU_TURNO;
	}

	public String getTurno() 
	{
		return turno;
	}

	public void setTurno(String turno) 
	{
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Turno [turno=" + turno + "]";
	}

}
