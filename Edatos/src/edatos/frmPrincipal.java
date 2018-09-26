package edatos;

import com.google.gson.Gson;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class frmPrincipal extends javax.swing.JFrame {

   public Contactos1 contactos; 
   
    public frmPrincipal() {
        initComponents();
        deserializar();        
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelHeader = new javax.swing.JPanel();
        btnCrearContacto = new javax.swing.JButton();
        txtCedula1 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        frmListarContacto = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        PanelEscriorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        PanelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edatos/nuevo.png"))); // NOI18N
        btnCrearContacto.setText("Crear Contacto");
        btnCrearContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearContactoActionPerformed(evt);
            }
        });
        PanelHeader.add(btnCrearContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtCedula1.setPreferredSize(new java.awt.Dimension(6, 24));
        txtCedula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedula1ActionPerformed(evt);
            }
        });
        PanelHeader.add(txtCedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 150, 40));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edatos/search.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        PanelHeader.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 110, -1));

        frmListarContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edatos/listar.png"))); // NOI18N
        frmListarContacto.setText("Listar Contactos");
        frmListarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmListarContactoActionPerformed(evt);
            }
        });
        PanelHeader.add(frmListarContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edatos/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        PanelHeader.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));

        PanelEscriorio.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout PanelEscriorioLayout = new javax.swing.GroupLayout(PanelEscriorio);
        PanelEscriorio.setLayout(PanelEscriorioLayout);
        PanelEscriorioLayout.setHorizontalGroup(
            PanelEscriorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelEscriorioLayout.setVerticalGroup(
            PanelEscriorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
            .addComponent(PanelEscriorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelEscriorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   private void deserializar(){
        BufferedReader br = null;
        try {
            Gson gson =new Gson();
       
            br = new BufferedReader(new FileReader("datos.json"));
             contactos = gson.fromJson(br, Contactos1.class);
             System.out.println("ok");
        } catch (FileNotFoundException ex) {
           System.out.println("Error en archivo. Verifique");
        }
    
    }
    
  
    private void txtCedula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedula1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedula1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCrearContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearContactoActionPerformed
        // TODO add your handling code here:
        frmContacto frmcontacto = new frmContacto(this.contactos);
        Dimension escritorioSize=this.PanelEscriorio.getSize();
        Dimension frmcontactoSize=frmcontacto.getSize();
        frmcontacto.setLocation((escritorioSize.width - frmcontactoSize.width)/2, (escritorioSize.height -frmcontactoSize.height)/2);    
        
        this.PanelEscriorio.add(frmcontacto);
        frmcontacto.show();
        
    }//GEN-LAST:event_btnCrearContactoActionPerformed

    private void frmListarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmListarContactoActionPerformed
        // TODO add your handling code here:
        frmListarContactos frmlistarcontactos = new frmListarContactos(this.contactos);
        Dimension escritorioSize=this.PanelEscriorio.getSize();
        Dimension frmcontactoSize=frmlistarcontactos.getSize();
        frmlistarcontactos.setLocation((escritorioSize.width - frmcontactoSize.width)/2, (escritorioSize.height - frmcontactoSize.height)/2);    
        
        this.PanelEscriorio.add(frmlistarcontactos);
        frmlistarcontactos.show();
    }//GEN-LAST:event_frmListarContactoActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane PanelEscriorio;
    private javax.swing.JPanel PanelHeader;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearContacto;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton frmListarContacto;
    private javax.swing.JTextField txtCedula1;
    // End of variables declaration//GEN-END:variables
}
