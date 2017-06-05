/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdef;

//import java.awt.Image;
//import java.awt.List;
//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//import javax.imageio.ImageIO;
import javax.swing.*;
import org.jpl7.*;
import pdef.quest_index;
import pdef.Waifuframe;


/**
 *
 * @author Inori
 */
public class interfacewaifu extends javax.swing.JFrame {

    /**
     * Creates new form interfacewaifu
     */
    public boolean bandera = false;
    public interfacewaifu() {
        initComponents();
        String[] init = new String[0];
        jList1.setListData(init); //comenzar con la lista limpia.
        //System.out.println( answ[0]);
        //Ocultar botón 'Siguiente'
        jButton2.setVisible(bandera);
        jButton1.setText("Start");
        jButton3.setText("Result");
        jButton3.setEnabled(!bandera);
        jButton4.setText("<");
        jButton5.setText(">");
        jButton4.setEnabled(bandera);
        jButton5.setEnabled(bandera);
        //Icon iconu = new ImageIcon(getClass().getResource("media\\ukn.jpg"));
        // directorio no encontrado si uso \\ (usando ubuntu)
        Icon iconu = new ImageIcon(getClass().getResource("media/ukn.jpg"));
        //Image ir = (Image) iconu;
        //Image newr = ir.getScaledInstance(100, 200, 150);
        //ImageIcon iconLogo = new ImageIcon("C:\\Users\\Inori\\Pictures\\mamacita1.jpg");
        // la de arriba es para poner directo de directorios las imagenes.
        //jLabel3.setIcon(new ImageIcon(ImageIO.read()));
        jLabel3.setIcon(iconu);
        
        waifuLib initlib = new waifuLib();
        initlib.setlib(); // metodo para mandar a inicializar los frames de Waifus.
        
        //jLabel5.setText(Waifuframe.waifu_Lib[0].waifuName()); funciona bien, esto demuestra
        //que los frames de waifus estan inicializados en este Formulario.
        
        /*TESTING HASHTABLES
        String[] test = {"a","a","b","c","b","e","c"};        
        Set<String> waifuSet;
        waifuSet = new HashSet<>(Arrays.asList(test));
        String[] waifuArray;
        waifuArray = (String[]) waifuSet.toArray(new String[waifuSet.size()]);
        System.out.println(waifuArray.getClass());        
        for (String s : waifuArray)
        {
            System.out.println(s);
        }*/
        
        
        
        Query consulta = new Query(
            new Compound(
                "consult",
                new Term [] {new Atom("waifus.pl")}
            )            
        );
        if (consulta.hasSolution())
            System.out.println("Connected to Prolog correctly");
        else
        {
            System.out.println("Conection to Prolog failed");
            System.exit(0);
        }
    }
    
    //public static String pre1 = "¿Como prefieres el tipo de cabello?";
    //public static String pre2 = "¿que tan largo prefieres que sea el cabello?";
    //estaba usando la declaracion de cadenas, pero es mejor usar un objetos que tengan, 
    //pregunta, respuestas e indice de pregunta asignados.
    public static int qcounter = 0;
    public static int answnum = 20; //numero de respuesta que se van a usar
    //la variable de arriba se refiere a la respuesta qu el usuario da.
    //las opciones de las preguntas se mandan a llamar con el metodo
    public static String[] answ = new String[answnum];
    public static quest_index[] array_of_questions = new quest_index[21]; //arreglo de preguntas que haremos.
    //Query consulta;
    //hubo un problema quee tenia en que no podia usar mi arreglo de preguntas 
    //y tuve que declararlo como un arreglo publico al inicio del programa.
    public int waifucounter = 0; //contador del display.

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 110, 220, 170);

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(60, 290, 100, 23);

        jButton2.setText("jButton2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(170, 290, 100, 23);

        jButton3.setText("jButton3");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(60, 320, 100, 23);

        jButton4.setText("jButton4");
        jPanel1.add(jButton4);
        jButton4.setBounds(300, 110, 73, 23);

        jButton5.setText("jButton5");
        jPanel1.add(jButton5);
        jButton5.setBounds(390, 110, 73, 23);

        jLabel1.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 0));
        jLabel1.setText("Question");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 70, 430, 40);

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 340, 34, 14);

        jLabel3.setText("jLabel3");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 4, true));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(490, 40, 250, 300);

        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(440, 300, 34, 14);

        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(310, 150, 170, 170);

        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(390, 340, 34, 14);

        jLabel8.setBackground(new java.awt.Color(51, 255, 51));
        jLabel8.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Find your ideal Waifu.");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 20, 450, 60);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pdef/media/wallpaper.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(-120, -70, 1062, 602);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //boton inicio.
       bandera = true;
       jButton2.setVisible(bandera);
       jButton2.setText("Siguiente");
       qcounter = 0; // este contador nos dira en que pregunta vamos, si empezamos vuelve a cero.
       //hay que limpiar el arreglo donde vayamos guardando las respuestas. 
       //quest_index[] array_of_questions = new quest_index[10]; //arreglo de preguntas que haremos.
       String[] resp1 = {"dark", "light"};
       String[] resp2 = {"red", "orange", "blonde", "green", "blue", "purple", "brown", "black", "white", "pink"};
       String[] resp3 = {"long", "short"};
       String[] resp4 = {"red", "orange", "yellow", "green", "blue", "purple", "brown", "black", "gray", "pink", "two colors"};
       String[] respb = {"yes", "no"};
       String[] resp5 = {"< 14", "from 15 to 17", "from 17 to 22", ">  22"};
       String[] resps = {"comedy", "drama", "suspense", "schoolar", "magical girls", "shonen", "mecha"};
       array_of_questions[0] = new quest_index(0, "What kind of hair do you like the most?", resp1); 
       array_of_questions[1] = new quest_index(1, "What color of hair do you like the most?", resp2);
       array_of_questions[2] = new quest_index(2, "what kind of long do you like the most?", resp3); 
       array_of_questions[3] = new quest_index(3, "What kind of eyes do you like the most?", resp1); 
       array_of_questions[4] = new quest_index(4, "What color of eyes do you like the most?", resp4); 
       array_of_questions[5] = new quest_index(5, "How old do you prefer your Waifu?", resp5); 
       array_of_questions[6] = new quest_index(6, "Do you like a lovely and sweet girl?", respb); 
       array_of_questions[7] = new quest_index(7, "Do you like girls with violent personality?", respb);
       array_of_questions[8] = new quest_index(8, "Do you like the obsesive girls?", respb);
       array_of_questions[9] = new quest_index(9, "Do you like the girls with assasin impulses?", respb);
       array_of_questions[10] = new quest_index(10, "Do you like to treatyour waifu like a princess?", respb);
       array_of_questions[11] = new quest_index(11, "Do you like the inxpresive/quiet girls?", respb);
       array_of_questions[12] = new quest_index(12, "Do you like the cute and clumsy girls?", respb);
       array_of_questions[13] = new quest_index(13, "Do you like the changes of personality forn paceful to violent?", respb);
       array_of_questions[14] = new quest_index(14, "Do you like the girls with infantile personality?", respb);
       array_of_questions[15] = new quest_index(15, "Do you like the girls with cat's characters?", respb);
       array_of_questions[16] = new quest_index(16, "Do you like the girls with masculine features?", respb);
       array_of_questions[17] = new quest_index(17, "Do you like a energic and happy waifu?", respb);
       array_of_questions[18] = new quest_index(18, "Do you prefer a waifu with a refined and cult touch?", respb);   
       array_of_questions[19] = new quest_index(19, "Do you like a waifu that sing and dance?", respb);
       
       //tuve un problema en la linea anterior, es importante recalcar que el constructor funciona
       //con new, de esta forma ya esta creada y declarada la pregunta y sus respuestas.
       //String[] respuesta1 = new String[2];
       //respuesta1[0]="dark";
       //respuesta1[1]="light"; esta parte tambien se mejoro con el constructor.
       pregunta_resp_list(array_of_questions[0]);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        //int ind = jList1.getLeadSelectionIndex();
        if(bandera)
        {
            if(qcounter < 20)
                {
                    if(!jList1.isSelectionEmpty())
                    {
                        String selection = jList1.getSelectedValue();
                        jLabel2.setText(selection);
                        answ[qcounter] = selection; //guardar en la respuesta en nuestro arreglo de respuestas dadas.
                        System.out.println(answ[qcounter]);
                        qcounter = qcounter + 1;
                        pregunta_resp_list(array_of_questions[qcounter]);
                    }
                    else
                    {
                        String msg = "Select one option!";
                        jLabel4.setText(msg);
                    }
                }
            else
            {
                jButton2.setVisible(false);
                //jList1.setListData(answ);
            }
        }
        else
            
        {
            jLabel2.setText("Can't do that nigga!");
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        int[] countarklocal = dict_change(answ);
        
        
        //String[] test = {"a","a","b","c","b","e","c"};        
        String[] waifuAns=null;
        String[] Cons_Simple = {answ[0],answ[1],answ[2],answ[3],answ[4],answ[5]};
        String[] Arks = {"love","violent_char","obsesive","sadic","princess_treat","inexpressive",
            "clumsy","two_person","inf_char","cat_char","masc_char","happy","refinade"};
        
        if(countarklocal[0]==0)
            waifuAns =Consulta("one_consult_s","X",Cons_Simple.length,Cons_Simple);
        
        //Hashtable para eliminar waifus repetidas
        System.out.println("HASHTABLE RESULT:");
        Set<String> waifuSet;
        waifuSet = new HashSet<>(Arrays.asList(waifuAns));
        String[] waifuArray;
        waifuArray = (String[]) waifuSet.toArray(new String[waifuSet.size()]);
        //System.out.println(waifuArray.getClass());
        for (String s : waifuArray)
        {
            System.out.println(s);
        }
        
        jList1.setListData(waifuAns);
        //for (int i = 0; i < waifuAns.length; i++) {
           // System.out.println();
        //}
        
        // Eliminando
        
        
        
        for(int y=1; y<countarklocal[0]; y++)// ciclo para repetir consultas en base al arquetipo
        {
            y++;
         }
        //waiifuAns = 
        /*String[] hair = {answ[0],answ[1],answ[2]};
        String[] eyes = {answ[3],answ[4]};
        String age = answ[5];
        String[] hairMap,eyesMap;
        hairMap = Consulta("hair","X",hair.length, hair);
        System.out.println("hair");
        for (String hairMap1 : hairMap) {
            System.out.println(hairMap1); 
            jLabel3.setText(hairMap[1]);
        }
        eyesMap = Consulta("eyes","X",eyes.length, eyes);
        System.out.println("eyes");
        for (String eyesMap1 : eyesMap) {
            System.out.println(eyesMap1); 
        }*/
        
        displayWaifus(waifuAns);
    }//GEN-LAST:event_jButton3MouseClicked

    public String[] Consulta(String functionName,String X, int preguntas, String[] arregloQuery)
    {
        Compound tmpC;
        Term[] tmpT;
        tmpT = new Term[1 + arregloQuery.length];
        
        System.out.println("caraojo");
        tmpT[0] = new Variable(X);
        for (int k=1;k <= preguntas;k++)
        {
            tmpT[k] = new Atom(arregloQuery[k-1]);
        }
        
        for (Term tmpT1 : tmpT) {
            System.out.println(tmpT1);
        }
        tmpC = new Compound (functionName,tmpT);
        Query qtmp;
        qtmp = new Query(tmpC);
        System.out.println(qtmp.toString());        
        System.out.println(qtmp.hasSolution());
        Map<String,Term> solution;
        String[] vars= new String[qtmp.allSolutions().length];
        int i=0;        
        while(qtmp.hasMoreSolutions())
        {
            solution = qtmp.nextSolution();
            System.out.println(functionName+"Waifu X: " +solution.get(X));
            vars[i] = solution.get(X).toString();
            i++;
        }
        
        return vars;
        /*
        
        Query consulta = new Query(
            new Compound(
                "consult",
                new Term [] {new Atom("waifus.pl")}
            )            
        );
        if (consulta.hasSolution())
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
        
        String cons = functionName+"("+X+",";
        for(int k=0;k<preguntas;k++)
        {
            cons = cons+arregloQuery[k];
            if (k!=preguntas-1)
                cons = cons+",";
        }
        cons = cons+").";
        String tmppp = "hair(X,light,pink,long).";
        System.out.println(cons);
        Query tmp;
        tmp = new Query(tmppp);
        System.out.println(tmp.hasSolution());
        */
        
    }
    
    
    public void pregunta_resp_list(quest_index v1)
    {
        jList1.setListData(v1.getresponses()); //imprimir respuestas
        jLabel1.setText(v1.getquestionstring()); //imprimir preguntas
        
    }

    private int[] dict_change(String[] v1) {
        int countark[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        //metodo para cmabiar las palabras por lo que se va a consultar
        //con la base de conocimiento.
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
        if("< 14".equals(answ[5])) //cambio las respuestas dadas por variables  ----->
           answ[5]= "a"; // que el prolog pueda entender para que pueda hacer la inferencia de respuestas.
        if("from 15 to 17".equals(answ[5])) //VER LA SECCION %EDADES Y %GUSTOS de waifus.pl
           answ[5]= "b";
        if("from 17 to 22".equals(answ[5]))
           answ[5]= "c";
        if(">  22".equals(answ[5]))
           answ[5]= "d";
        if("yes".equals(answ[6]))
        { 
           countark[0]++;
           countark[1]=1; //countark[1] se refiere a la pregunta 6.
           }
        if("yes".equals(answ[7]))
        { 
            countark[0]++;
            countark[2]=1;
        }
        if("yes".equals(answ[8]))
        { //answ[8]= "obsesive";
            countark[0]++;
            countark[3]=1;
         }
        if("yes".equals(answ[9]))
        {  //answ[9]= "sadic";
            countark[0]++;
            countark[4]=1;
        }
        if("yes".equals(answ[10]))
        {  //answ[10]= "princess_treat";
            countark[0]++;
            countark[5]=1;
        }
        if("yes".equals(answ[11]))
        {   //answ[11]= "inexpressive";
            countark[0]++;
            countark[6]=1;
        }
        if("yes".equals(answ[12]))
        {  
            countark[0]++;
            countark[6]=1;
        }
        if("yes".equals(answ[13]))
        {   //answ[13]= "two_person";
            countark[0]++;
            countark[7]=1;
        }
        if("yes".equals(answ[14]))
        {   //nsw[14]= "inf_char";
            countark[0]++;
            countark[8]=1;
        }
        if("yes".equals(answ[15]))
        {   //answ[15]= "cat_char";
            countark[0]++;
            countark[9]=1;
        }
        if("yes".equals(answ[16]))
        {   //answ[16]= "masc_char";
            countark[0]++;
            countark[10]=1;
        }
        if("yes".equals(answ[17]))
        {   //answ[17]= "happy";
            countark[0]++;
            countark[11]=1;
        }
        if("yes".equals(answ[18]))
        {   //answ[18]= "refinade";
            countark[0]++;
            countark[12]=1;
        }
        if("yes".equals(answ[19]))
           answ[19]= "idol";
        
   return countark;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfacewaifu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfacewaifu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfacewaifu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfacewaifu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfacewaifu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void displayWaifus(String[] waifuAns) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       //int ar = Waifuframe.waifuLib[0].waifuIndex();
       
      // jLabel3.setIcon(waifuAns[waifucounter] );
    }
}
