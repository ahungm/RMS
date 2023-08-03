/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import Modelo.Platillo;
import static interfaces.Menu.pXML;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gadv1
 */
public class ProductosMasyMenosVendidos extends javax.swing.JPanel {

    int mayor,menor;
    String nombreMayor,nombreMenor;
    

    
    public ProductosMasyMenosVendidos() {
        initComponents();
        llenarLabel(pXML.listaPlatillo());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        labelMayor = new javax.swing.JLabel();
        labelMayor2 = new javax.swing.JLabel();
        labelMenor = new javax.swing.JLabel();
        labelMenor2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(247, 79, 104));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Producto mas y menos vendido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel18)
                .addContainerGap(324, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap())
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-return-24.png"))); // NOI18N
        jButton1.setText(" Regresar");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setText("Producto mas vendido:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setText("Producto menos vendido:");

        labelMayor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelMayor.setText("null");

        labelMayor2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelMayor2.setText("null");

        labelMenor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelMenor.setText("null");

        labelMenor2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelMenor2.setText("null");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelMayor2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelMenor2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMayor)
                .addGap(18, 18, 18)
                .addComponent(labelMayor2)
                .addGap(51, 51, 51)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(labelMenor)
                .addGap(18, 18, 18)
                .addComponent(labelMenor2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelMayor;
    private javax.swing.JLabel labelMayor2;
    private javax.swing.JLabel labelMenor;
    private javax.swing.JLabel labelMenor2;
    // End of variables declaration//GEN-END:variables

   void llenarLabel(LinkedList<Platillo> listaPlatillo){
        Object[] row;
        if(!listaPlatillo.isEmpty()){
             mayor = listaPlatillo.get(0).getVecesSolicitado();
             menor = listaPlatillo.get(0).getVecesSolicitado();
            for(int i = 0; i < listaPlatillo.size() ; i++){
                if(mayor <= listaPlatillo.get(i).getVecesSolicitado()){
                   mayor = listaPlatillo.get(i).getVecesSolicitado();
                   labelMayor.setText(listaPlatillo.get(i).getNombre());
                   labelMayor2.setText("Veces solicitado: "+listaPlatillo.get(i).getVecesSolicitado());
                }
                if(menor >= listaPlatillo.get(i).getVecesSolicitado()){
                    menor = listaPlatillo.get(i).getVecesSolicitado();
                    labelMenor.setText(listaPlatillo.get(i).getNombre());
                    labelMenor2.setText("Veces solicitado: "+listaPlatillo.get(i).getVecesSolicitado());
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay platillos ingresados.");  
        }
    
   }
    
    
}
