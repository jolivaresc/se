/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdef;

import org.jpl7.Query;

/**
 *
 * @author Inori
 */
public class Pdef {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String t1 = "consult('waifus.pl')";//aqui colocan el nombre de su archivo a compilar
        String t2 = "appears_on(hatsune_miku, X)";
       
        //Query q1 = new Query(t1);
        //Query q2 = new Query(t2);
       // java.util.Hashtable s3= q2.nextSolution();
        interfazwaifu mostrar = new interfazwaifu();
        mostrar.setVisible(true);
        
    }
    
}
