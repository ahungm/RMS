/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Color;
import javax.swing.JPanel;
import Modelo.Mesero;
import static interfaces.Menu.mXML;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gadv1
 */
public class GestionPersonal extends javax.swing.JPanel {
    
    Mesero m = new Mesero();
    DefaultTableModel model;
    
    public GestionPersonal() {
        initComponents();
        llenarTabla(mXML.listaMesero());
        model = (DefaultTableModel)tabla.getModel();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        panelRound1 = new Modelo.PanelRound();
        panelRound2 = new Modelo.PanelRound();
        panelRound3 = new Modelo.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        labeltxt = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 93, 93));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 370));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Personal");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        btnAgregar.setBackground(new java.awt.Color(255, 145, 143));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarMousePressed(evt);
            }
        });
        btnAgregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_add_circle_white_24dp.png"))); // NOI18N
        jLabel26.setText("Agregar personal");
        btnAgregar.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 40));

        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 260, 80));

        btnEliminar.setBackground(new java.awt.Color(255, 145, 143));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarMousePressed(evt);
            }
        });
        btnEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_delete_white_24dp.png"))); // NOI18N
        jLabel23.setText("Eliminar personal");
        btnEliminar.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 260, 80));

        panelRound1.setBackground(new java.awt.Color(252, 79, 79));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(252, 79, 79));
        panelRound2.setRoundBottomLeft(30);
        panelRound2.setRoundBottomRight(30);
        panelRound2.setRoundTopLeft(30);
        panelRound2.setRoundTopRight(30);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound3.setBackground(new java.awt.Color(255, 93, 93));
        panelRound3.setRoundBottomLeft(30);
        panelRound3.setRoundBottomRight(30);
        panelRound3.setRoundTopLeft(30);
        panelRound3.setRoundTopRight(30);
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Genero", "Codigo trabajador", "Edad", "Numero de telf"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        panelRound3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 610, 299));

        labeltxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labeltxt.setForeground(new java.awt.Color(153, 153, 153));
        labeltxt.setText("*Seleccione un miembro del personal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 397, Short.MAX_VALUE)
                        .addComponent(labeltxt)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(labeltxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(99, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed
        setColor(btnAgregar);
        resetColor(btnEliminar);

        agregarPersonal m = new agregarPersonal();
        m.setSize(920,528);
        m.setLocation(0,0);
        
        this.removeAll();
        this.add(m,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        this.revalidate();
        this.repaint();
       
    }//GEN-LAST:event_btnAgregarMousePressed

    private void btnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMousePressed
        setColor(btnEliminar);
        resetColor(btnAgregar);
        
        if (tabla.getSelectedRow() == -1){    //Guarda los ingredientes en el xml y llena la tabla de ingredientes ingresados
            JOptionPane.showMessageDialog(null, "Seleccione un elemento de la tabla");
        }
        else {
            if(mXML.verificarMesero(tabla.getValueAt(tabla.getSelectedRow(),3).toString())){
                if (confirmarEliminar(tabla.getValueAt(tabla.getSelectedRow(),0).toString()) == 0){
                 mXML.eliminarMesero(tabla.getValueAt(tabla.getSelectedRow(),3).toString());
                 eliminarFila();
                JOptionPane.showMessageDialog(null, "El empleado se elimino con exito");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "El empleado no se encontro");
            }
        }

    }//GEN-LAST:event_btnEliminarMousePressed

    void setColor(JPanel jp){//funcion para cambiar el color del panel
        jp.setBackground(new Color(255,174,148));
    }
   
    void resetColor(JPanel jp){//funcion para restablecer el color del panel    
        jp.setBackground(new Color(255,145,143));
    }
    
    void eliminarFila(){
        if (!(tabla.getSelectedRow() == -1)){
            model.removeRow(tabla.getSelectedRow());
        }
    }
    
    int confirmarEliminar(String nombre){
         int confirmacion = JOptionPane.showOptionDialog(
                        null,"Desea eliminar al empleado del sistema "+nombre+"?", "Confirmar eliminacion",
                        JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
        return confirmacion;
    }
    
 void llenarTabla(LinkedList<Mesero> m){
       if(!m.isEmpty()){
       DefaultTableModel model = (DefaultTableModel)tabla.getModel();
       Object[] row;
        for(int i = 0; i < m.size() ; i++){
                    row = new Object[6];
                    row[0] =  m.get(i).getNombre();
                    row[1] =  m.get(i).getApellido();
                    row[2] =  m.get(i).getGenero();
                    row[3] =  m.get(i).getCodigo();
                    row[4] =  m.get(i).getEdad();
                    row[5] =  m.get(i).getTelefono();
                    model.addRow(row);
            } 
       }
       else{
           JOptionPane.showMessageDialog(null, "No se ha registrado ningun trabajador");
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labeltxt;
    private Modelo.PanelRound panelRound1;
    private Modelo.PanelRound panelRound2;
    private Modelo.PanelRound panelRound3;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
