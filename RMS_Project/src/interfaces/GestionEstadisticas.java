/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author gadv1
 */
public class GestionEstadisticas extends javax.swing.JPanel {

   
    public GestionEstadisticas() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        btnFacturar = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        btnGananciasPerdidas = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        btnMasVendido = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 88, 109));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Estadisticas");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        btnFacturar.setBackground(new java.awt.Color(243, 127, 135));
        btnFacturar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFacturarMousePressed(evt);
            }
        });
        btnFacturar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-pay-39.png"))); // NOI18N
        jLabel25.setText(" Facturacion");
        btnFacturar.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 230, -1));

        jPanel2.add(btnFacturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 80));

        btnGananciasPerdidas.setBackground(new java.awt.Color(243, 127, 135));
        btnGananciasPerdidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGananciasPerdidasMousePressed(evt);
            }
        });
        btnGananciasPerdidas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-analytics-39.png"))); // NOI18N
        jLabel26.setText("Ganancias y perdidas");
        btnGananciasPerdidas.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 40));

        jPanel2.add(btnGananciasPerdidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 260, 80));

        btnMasVendido.setBackground(new java.awt.Color(243, 127, 135));
        btnMasVendido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMasVendidoMousePressed(evt);
            }
        });
        btnMasVendido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-thumbs-up-down-39.png"))); // NOI18N
        jLabel23.setText("Producto mas vendido");
        btnMasVendido.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel2.add(btnMasVendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 80));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estadísticas.final.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel24)
                .addGap(0, 64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFacturarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturarMousePressed
        setColor(btnFacturar);
        resetColor(btnGananciasPerdidas);
        resetColor(btnMasVendido);
        
        FacturarPedido mP = new FacturarPedido();
        mP.setSize(920,529);
        mP.setLocation(0,0);

        this.removeAll();
        this.add(mP,BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
        

    }//GEN-LAST:event_btnFacturarMousePressed

    private void btnGananciasPerdidasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGananciasPerdidasMousePressed
        setColor(btnGananciasPerdidas);
        resetColor(btnFacturar);
        resetColor(btnMasVendido);

        EstadisticasGP mP = new EstadisticasGP();
        mP.setSize(920,529);
        mP.setLocation(0,0);

        this.removeAll();
        this.add(mP,BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnGananciasPerdidasMousePressed

    private void btnMasVendidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasVendidoMousePressed
        setColor(btnMasVendido);
        resetColor(btnFacturar);
        resetColor(btnGananciasPerdidas);

        ProductosMasyMenosVendidos mP = new ProductosMasyMenosVendidos();
        mP.setSize(920,529);
        mP.setLocation(0,0);

        this.removeAll();
        this.add(mP,BorderLayout.CENTER);
        this.revalidate();
        this.repaint();

    }//GEN-LAST:event_btnMasVendidoMousePressed

    void setColor(JPanel jp){//funcion para cambiar el color del panel
        jp.setBackground(new Color(255,152,158));
    }
   
    void resetColor(JPanel jp){//funcion para restablecer el color del panel
        
        jp.setBackground(new Color(243,127,135));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnFacturar;
    private javax.swing.JPanel btnGananciasPerdidas;
    private javax.swing.JPanel btnMasVendido;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
