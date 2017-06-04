/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdef;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Inori
 */


public class Waifuframe {
    private String plvariable;
    private String name;
    private String serie;
    private Icon waifuImage;
    private int waifuind;
    
    public Waifuframe(int index, String PLvar, String Nam, String Seri, Icon Wph)
    {
        waifuind = index;
        plvariable = PLvar;
        name = Nam;
        serie = Seri;
        waifuImage = Wph;
    }
    
    public String waifuName()
            {
                return name;
            }
    public String waifuSerie()
            {
                return serie;
            }
    public Icon waifuImage()
            {
                return waifuImage;
            }
    public int waifuIndex()
    {
        return waifuind;
    }
    /*public void prueba()
    {     
       Toolkit tk = Toolkit.getDefaultToolkit();
       Image imagetry = tk.createImage("images/mamacita.jpg");
       //Wframe Wprueba = new Wframe("st", "sh", "rer", );
        
    }*/
 /*
    Icon iakiyama_mio = new ImageIcon(getClass().getResource("media\\akiyama_mio.jpg"));
    Waifuframe akiyama_mio = new Waifuframe(0,"akiyama_mio", "Mio Akiyama", "K-on!", iakiyama_mio);
    Icon ihatsune_miku = new ImageIcon(getClass().getResource("media\\hatsune_miku.jpg"));
    Waifuframe hatsune_miku = new Waifuframe(1, "hatsune_miku", "Miku Hatsunea", "Vocaloid", ihatsune_miku);
    */
    public static Waifuframe waifu_Lib[] = new Waifuframe[100];
   
    
     /*public void setwaifulib() 
     {
            Icon iakiyama_mio = new ImageIcon(getClass().getResource("media\\akiyama_mio.jpg"));
            waifuLib[0] = new Waifuframe(0,"akiyama_mio", "Mio Akiyama", "K-on!", iakiyama_mio);
            Icon ihatsune_miku = new ImageIcon(getClass().getResource("media\\hatsune_miku.jpg"));
            waifuLib[1] =  new Waifuframe(1, "hatsune_miku", "Miku Hatsunea", "Vocaloid", ihatsune_miku);
        }
    */

    /* public class setwaifulib {
    
    public void setwaifulib() {
    Icon iakiyama_mio = new ImageIcon(getClass().getResource("media\\akiyama_mio.jpg"));
    waifuLib[0] = new Waifuframe(0,"akiyama_mio", "Mio Akiyama", "K-on!", iakiyama_mio);
    Icon ihatsune_miku = new ImageIcon(getClass().getResource("media\\hatsune_miku.jpg"));
    waifuLib[1] =  new Waifuframe(1, "hatsune_miku", "Miku Hatsunea", "Vocaloid", ihatsune_miku);
    }
    }*/
   
}








