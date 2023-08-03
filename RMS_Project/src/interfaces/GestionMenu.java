/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import static interfaces.Menu.imXML;
import static interfaces.Menu.pXML;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gadv1
 */
public class GestionMenu extends javax.swing.JPanel {

    DefaultTableModel model;
     
    public GestionMenu() {
        initComponents();
        model = (DefaultTableModel)tabla.getModel();
        mostrarPlatillos("Bebida");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btngenerarPedido = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        panelRound1 = new Modelo.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(174, 53, 117));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, 20));

        btngenerarPedido.setBackground(new java.awt.Color(224, 108, 136));
        btngenerarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btngenerarPedidoMousePressed(evt);
            }
        });
        btngenerarPedido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-dinner-42.png"))); // NOI18N
        btngenerarPedido.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 60));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Registrar orden");
        btngenerarPedido.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jPanel2.add(btngenerarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 80));

        btnAgregar.setBackground(new java.awt.Color(224, 108, 136));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarMousePressed(evt);
            }
        });
        btnAgregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_add_circle_white_24dp.png"))); // NOI18N
        jLabel26.setText("Agregar platillo");
        btnAgregar.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 40));

        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 260, 80));

        btnEliminar.setBackground(new java.awt.Color(224, 108, 136));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarMousePressed(evt);
            }
        });
        btnEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_delete_white_24dp.png"))); // NOI18N
        jLabel23.setText("Eliminar platillo");
        btnEliminar.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 80));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Menu");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        panelRound1.setBackground(new java.awt.Color(174, 53, 117));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre platillo", "Tipo platillo", "Numero ingredientes", "Precio Bs"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 610, 280));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Tipo de platillo");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("*Seleccione un platillo");

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bebida", "Platillo principal", "Postre" }));
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel28))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btngenerarPedidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngenerarPedidoMousePressed
        setColor(btngenerarPedido);
        resetColor(btnAgregar);
        resetColor(btnEliminar);
        
        GenerarPedido m = new GenerarPedido();
        m.setSize(920,529);
        m.setLocation(0,0);
        
        this.removeAll();
        this.add(m,BorderLayout.CENTER);
        this.revalidate();
        this.repaint();

        
    }//GEN-LAST:event_btngenerarPedidoMousePressed

    
    
    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed
        setColor(btnAgregar);
        resetColor(btngenerarPedido);
        resetColor(btnEliminar);
        
        agregarPlatillo m = new agregarPlatillo();
        m.setSize(920,529);
        m.setLocation(0,0);
        
        this.removeAll();
        this.add(m,BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnAgregarMousePressed

    private void btnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMousePressed
        setColor(btnEliminar);
        resetColor(btnAgregar);
        resetColor(btngenerarPedido);
        
        if (tabla.getSelectedRow() == -1){    //Guarda los ingredientes en el xml y llena la tabla de ingredientes ingresados
            JOptionPane.showMessageDialog(null, "Seleccione un ingrediente de la tabla");
        } 
        else {
                if(verificarEliminar(tabla.getValueAt(tabla.getSelectedRow(),0).toString()) == 0){   
                    if(pXML.verificarPlatillo(tabla.getValueAt(tabla.getSelectedRow(),0).toString())){
                     pXML.eliminarPlatillo(tabla.getValueAt(tabla.getSelectedRow(),0).toString());
                     imXML.eliminarIngrediente(tabla.getValueAt(tabla.getSelectedRow(),0).toString());
                     eliminarFila(tabla);
                     mostrarMensajeEliminado();
                    }
                    else{
                     mostrarMensajeNoEncontrado();
                    }
                }
        }
    }//GEN-LAST:event_btnEliminarMousePressed

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        switch(comboTipo.getSelectedItem().toString()){
            case "Bebida":
            vaciarFilas(model,tabla);
            mostrarPlatillos("Bebida");
            break;
            case"Platillo principal":
            vaciarFilas(model,tabla);
            mostrarPlatillos("Platillo principal") ;
            break;
            case"Postre":
            vaciarFilas(model,tabla);
            mostrarPlatillos("Postre");
            break;
        }
    }//GEN-LAST:event_comboTipoActionPerformed

    void setColor(JPanel jp){//funcion para cambiar el color del panel
        jp.setBackground(new Color(255,155,150));
    }
   
    void mostrarPlatillos(String tipoPlatillo){
        int p = 0;
        Object[] row;
        if(!pXML.listaPlatillo().isEmpty()){
            for(int i = 0; i < pXML.listaPlatillo().size() ; i++){
                if(pXML.listaPlatillo().get(i).getTipoPlatillo().equalsIgnoreCase(tipoPlatillo)){
                   row = new Object[5];
                   row[0] = pXML.listaPlatillo().get(i).getNombre(); 
                   row[1] = pXML.listaPlatillo().get(i).getTipoPlatillo();
                   row[2] = pXML.listaPlatillo().get(i).getCantidadIngredientes();
                   row[3] = pXML.listaPlatillo().get(i).getPrecio(); 
                   model.addRow(row); 
                   p++;
                }
            }
            if (p == 0){
               JOptionPane.showMessageDialog(null, "No hay platillos de este tipo ingresados."); 
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay platillos ingresados.");  
        }
    }
    
    void vaciarFilas(DefaultTableModel model,JTable tabla){
        model.getDataVector().removeAllElements();
        tabla.updateUI();
    }
    
    void resetColor(JPanel jp){//funcion para restablecer el color del panel
        
        jp.setBackground(new Color(224,108,136));
    }
    
    
    void eliminarFila(JTable tablaM){
        if (!(tablaM.getSelectedRow() == -1)){
            model.removeRow(tablaM.getSelectedRow());
        }
    }

    void mostrarMensajeNoEncontrado(){
        JOptionPane.showMessageDialog(null, "El platillo no se encuentra registrado");
    }
    
    void mostrarMensajeEliminado(){
        JOptionPane.showMessageDialog(null, "El platilloo se elimino con exito");
    }
    
    int verificarEliminar(String nombre){
         int confirmacion = JOptionPane.showOptionDialog(
                        null,"Desea eliminar el platillo "+nombre+"?", "Eliminar",
                        JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
        return confirmacion;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btngenerarPedido;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private Modelo.PanelRound panelRound1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
