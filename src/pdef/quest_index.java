/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdef;

/**
 *
 * @author Inori
 */
 public class quest_index
    {
         private int index;
         private String preguntax;
         private String[] respuestas;
         
         public quest_index(int newindex, String newpregunta, String[] newresps)
         {
             //constructor de preguntas
             index = newindex;
             preguntax = newpregunta;
             respuestas = newresps;
         }
         
         public String getquestionstring()
         {
             return preguntax;
         }
         public int getquestindex()
         {
             return index;
         }
         public String[] getresponses()
         {
             return respuestas;
         }
    }
