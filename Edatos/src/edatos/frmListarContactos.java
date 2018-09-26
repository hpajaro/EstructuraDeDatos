package edatos;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
 
public final class frmListarContactos extends javax.swing.JInternalFrame {

    private final String[] nombreColumnas ={"Cedula","Nombres","Apellidos","Correo","Celular"};
    private final String arreglo[][];
    private Contactos1 contactos;
    public frmListarContactos(Contactos1 contactos) {
        initComponents();
        this.contactos=contactos;
        arreglo= convertirHashToArray2D(contactos.size(),nombreColumnas.length);
        TableModel modelo = new ModeloTabla();
         tablaContactos.setModel(modelo);      
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaContactos = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("Lista de Contactos");

        jScrollPane2.setViewportView(tablaContactos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel1)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  public String[][] convertirHashToArray2D(int m, int n){
        String[][] arreglo1 =new String[m][n];       
        Collection c=contactos.values();
        Iterator iterador = c.iterator();
        int i=0;
       while (iterador.hasNext()){
           Persona  valor =(Persona)iterador.next();
           
            arreglo1[i][0]=valor.getCedula();
            arreglo1[i][1]=valor.getNombres();
            arreglo1[i][2]=valor.getApellidos();
            arreglo1[i][3]=valor.getCorreo();
            arreglo1[i][4]=valor.getCelular();
            i++;
           }
         return arreglo1;           
    }
  public class ModeloTabla extends AbstractTableModel{

        @Override
        public int getRowCount() {
           return contactos.size();
        }

        @Override
        public int getColumnCount() {
            return nombreColumnas.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {           
           return arreglo[rowIndex][columnIndex];
        }

        @Override
        public String getColumnName(int column) {
           return nombreColumnas[column];
        }
    
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaContactos;
    // End of variables declaration//GEN-END:variables
}
