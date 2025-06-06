/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marco Antonio
 */
public class Mostrar extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    private int renglon =-1;
    private String codigoencontrado = "";

    /**
     * Creates new form mostrar
     * @throws java.io.IOException
     */
    public Mostrar() throws IOException {
        initComponents();
        setClosable(true); //agregamos un boton cerrar
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); //CERRAR MEJOR QUE THIS.hide()
        String [] titulos = {"codigo","Nombre","correo","Telefono","Edad"};
        modelo = new DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        CargarArchivo();
      
    }

      
     private void CargarArchivo() throws IOException {
     try {
        BufferedReader leer = new BufferedReader(new FileReader("agenda.txt"));
            String renglon = "";
            String aux = "";
            while((renglon = leer.readLine()) != null){
                String[] datos = renglon.split(" _ ");
                String c = datos[0];
                String n = datos[1];
                String co = datos[2];
                String t = datos[3];
                String e = datos[4];
                modelo.addRow(new Object[] { c, n, co, t, e});
                tabla.setModel(modelo);
            }
        leer.close();
         } catch (FileNotFoundException ex) {
                Logger.getLogger(Mostrar.class.getName()).log(Level.SEVERE, null, ex);
        
        
       }
     } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. Th * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        t = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        jPanel2.setPreferredSize(new java.awt.Dimension(619, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 691, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setPreferredSize(new java.awt.Dimension(619, 20));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 691, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel4.setLayout(new java.awt.GridLayout(4, 1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminar);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel4.add(btnModificar);

        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel7);

        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_END);

        jPanel5.setPreferredSize(new java.awt.Dimension(20, 322));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, java.awt.BorderLayout.LINE_START);

        jPanel1.setLayout(new java.awt.GridLayout(1, 1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        t.setViewportView(tabla);

        jPanel1.add(t);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel7MouseClicked

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

    }//GEN-LAST:event_tablaMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
      
        if(renglon == -1){
            JOptionPane.showMessageDialog(null, "elige una fila");
        }else{
         BufferedReader leer = null;
            try {
                 FileWriter archivo = new FileWriter("auxiliar.txt");
                JOptionPane.showMessageDialog(null,codigoencontrado);
                leer = new BufferedReader(new FileReader("agenda.txt"));
                String renglon = "";
                String aux = "";
                while ((renglon = leer.readLine()) != null) {
                    //aux += renglon + "\n";
                    if(renglon.length()!= 0){
                    String [] partes = renglon.split(" _ ");
                    
                    if(codigoencontrado.equals(partes[0])){
                    
                    }else{
                       
          
               archivo.write(renglon+"\n");
             
                  }
                }  
                }
       
           archivo.close();
                 
             leer.close();  
                
                
                
                File arg = new File("agenda.txt");
                 File arg2 = new File("auxiliar.txt");
                Path original = Paths.get("auxiliar.txt");
                Path modificar = Paths.get("agenda.txt");

                 if (arg.exists() && arg2.exists()) {
    // arg.delete();
                Files.move(original, modificar,
               StandardCopyOption.REPLACE_EXISTING);
}

               
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Mostrar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Mostrar.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    leer.close();
                } catch (IOException ex) {
                    Logger.getLogger(Mostrar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
if (renglon == -1) {
    JOptionPane.showMessageDialog(null, "Elige una fila");
} else {
    BufferedReader leer = null;
    try {
        FileWriter archivo = new FileWriter("auxiliar.txt");
        JOptionPane.showMessageDialog(null, codigoencontrado);
        leer = new BufferedReader(new FileReader("agenda.txt"));
        String renglon = "";
        String aux = "";
        while ((renglon = leer.readLine()) != null) {
            if (renglon.length() != 0){
                String[] partes = renglon.split(" _ ");
                if (codigoencontrado.equals(partes[0])) {
                    

                     String co = JOptionPane.showInputDialog("Escribe el código"); 
                    String nom = JOptionPane.showInputDialog("Escribe el nombre");
                    String cor = JOptionPane.showInputDialog("Escribe el correo");
                    String tel = JOptionPane.showInputDialog("Escribe el Teléfono");
                    String ed = JOptionPane.showInputDialog("Escribe la edad");
                    nom = nom.toUpperCase();
                    cor = cor.toLowerCase();
                    archivo.write(co+" _ "+nom+" _ "+cor+" _ "+tel+" _ "+ed+"\n");
                } else {
                    archivo.write(renglon+ "\n");
                }
            }
        }
        archivo.close();
        leer.close();

        File arg = new File("agenda.txt");
        File arg2 = new File("auxiliar.txt");
        Path original = Paths.get("auxiliar.txt");
        Path modificar = Paths.get("agenda.txt");

        if (arg.exists() && arg2.exists()) {
            // arg.delete();
            Files.move(original, modificar, 
                    StandardCopyOption.REPLACE_EXISTING);
        }

    } catch (FileNotFoundException ex) {
        Logger.getLogger(Mostrar.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Mostrar.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
 renglon = tabla.getSelectedRow();
// JOptionPane.showMessageDialog(null, renglon);

if (renglon == -1) {
    JOptionPane.showMessageDialog(null, "Elige una fila");
} else {
   tabla.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
           codigoencontrado = tabla.getValueAt(renglon, 0).toString();
            //JOptionPane.showMessageDialog(null, "Código: " + codigoencontrado);
        }
    });
}

    }//GEN-LAST:event_tablaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane t;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
