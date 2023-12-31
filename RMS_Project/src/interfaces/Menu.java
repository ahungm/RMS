/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;


import java.awt.BorderLayout;
import java.awt.Color;
import static javafx.scene.paint.Color.color;
import javax.swing.JPanel;
import java.util.Calendar;
import java.util.GregorianCalendar;
import Modelo.*;

/**
 *
 * @author gadv1
 */
public class Menu extends javax.swing.JFrame {
    
    static AceiteXML aXML = new AceiteXML();
    static CarneXML cXML = new CarneXML();
    static CondimentoXML coXML = new CondimentoXML();
    static GaseosaXML gXML = new GaseosaXML();
    static HarinayDerivadosXML hXML = new HarinayDerivadosXML();
    static LacteoXML lcXML = new LacteoXML();
    static LegumbreXML leXML = new LegumbreXML();
    static PoDXML podXML = new PoDXML();
    static PlatillosXML pXML = new PlatillosXML();
    static IngredientesMenuXML imXML = new IngredientesMenuXML();
    static MeseroXML mXML = new MeseroXML();
    static PedidosXML peXML = new PedidosXML();
    static GananciasPerdidasXML gpXML = new GananciasPerdidasXML();

    

    Calendar fecha = new GregorianCalendar();
    String anio = Integer.toString(fecha.get(Calendar.YEAR));
    String dia = Integer.toString(fecha.get(Calendar.DATE));
    int mes = fecha.get(Calendar.MONTH)+1;
    String nombreG = "";
    
    public Menu(String gerente) {
        initComponents();
        nombreG = gerente;
        labelFecha.setText("Hoy es "+ dia + " de "+mesLetra(mes)+" de "+anio);
        labelGerente.setText("Bienvenido: "+gerente);
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
        jPanel2 = new javax.swing.JPanel();
        labelGerente = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnPersonal = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnInv = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        btnPerfil = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnEstadisticas = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(250, 194, 19));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelGerente.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        labelGerente.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(labelGerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 450, 40));

        labelFecha.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 620, 50));

        jPanel5.setBackground(new java.awt.Color(214, 28, 78));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPersonal.setBackground(new java.awt.Color(239, 28, 78));
        btnPersonal.setPreferredSize(new java.awt.Dimension(0, 80));
        btnPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPersonalMousePressed(evt);
            }
        });
        btnPersonal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Personal");
        btnPersonal.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/account-group.png"))); // NOI18N
        btnPersonal.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel5.add(btnPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 280, 70));

        btnInv.setBackground(new java.awt.Color(239, 28, 78));
        btnInv.setPreferredSize(new java.awt.Dimension(0, 80));
        btnInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInvMousePressed(evt);
            }
        });
        btnInv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Inventario");
        btnInv.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/package-variant-closed (1).png"))); // NOI18N
        btnInv.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel5.add(btnInv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 280, 70));

        btnMenu.setBackground(new java.awt.Color(239, 28, 78));
        btnMenu.setPreferredSize(new java.awt.Dimension(0, 80));
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMenuMousePressed(evt);
            }
        });
        btnMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-dinner-42.png"))); // NOI18N
        btnMenu.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Menu");
        btnMenu.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jPanel5.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 280, 70));

        btnSalir.setBackground(new java.awt.Color(239, 28, 78));
        btnSalir.setPreferredSize(new java.awt.Dimension(0, 80));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalirMousePressed(evt);
            }
        });
        btnSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit-to-app.png"))); // NOI18N
        btnSalir.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Salir");
        btnSalir.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jPanel5.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 280, 70));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("RMS");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 120, 50));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 225, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comidas-mundo1.1.jpg"))); // NOI18N
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 280, 60));

        btnPerfil.setBackground(new java.awt.Color(239, 28, 78));
        btnPerfil.setPreferredSize(new java.awt.Dimension(0, 80));
        btnPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPerfilMousePressed(evt);
            }
        });
        btnPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/account-circle.png"))); // NOI18N
        btnPerfil.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Perfil");
        btnPerfil.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jPanel5.add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 280, 70));

        btnEstadisticas.setBackground(new java.awt.Color(239, 28, 78));
        btnEstadisticas.setPreferredSize(new java.awt.Dimension(0, 80));
        btnEstadisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEstadisticasMousePressed(evt);
            }
        });
        btnEstadisticas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-statistics-42.png"))); // NOI18N
        btnEstadisticas.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Estadisticas");
        btnEstadisticas.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jPanel5.add(btnEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 280, 70));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(920, 529));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pantallaMenu.jpeg"))); // NOI18N

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentLayout.createSequentialGroup()
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInvMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvMousePressed
     setColor(btnInv);
     resetColor(btnMenu);
     resetColor(btnSalir);
     resetColor(btnPersonal);
     resetColor(btnEstadisticas);
        
        GestionInventario m = new GestionInventario();
        m.setSize(920,529);
        m.setLocation(0,0);
        
        content.removeAll();
        content.add(m,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnInvMousePressed

    private void btnPersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPersonalMousePressed
     setColor(btnPersonal);
     resetColor(btnMenu);
     resetColor(btnSalir);
     resetColor(btnInv);
     resetColor(btnEstadisticas);
     
        GestionPersonal m = new GestionPersonal();
        m.setSize(920,529);
        m.setLocation(0,0);
        
        content.removeAll();
        content.add(m,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
     
    }//GEN-LAST:event_btnPersonalMousePressed

    private void btnMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMousePressed
     setColor(btnMenu);
     resetColor(btnPersonal);
     resetColor(btnSalir);
     resetColor(btnInv);
     resetColor(btnEstadisticas);
     
        GestionMenu m = new GestionMenu();
        m.setSize(920,529);
        m.setLocation(0,0);
        
        content.removeAll();
        content.add(m,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
     
     
    }//GEN-LAST:event_btnMenuMousePressed

    private void btnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMousePressed
     setColor(btnSalir);
     resetColor(btnPersonal);
     resetColor(btnMenu);
     resetColor(btnInv);
     resetColor(btnEstadisticas);
     
     this.dispose();
    }//GEN-LAST:event_btnSalirMousePressed

    private void btnPerfilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMousePressed
     setColor(btnPerfil);
     resetColor(btnPersonal);
     resetColor(btnSalir);
     resetColor(btnInv);
     resetColor(btnMenu);
     resetColor(btnEstadisticas);
     
        ModificarPerfil m = new ModificarPerfil(nombreG);
        m.setSize(920,529);
        m.setLocation(0,0);
        
        content.removeAll();
        content.add(m,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();  
    }//GEN-LAST:event_btnPerfilMousePressed

    private void btnEstadisticasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadisticasMousePressed
     setColor(btnEstadisticas);
     resetColor(btnPersonal);
     resetColor(btnSalir);
     resetColor(btnInv);
     resetColor(btnMenu);
     resetColor(btnPerfil);
     
        GestionEstadisticas m = new GestionEstadisticas();
        m.setSize(920,529);
        m.setLocation(0,0);
        
        content.removeAll();
        content.add(m,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();  
    }//GEN-LAST:event_btnEstadisticasMousePressed


    void setColor(JPanel jp){
        jp.setBackground(new Color(255,115,103));
    }
   
    void resetColor(JPanel jp){
        jp.setBackground(new Color(239,28,78));
    }
    
    String mesLetra(int mes){
        String m = "";
        switch (mes){
            case 1:
             m = "Enero";   
            break;
            case 2:
             m = "Febrero";   
            break;
            case 3:
             m = "Marzo";   
            break;
            case 4:
             m = "Abril";   
            break;
            case 5:
             m = "Mayo";   
            break;
            case 6:
             m = "Junio";   
            break;
            case 7:
             m = "Julio";   
            break;
            case 8:
             m = "Agosto";   
            break;
            case 9:
             m = "Septiembre";   
            break;
            case 10:
             m = "Octubre";   
            break;
            case 11:
             m = "Noviembre";   
            break;
            case 12:
             m = "Diciembre";   
            break;
        }
        return m;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnEstadisticas;
    private javax.swing.JPanel btnInv;
    private javax.swing.JPanel btnMenu;
    private javax.swing.JPanel btnPerfil;
    private javax.swing.JPanel btnPersonal;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelGerente;
    // End of variables declaration//GEN-END:variables
}
