/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdef;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Inori
 */


public class Wframe {
    private String plvariable;
    private String name;
    private String serie;
    private Image wimage;
    
    
    public Wframe(String PLvar, String Nam, String Seri, Image Wph)
    {
        plvariable = PLvar;
        name = Nam;
        serie = Seri;
        wimage = Wph;
    }
    
    public String waifuName()
            {
                return name;
            }
    public String waifuSerie()
            {
                return serie;
            }
    public Image waifuImage()
            {
                return wimage;
            }
    public void prueba()
    {     
       Toolkit tk = Toolkit.getDefaultToolkit();
       Image imagetry = tk.createImage("images/mamacita.jpg");
       Wframe Wprueba = new Wframe("st", "sh", "rer", imagetry);
        
    }
}





