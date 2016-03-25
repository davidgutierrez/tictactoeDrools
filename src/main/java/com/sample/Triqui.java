package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class Triqui 
{
	private static KieSession kSession = null;

	private void ejecutar ()
	{
        try 
        {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
    	    kSession = kContainer.newKieSession("ksession-rules");
            // go !
            inicializar (kSession);
            kSession.fireAllRules();
    //        imprimirSession();
        } 
        catch (Throwable t) 
        {
            t.printStackTrace();
        }finally {
            kSession.dispose ();

		}
	}

	
	private static void inicializar (KieSession kSession)
	{
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
		        Celda celda = new Celda (i, j);
		        kSession.insert(celda);
			}
		}
		kSession.insert(new Turno ());
		kSession.insert(new Movimiento());
	}

    public static final void main(String[] args) 
    {
    	Triqui tt = new Triqui ();
    	tt.ejecutar ();
    }
    
  
	public static void imprimirSession() {
		String[][] matrix = new String[3][3];
		for (Object object : kSession.getObjects()) {
			if(object.getClass().equals(Celda.class)){
				Celda celda = (Celda)object;
				matrix[celda.getI()][celda.getJ()] = celda.getValor();
			}
			//System.out.println(object.toString());
		}
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(matrix[i][0]+"|"+matrix[i][1]+"|"+matrix[i][2]);
		}
	}

}
