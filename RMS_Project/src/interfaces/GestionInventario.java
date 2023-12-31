/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;


import Modelo.*;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static interfaces.Menu.*;

/**
 *
 * @author gadv1
 */
public class GestionInventario extends javax.swing.JPanel {

    Aceites aceite = new Aceites(0,0,0,0,"","");
    Carne carne = new Carne(0,0,0,0,"","");
    Condimento condimento = new Condimento(0,0,0,0,"","");
    Gaseosa gaseosa = new Gaseosa(0,0,0,0,"","");
    HarinayDerivado harina = new HarinayDerivado(0,0,0,0,"","");
    Lacteo lacteo = new Lacteo(0,0,0,0,"","");
    Legumbre legumbre = new Legumbre(0,0,0,0,"","");
    DefaultTableModel model;
    
    
    
    public GestionInventario() {
        initComponents();
        model = (DefaultTableModel)tabla.getModel();
        vaciarFilas(model, tabla);
        aceite.llenarTablaAceite(aXML.listaAceites(),tabla,aXML);   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        btnReabastecer = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        panelRound1 = new Modelo.PanelRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(920, 529));

        jPanel1.setBackground(new java.awt.Color(247, 115, 33));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Inventario");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btnReabastecer.setBackground(new java.awt.Color(253, 173, 59));
        btnReabastecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReabastecerMousePressed(evt);
            }
        });
        btnReabastecer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_shopping_cart_white_24dp.png"))); // NOI18N
        jLabel25.setText("Reabastecer");
        btnReabastecer.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, -1));

        jPanel1.add(btnReabastecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 80));

        btnAgregar.setBackground(new java.awt.Color(253, 173, 59));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarMousePressed(evt);
            }
        });
        btnAgregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_add_circle_white_24dp.png"))); // NOI18N
        jLabel26.setText("Agregar ingrediente");
        btnAgregar.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 40));

        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 260, 80));

        btnEliminar.setBackground(new java.awt.Color(253, 173, 59));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarMousePressed(evt);
            }
        });
        btnEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_delete_white_24dp.png"))); // NOI18N
        jLabel23.setText("Eliminar ingrediente");
        btnEliminar.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 80));

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aceite", "Carne", "Condimento", "Gaseosa", "Harina y derivado", "Lacteo", "Legumbre" }));
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Tipo de producto:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("*Seleccione un producto");

        panelRound1.setBackground(new java.awt.Color(245, 194, 19));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Tipo", "Unidad", "Cantidad", "Fecha"
            }
        ));
        tabla.setGridColor(new java.awt.Color(153, 153, 153));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        panelRound1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReabastecerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReabastecerMousePressed
     setColor(btnReabastecer);
     resetColor(btnAgregar);
     resetColor(btnEliminar);
     
     if (tabla.getSelectedRow() == -1){  
            JOptionPane.showMessageDialog(null, "Seleccione un elemento de la tabla");
        }
       else{
           if(!tabla.getValueAt(tabla.getSelectedRow(),0).toString().equalsIgnoreCase("")){
             reabastecer mP = new reabastecer(tabla.getValueAt(tabla.getSelectedRow(),0).toString(),tabla.getValueAt(tabla.getSelectedRow(),1).toString(),tabla.getValueAt(tabla.getSelectedRow(),2).toString());
             mP.setSize(920,529);
             mP.setLocation(0,0);
     
             this.removeAll();
             this.add(mP,BorderLayout.CENTER);
             this.revalidate();
             this.repaint();
           }
           else{
             JOptionPane.showMessageDialog(null, "No seleccione casillas vacias.");  
           }
        }
     
    }//GEN-LAST:event_btnReabastecerMousePressed

    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed
     setColor(btnAgregar);
     resetColor(btnReabastecer);
     resetColor(btnEliminar);
     
     AgregarIngrediente mP = new AgregarIngrediente();
     mP.setSize(920,529);
     mP.setLocation(0,0);
     
     this.removeAll();
     this.add(mP,BorderLayout.CENTER);
     this.revalidate();
     this.repaint(); 
    }//GEN-LAST:event_btnAgregarMousePressed

    private void btnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMousePressed
     setColor(btnEliminar);
     resetColor(btnReabastecer);
     resetColor(btnAgregar);
     
      if (tabla.getSelectedRow() == -1){    //Guarda los ingredientes en el xml y llena la tabla de ingredientes ingresados
            JOptionPane.showMessageDialog(null, "Seleccione un ingrediente de la tabla");
        } 
        else {
          if(!tabla.getValueAt(tabla.getSelectedRow(),0).toString().equalsIgnoreCase("")){
            switch(comboTipo.getSelectedItem().toString()){
                case "Aceite":
                if(verificarEliminar(tabla.getValueAt(tabla.getSelectedRow(),0).toString()) == 0){   
                  if(aXML.verificarAceite(tabla.getValueAt(tabla.getSelectedRow(),0).toString())){
                    aXML.eliminarAceite(tabla.getValueAt(tabla.getSelectedRow(),0).toString());
                    eliminarFila(tabla);
                    mostrarMensajeEliminado();
                  }
                  else{
                    mostrarMensajeNoEncontrado();
                  }
                }
                break;
                case"Carne":
                if(verificarEliminar(tabla.getValueAt(tabla.getSelectedRow(),0).toString()) == 0){   
                  if(cXML.verificarCarne(tabla.getValueAt(tabla.getSelectedRow(),0).toString())){
                    cXML.eliminarCarne(tabla.getValueAt(tabla.getSelectedRow(),0).toString());
                    eliminarFila(tabla);
                    mostrarMensajeEliminado();
                  }
                  else{
                    mostrarMensajeNoEncontrado();
                  }
                }
                break;
                case"Condimento":
                if(verificarEliminar(tabla.getValueAt(tabla.getSelectedRow(),0).toString()) == 0){   
                  if(coXML.verificarCondimento(tabla.getValueAt(tabla.getSelectedRow(),0).toString())){
                    coXML.eliminarCondimento(tabla.getValueAt(tabla.getSelectedRow(),0).toString());
                    eliminarFila(tabla);
                    mostrarMensajeEliminado();
                  }
                  else{
                    mostrarMensajeNoEncontrado();
                  }
                }
                break;
                case"Gaseosa":
                if(verificarEliminar(tabla.getValueAt(tabla.getSelectedRow(),0).toString()) == 0){   
                  if(gXML.verificarGaseosa(tabla.getValueAt(tabla.getSelectedRow(),0).toString())){
                    gXML.eliminarGaseosa(tabla.getValueAt(tabla.getSelectedRow(),0).toString());
                    eliminarFila(tabla);
                    mostrarMensajeEliminado();
                  }
                  else{
                    mostrarMensajeNoEncontrado();
                  }
                }
                break;
                case"Harina y derivado":
                if(verificarEliminar(tabla.getValueAt(tabla.getSelectedRow(),0).toString()) == 0){   
                  if(hXML.verificarHarina(tabla.getValueAt(tabla.getSelectedRow(),0).toString())){
                    hXML.eliminarHarina(tabla.getValueAt(tabla.getSelectedRow(),0).toString());
                    eliminarFila(tabla);
                    mostrarMensajeEliminado();
                  }
                  else{
                    mostrarMensajeNoEncontrado();
                  }
                }
                break;
                case"Lacteo":
                if(verificarEliminar(tabla.getValueAt(tabla.getSelectedRow(),0).toString()) == 0){   
                  if(lcXML.verificarLacteo(tabla.getValueAt(tabla.getSelectedRow(),0).toString())){
                    lcXML.eliminarLacteo(tabla.getValueAt(tabla.getSelectedRow(),0).toString());
                    eliminarFila(tabla);
                    mostrarMensajeEliminado();
                  }
                  else{
                    mostrarMensajeNoEncontrado();
                  }
                }  
                break;
                case"Legumbre":
                if(verificarEliminar(tabla.getValueAt(tabla.getSelectedRow(),0).toString()) == 0){   
                  if(leXML.verificarLegumbre(tabla.getValueAt(tabla.getSelectedRow(),0).toString())){
                    leXML.eliminarLegumbre(tabla.getValueAt(tabla.getSelectedRow(),0).toString());
                    eliminarFila(tabla);
                    mostrarMensajeEliminado();
                  }
                  else{
                    mostrarMensajeNoEncontrado();
                  }
                }
                break;
            }
         }
        }
     
    }//GEN-LAST:event_btnEliminarMousePressed

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        switch(comboTipo.getSelectedItem().toString()){
            case "Aceite":
            vaciarFilas(model,tabla);
            aceite.llenarTablaAceite(aXML.listaAceites(),tabla,aXML);
            break;
            case"Carne":
            vaciarFilas(model,tabla);
            carne.llenarTablaCarne(cXML.listaCarne(),tabla,cXML);
            break;
            case"Condimento":
            vaciarFilas(model,tabla);
            condimento.llenarTablaCondimento(coXML.listaCondimento(),tabla,coXML);
            break;
            case"Gaseosa":
            vaciarFilas(model,tabla);
            gaseosa.llenarTablaGaseosa(gXML.listaGaseosa(),tabla,gXML);
            break;
            case"Harina y derivado":
            vaciarFilas(model,tabla);
            harina.llenarTablaHarina( hXML.listaHarina(),tabla,hXML) ;
            break;
            case"Lacteo":
            vaciarFilas(model,tabla);
            lacteo.llenarTablaLacteo(lcXML.listaLacteos(),tabla,lcXML);
            break;
            case"Legumbre":
            vaciarFilas(model,tabla);
            legumbre.llenarTablaLegumbre(leXML.listaLegumbre(),tabla,leXML);
            break;
        }
    }//GEN-LAST:event_comboTipoActionPerformed

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed

    }//GEN-LAST:event_tablaMousePressed

void vaciarFilas(DefaultTableModel model,JTable tabla){
        model.getDataVector().removeAllElements();
        tabla.updateUI();
    }

    void eliminarFila(JTable tablaM){
        if (!(tablaM.getSelectedRow() == -1)){
            model.removeRow(tablaM.getSelectedRow());
        }
    }

    void mostrarMensajeNoEncontrado(){
        JOptionPane.showMessageDialog(null, "El producto no se encuentra registrado");
    }
    
    void mostrarMensajeEliminado(){
        JOptionPane.showMessageDialog(null, "El producto se elimino con exito");
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btnReabastecer;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private Modelo.PanelRound panelRound1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

 void setColor(JPanel jp){//funcion para cambiar el color del panel
        jp.setBackground(new Color(253,183,122));
    }
   
    void resetColor(JPanel jp){//funcion para restablecer el color del panel
        
        jp.setBackground(new Color(253,173,59));
    }
    
    int verificarEliminar(String nombre){
         int confirmacion = JOptionPane.showOptionDialog(
                        null,"Desea eliminar el producto "+nombre+"?", "Eliminar",
                        JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
        return confirmacion;
    }

}

