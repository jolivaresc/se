/*
Esta clase es la libreria de Waifus, en esta cada Waifue esta asociada a sus valores.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdef;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import pdef.Waifuframe;
/**
 *
 * @author Inori
 */
class waifuLib {
    
    public void setlib()
    {
        Icon iakiyama_mio = new ImageIcon(getClass().getResource("media\\akiyama_mio.jpg"));
        Waifuframe.waifu_Lib[0] = new Waifuframe(0,"akiyama_mio", "Mio Akiyama", "K-on!", iakiyama_mio);
        Icon ihatsune_miku = new ImageIcon(getClass().getResource("media\\hatsune_miku.jpg"));
        Waifuframe.waifu_Lib[1] =  new Waifuframe(1, "hatsune_miku", "Miku Hatsunea", "Vocaloid", ihatsune_miku);
    
    }
    
}
