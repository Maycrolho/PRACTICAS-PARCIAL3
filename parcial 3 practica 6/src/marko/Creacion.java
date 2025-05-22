/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marko;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco Antonio
 */
public class Creacion {
    
   public static void main(String[] args) {
     
        
       FileWriter archivo = null;
       try {
           String r = "n";
           FileWriter FileWriter = new FileWriter("datos.txt");
           do {
               archivo.write(JOptionPane.showInputDialog("escribe un dato")+"\n");
               r = JOptionPane.showInputDialog("Escribe un dato");
               archivo.write(r + "\n");
           } while (r.equals("s"));
           archivo.close();
       } catch (IOException ex) {
           java.util.logging.Logger.getLogger(Creacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } finally {
           try {
               archivo.close();
           } catch (IOException ex) {
               java.util.logging.Logger.getLogger(Creacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
           }
       }
        
    }
}
