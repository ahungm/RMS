/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;


import Modelo.*;
import static interfaces.Menu.*;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gadv1
 */
public class GenerarPedido extends javax.swing.JPanel {

    DefaultTableModel model;
    DefaultTableModel model2;
    
    public GenerarPedido() {
        initComponents();
        model = (DefaultTableModel)tabla.getModel();
        model2 = (DefaultTableModel)tabla2.getModel();
        mostrarMeserosDisponibles();
        mostrarPlatillos("Platillo principal");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btnGenerarPedido = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        comboNum = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        panelRound3 = new Modelo.PanelRound();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        panelRound4 = new Modelo.PanelRound();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        comboTipo = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        panelRound5 = new Modelo.PanelRound();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        panelRound6 = new Modelo.PanelRound();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(174, 53, 117));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Generar pedido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel18.setText("Seleccione un mesero disponible:");

        btnGenerarPedido.setText("Generar pedido");
        btnGenerarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPedidoActionPerformed(evt);
            }
        });

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-return-24.png"))); // NOI18N
        btnRegresar.setText(" Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        comboNum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        comboNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNumActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel20.setText("Seleccione una mesa:");

        panelRound3.setBackground(new java.awt.Color(214, 28, 78));
        panelRound3.setRoundBottomLeft(30);
        panelRound3.setRoundBottomRight(30);
        panelRound3.setRoundTopLeft(30);
        panelRound3.setRoundTopRight(30);
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mesero", "Codigo de trabajo"
            }
        ));
        jScrollPane5.setViewportView(tabla);

        panelRound3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 170));

        panelRound4.setBackground(new java.awt.Color(214, 28, 78));
        panelRound4.setRoundBottomLeft(30);
        panelRound4.setRoundBottomRight(30);
        panelRound4.setRoundTopLeft(30);
        panelRound4.setRoundTopRight(30);
        panelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Platillo", "Precio"
            }
        ));
        jScrollPane4.setViewportView(tabla2);

        panelRound4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 170));

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Platillo principal", "Bebida", "Postres" }));
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel17.setText("Selecciona un platillo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(164, 164, 164)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(75, 75, 75)
                            .addComponent(btnGenerarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(comboNum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel18)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(comboNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(174, 53, 117));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Generar pedido");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel19.setText("Seleccione un mesero disponible:");

        jButton3.setText("Generar pedido");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-return-24.png"))); // NOI18N
        jButton4.setText(" Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel21.setText("Seleccione una mesa:");

        panelRound5.setBackground(new java.awt.Color(214, 28, 78));
        panelRound5.setRoundBottomLeft(30);
        panelRound5.setRoundBottomRight(30);
        panelRound5.setRoundTopLeft(30);
        panelRound5.setRoundTopRight(30);
        panelRound5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mesero"
            }
        ));
        jScrollPane6.setViewportView(jTable5);

        panelRound5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 170));

        panelRound6.setBackground(new java.awt.Color(214, 28, 78));
        panelRound6.setRoundBottomLeft(30);
        panelRound6.setRoundBottomRight(30);
        panelRound6.setRoundTopLeft(30);
        panelRound6.setRoundTopRight(30);
        panelRound6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Platillo", "Precio"
            }
        ));
        jScrollPane7.setViewportView(jTable6);

        panelRound6.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 170));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plato principal", "Bebida", "Postres" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel24.setText("Selecciona un platillo");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(141, 141, 141)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(135, 135, 135)
                            .addComponent(jButton3))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel19)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        jScrollPane2.setViewportView(jPanel5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPedidoActionPerformed
        if (tabla.getSelectedRow() == -1 || tabla2.getSelectedRow() == -1){ 
            JOptionPane.showMessageDialog(null, "No puede dejar casillas sin seleccionar.");
        } 
        else{
           if(!mXML.verificarNumeroMesa(comboNum.getSelectedItem().toString())){
               Mesero m = mXML.obtenerMesero(tabla.getValueAt(tabla.getSelectedRow(),1).toString());
               m.setNumMesa(Integer.parseInt(comboNum.getSelectedItem().toString()));
               if(verificarIngredientes(imXML.listaIngredientesMenu(tabla2.getValueAt(tabla2.getSelectedRow(),0).toString()))){
                 mXML.actualizarMesero(m);
                 Pedidos p = new Pedidos(Double.parseDouble(tabla2.getValueAt(tabla2.getSelectedRow(), 1).toString()),Integer.parseInt(comboNum.getSelectedItem().toString()),tabla2.getValueAt(tabla2.getSelectedRow(),0).toString(),tabla.getValueAt(tabla.getSelectedRow(), 0).toString(),Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(),1).toString())) ;                       
                 peXML.agregarPedido(p);
                 Platillo pl = pXML.obtenerPlatillo(tabla2.getValueAt(tabla2.getSelectedRow(),0).toString());
                 int vc = pl.getVecesSolicitado() + 1;
                 pl.setVecesSolicitado(vc);
                 pXML.actualizarPlatillo(pl);
                 JOptionPane.showMessageDialog(null, "Pedido realizado.");  
                 regresar();
               }
           }else{
              JOptionPane.showMessageDialog(null, "Un mesero ya se encuentra atendiendo a esa mesa"); 
           }
       }

    }//GEN-LAST:event_btnGenerarPedidoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        GestionMenu m = new GestionMenu();
        m.setSize(920,528);
        m.setLocation(0,0);

        this.removeAll();
        this.add(m,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void comboNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboNumActionPerformed

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
         switch(comboTipo.getSelectedItem().toString()){
            case "Bebida":
            vaciarFilas(model2,tabla2);
            mostrarPlatillos("Bebida");
            break;
            case"Platillo principal":
            vaciarFilas(model2,tabla2);
            mostrarPlatillos("Platillo principal") ;
            break;
            case"Postre":
            vaciarFilas(model2,tabla2);
            mostrarPlatillos("Postre");
            break;
        }
    }//GEN-LAST:event_comboTipoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    boolean verificarIngredientes(LinkedList<IngredientesMenu> listaMenu){
        for(int i = 0 ; i<listaMenu.size();i++){
          switch(listaMenu.get(i).getTipo()){
           case "Aceite":
             if(aXML.verificarAceite(listaMenu.get(i).getNombre())){
               Aceites a = aXML.obtenerAceite(listaMenu.get(i).getNombre());
               if(a.getCantidad() >= listaMenu.get(i).getCantidad()){
                   double cantidad = a.getCantidad() - listaMenu.get(i).getCantidad();
                   a.setCantidad((int) cantidad);
                   aXML.actualizarAceite(a); 
               }
               else{
                  ingredienteInsuficiente(listaMenu.get(i).getNombre());
                  return false;
               } 
               
            }
            else{
                ingredienteNoRegistrado(listaMenu.get(i).getNombre());
                return false;
            }
           break;
            case"Carne":
            if(cXML.verificarCarne(listaMenu.get(i).getNombre())){
               Carne c = cXML.obtenerCarne(listaMenu.get(i).getNombre());
               if(c.getCantidad() >= listaMenu.get(i).getCantidad()){
                   double cantidad = c.getCantidad() - listaMenu.get(i).getCantidad();
                   c.setCantidad((int) cantidad);
                   cXML.actualizarCarne(c);
               }
               else{
                  ingredienteInsuficiente(listaMenu.get(i).getNombre());
                  return false;
               } 
               
            }
            else{
                ingredienteNoRegistrado(listaMenu.get(i).getNombre());
                return false;
            }        
            break;
            case"Condimento":
             if(coXML.verificarCondimento(listaMenu.get(i).getNombre())){
               Condimento co = coXML.obtenerCondimento(listaMenu.get(i).getNombre());
               if(co.getCantidad() >= listaMenu.get(i).getCantidad()){
                   double cantidad = co.getCantidad() - listaMenu.get(i).getCantidad();
                   co.setCantidad((int) cantidad);
                   coXML.actualizarCondimento(co);
               }
               else{
                  ingredienteInsuficiente(listaMenu.get(i).getNombre());
                  return false;
               } 
               
            }
            else{
                ingredienteNoRegistrado(listaMenu.get(i).getNombre());
                return false;
            }
            break;
            case"Gaseosa":
            if(gXML.verificarGaseosa(listaMenu.get(i).getNombre())){
               Gaseosa g = gXML.obtenerGaseosa(listaMenu.get(i).getNombre());
               if(g.getCantidad() >= listaMenu.get(i).getCantidad()){
                   double cantidad = g.getCantidad() - listaMenu.get(i).getCantidad();
                   g.setCantidad((int) cantidad);
                   gXML.actualizarGaseosa(g);
                }
                else{
                  ingredienteInsuficiente(listaMenu.get(i).getNombre());
                  return false;
                }                
            }
            else{
                ingredienteNoRegistrado(listaMenu.get(i).getNombre());
                return false;
            }
            break;
            case"Harina y derivado":
            if(hXML.verificarHarina(listaMenu.get(i).getNombre())){
               HarinayDerivado h = hXML.obtenerHarina(listaMenu.get(i).getNombre());
               if(h.getCantidad() >= listaMenu.get(i).getCantidad()){
                   double cantidad = h.getCantidad() - listaMenu.get(i).getCantidad();
                   h.setCantidad((int) cantidad);
                   hXML.actualizarHarina(h);
                }
                else{
                  ingredienteInsuficiente(listaMenu.get(i).getNombre());
                  return false;
                }                
            }
            else{
                ingredienteNoRegistrado(listaMenu.get(i).getNombre());
                return false;
            }
           
            break;
            case"Lacteo":
             if(lcXML.verificarLacteo(listaMenu.get(i).getNombre())){
               Lacteo lc = lcXML.obtenerLacteo(listaMenu.get(i).getNombre());
               if(lc.getCantidad() >= listaMenu.get(i).getCantidad()){
                   double cantidad = lc.getCantidad() - listaMenu.get(i).getCantidad();
                   lc.setCantidad((int) cantidad);
                   lcXML.actualizarLacteo(lc);
                }
                else{
                  ingredienteInsuficiente(listaMenu.get(i).getNombre());
                  return false;
                }                
            }
            else{
                ingredienteNoRegistrado(listaMenu.get(i).getNombre());
                return false;
            }
           
            break;
            case"Legumbre":
             if(leXML.verificarLegumbre(listaMenu.get(i).getNombre())){
               Legumbre le = leXML.obtenerLegumbre(listaMenu.get(i).getNombre());
               if(le.getCantidad() >= listaMenu.get(i).getCantidad()){
                   double cantidad = le.getCantidad() - listaMenu.get(i).getCantidad();
                   le.setCantidad((int) cantidad);
                   leXML.actualizarLegumbre(le);
                }
                else{
                  ingredienteInsuficiente(listaMenu.get(i).getNombre());
                  return false;
                }                
            }
            else{
                ingredienteNoRegistrado(listaMenu.get(i).getNombre());
                return false;
            } 
            break;
          }
        }
    return true;
    }
    
    void regresar(){
        GestionMenu m = new GestionMenu();
        m.setSize(920,528);
        m.setLocation(0,0);

        this.removeAll();
        this.add(m,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        this.revalidate();
        this.repaint();
    }
    
    void mostrarMeserosDisponibles(){
        Object[] row;
        if(!mXML.listaMesero().isEmpty()){
            for(int i = 0; i < mXML.listaMesero().size() ; i++){
                if(mXML.listaMesero().get(i).getNumMesa() == 0){
                   row = new Object[2];
                   row[0] = mXML.listaMesero().get(i).getNombre()+" "+mXML.listaMesero().get(i).getApellido(); 
                   row[1] = mXML.listaMesero().get(i).getCodigo(); 
                   model.addRow(row); 
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay Meseros disponibles.");  
        }
    }
    
    void mostrarPlatillos(String tipoPlatillo){
        int p = 0;
        Object[] row;
        if(!pXML.listaPlatillo().isEmpty()){
            for(int i = 0; i < pXML.listaPlatillo().size() ; i++){
                if(pXML.listaPlatillo().get(i).getTipoPlatillo().equalsIgnoreCase(tipoPlatillo)){
                   row = new Object[2];
                   row[0] = pXML.listaPlatillo().get(i).getNombre(); 
                   row[1] = pXML.listaPlatillo().get(i).getPrecio();
                   model2.addRow(row); 
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
     
     void ingredienteNoRegistrado(String nombre){
        JOptionPane.showMessageDialog(null, "El ingrediente "+nombre+" no se encuentra registrado.");  
    }
     
     void ingredienteInsuficiente(String nombre){
        JOptionPane.showMessageDialog(null, "No se tiene la cantidad suficiente de "+nombre+" para preparar el platillo.");  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarPedido;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboNum;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private Modelo.PanelRound panelRound3;
    private Modelo.PanelRound panelRound4;
    private Modelo.PanelRound panelRound5;
    private Modelo.PanelRound panelRound6;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
}
