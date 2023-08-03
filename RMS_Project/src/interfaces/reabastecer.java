/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import Modelo.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static interfaces.Menu.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JTable;

public class reabastecer extends javax.swing.JPanel {

    Random r = new Random();
    
    Calendar fecha = new GregorianCalendar();
    int anio = fecha.get(Calendar.YEAR);
    int dia = fecha.get(Calendar.DATE);
    int mes = fecha.get(Calendar.MONTH)+1;
    
    String productoTipo;
    String nombreTipo;
    String unidadP;
    
    DefaultTableModel model ;
    
    ProveedorDistribuidor pod = new ProveedorDistribuidor();
    PoDXML pXML = new PoDXML();
    
   
    public reabastecer(String s,String p,String unidad) {
        initComponents();
        productoTipo = p;
        nombreTipo = s;
        model = (DefaultTableModel)tabla.getModel();
        labelText.setText("Producto: "+nombreTipo);
        llenarTablaPoD(pXML.todosLosProveedores());
        unidadP = unidad;
    }

    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        labeltxt = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        comboCantidad = new javax.swing.JComboBox<>();
        labelText = new javax.swing.JLabel();
        panelRound1 = new Modelo.PanelRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(247, 126, 33));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Reabastecer ingredientes");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel17)
                .addContainerGap(432, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 150, 50));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-return-24.png"))); // NOI18N
        btnRegresar.setText(" Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 150, 50));

        labeltxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labeltxt.setForeground(new java.awt.Color(153, 153, 153));
        labeltxt.setText("*Seleccione un proveedor o distribuidor");
        add(labeltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Cantidad a solicitar:");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 27));

        comboCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "20", "30", "40", "50" }));
        comboCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCantidadActionPerformed(evt);
            }
        });
        add(comboCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 70, 27));

        labelText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelText.setText("NULL");
        add(labelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 315, 27));

        panelRound1.setBackground(new java.awt.Color(252, 79, 79));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Producto de venta", "Tipo de vendedor"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        panelRound1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 712, 220));

        add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 730, 240));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
         volverMenuGestion();     
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed

        ProveedorDistribuidor d = new ProveedorDistribuidor();
        if(!(tabla.getSelectedRow() == -1)){
            double cantidad = 0 ; 
            switch (productoTipo){
              case "Aceite":
                if(tabla.getValueAt(tabla.getSelectedRow(),1).toString().equalsIgnoreCase(productoTipo)){
                   cantidad = pod.generarPrecio(productoTipo, unidadP, Integer.parseInt(comboCantidad.getSelectedItem().toString()));
                   if(solicitarCompra(cantidad) == 0){
                      Aceites a = aXML.obtenerAceite(nombreTipo);
                      a.setDia(dia);
                      a.setMes(mes);
                      a.setAnio(anio + 3);
                      a.setCantidad(Integer.parseInt(comboCantidad.getSelectedItem().toString()));
                      aXML.actualizarAceite(a);
                      compraFinalizada(nombreTipo);
                      GananciasPerdidas gp = new GananciasPerdidas(cantidad,"Reabastecimiento",dia+"/"+mes+"/"+anio,a.getNombre());
                      gpXML.agregarGananciaPerdida(gp);
                      volverMenuGestion();
                   }
                }
                else{
                    verificarPoD();
                }
              break;
              case"Carne":
                 if(tabla.getValueAt(tabla.getSelectedRow(),1).toString().equalsIgnoreCase(productoTipo)){
                   cantidad = pod.generarPrecio(productoTipo, unidadP, Integer.parseInt(comboCantidad.getSelectedItem().toString()));
                   if(solicitarCompra(cantidad) == 0){
                      Carne c = cXML.obtenerCarne(nombreTipo);
                      c.setDia(dia + r.nextInt(4)+1);
                      c.setMes(mes + r.nextInt(2)+1);
                      c.setAnio(anio);
                      c.setCantidad(Integer.parseInt(comboCantidad.getSelectedItem().toString()));
                      cXML.actualizarCarne(c);
                      compraFinalizada(nombreTipo);
                      GananciasPerdidas gp = new GananciasPerdidas(cantidad,"Reabastecimiento",dia+"/"+mes+"/"+anio,c.getNombre());
                      gpXML.agregarGananciaPerdida(gp);
                      volverMenuGestion();                   
                   }
                 }
                 else{
                    verificarPoD();  
                 }
              break;
              case"Condimento":
                 if(tabla.getValueAt(tabla.getSelectedRow(),1).toString().equalsIgnoreCase(productoTipo)){
                   cantidad = pod.generarPrecio(productoTipo, unidadP, Integer.parseInt(comboCantidad.getSelectedItem().toString()));
                   if(solicitarCompra(cantidad) == 0){
                      Condimento co = coXML.obtenerCondimento(nombreTipo);
                      co.setDia(dia + r.nextInt(4)+1);
                      co.setMes(mes + r.nextInt(2)+1);
                      co.setAnio(anio);
                      co.setCantidad(Integer.parseInt(comboCantidad.getSelectedItem().toString()));
                      coXML.actualizarCondimento(co);
                      compraFinalizada(nombreTipo);
                      GananciasPerdidas gp = new GananciasPerdidas(cantidad,"Reabastecimiento(Perdida)",dia+"/"+mes+"/"+anio,co.getNombre());
                      gpXML.agregarGananciaPerdida(gp);
                      volverMenuGestion();                 
                   }
                 }
                 else{
                    verificarPoD(); 
                 }
              break;
              case"Gaseosa":
                 if(tabla.getValueAt(tabla.getSelectedRow(),1).toString().equalsIgnoreCase(productoTipo)){
                   cantidad = pod.generarPrecio(productoTipo, unidadP, Integer.parseInt(comboCantidad.getSelectedItem().toString()));
                   if(solicitarCompra(cantidad) == 0){
                      Gaseosa g = gXML.obtenerGaseosa(nombreTipo);
                      g.setDia(dia);
                      g.setMes(mes + r.nextInt(4)+1);
                      g.setAnio(anio);
                      g.setCantidad(Integer.parseInt(comboCantidad.getSelectedItem().toString()));
                      gXML.actualizarGaseosa(g);
                      compraFinalizada(nombreTipo);
                      GananciasPerdidas gp = new GananciasPerdidas(cantidad,"Reabastecimiento(Perdida)",dia+"/"+mes+"/"+anio,g.getNombre());
                      gpXML.agregarGananciaPerdida(gp);
                      volverMenuGestion();                  
                   }
                 }
                 else{
                    verificarPoD(); 
                 }
              break;
              case"Harina y derivado":
                 if(tabla.getValueAt(tabla.getSelectedRow(),1).toString().equalsIgnoreCase(productoTipo)){
                   cantidad = pod.generarPrecio(productoTipo, unidadP, Integer.parseInt(comboCantidad.getSelectedItem().toString()));
                   if(solicitarCompra(cantidad) == 0){
                      HarinayDerivado h = hXML.obtenerHarina(nombreTipo);
                      h.setDia(dia);
                      h.setMes(mes + r.nextInt(1)+1);
                      h.setAnio(anio);
                      h.setCantidad(Integer.parseInt(comboCantidad.getSelectedItem().toString()));
                      hXML.actualizarHarina(h);
                      compraFinalizada(nombreTipo);
                      GananciasPerdidas gp = new GananciasPerdidas(cantidad,"Reabastecimiento(Perdida)",dia+"/"+mes+"/"+anio,h.getNombre());
                      gpXML.agregarGananciaPerdida(gp);
                      volverMenuGestion();                    
                   }
                 }
                 else{
                    verificarPoD(); 
                 }
              break;
              case"Lacteo":
                  if(tabla.getValueAt(tabla.getSelectedRow(),1).toString().equalsIgnoreCase(productoTipo)){
                   cantidad = pod.generarPrecio(productoTipo, unidadP, Integer.parseInt(comboCantidad.getSelectedItem().toString()));
                   if(solicitarCompra(cantidad) == 0){
                      Lacteo lc = lcXML.obtenerLacteo(nombreTipo);
                      lc.setDia(dia+ r.nextInt(2)+1);
                      lc.setMes(mes + r.nextInt(1)+1);
                      lc.setAnio(anio);
                      lc.setCantidad(Integer.parseInt(comboCantidad.getSelectedItem().toString()));
                      lcXML.actualizarLacteo(lc);
                      compraFinalizada(nombreTipo);
                      GananciasPerdidas gp = new GananciasPerdidas(cantidad,"Reabastecimiento(Perdida)",dia+"/"+mes+"/"+anio,lc.getNombre());
                      gpXML.agregarGananciaPerdida(gp);
                      volverMenuGestion();                  
                   }
                 }
                 else{
                    verificarPoD();  
                 }
              break;
              case"Legumbre":
                if(tabla.getValueAt(tabla.getSelectedRow(),1).toString().equalsIgnoreCase(productoTipo)){
                   cantidad = pod.generarPrecio(productoTipo, unidadP, Integer.parseInt(comboCantidad.getSelectedItem().toString()));
                   if(solicitarCompra(cantidad) == 0){
                      Legumbre le = leXML.obtenerLegumbre(nombreTipo);
                      le.setDia(dia+ r.nextInt(2)+1);
                      le.setMes(mes + r.nextInt(1)+1);
                      le.setAnio(anio);
                      le.setCantidad(Integer.parseInt(comboCantidad.getSelectedItem().toString()));
                      leXML.actualizarLegumbre(le);
                      compraFinalizada(nombreTipo);
                      GananciasPerdidas gp = new GananciasPerdidas(cantidad,"Reabastecimiento(Perdida)",dia+"/"+mes+"/"+anio,le.getNombre());
                      gpXML.agregarGananciaPerdida(gp);
                      volverMenuGestion();                  
                   }
                 }
                else{
                  verificarPoD();
                }
              break;
           } 
        }else{
            JOptionPane.showMessageDialog(null, "Por favor seleccione un vendedor");
        }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void comboCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCantidadActionPerformed

    int solicitarCompra(double precio){
         int confirmacion = JOptionPane.showOptionDialog(
                        null,"Desea realizar la compra por un total de: "+precio+"Bs.", "::::...Pago...:::",
                        JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
        return confirmacion;
    }
    
    void compraFinalizada(String producto){
        JOptionPane.showMessageDialog(null, "La compra del ingrediente "+producto+" se realizo con exito.");
    }
    
    void verificarPoD(){
        JOptionPane.showMessageDialog(null, "El tipo de producto que solicitas no es igual al tipo de producto que vende el proveedor o distribuidor.");
    }
    
    void volverMenuGestion(){
        GestionInventario m = new GestionInventario();
        m.setSize(920,529);
        m.setLocation(0,0);
        
        this.removeAll();
        this.add(m,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        this.revalidate();
        this.repaint();  
    }
    
     public void llenarTablaPoD(LinkedList<ProveedorDistribuidor> lPoD){
      DefaultTableModel model = (DefaultTableModel)tabla.getModel();
       Object[] row;
        for(int i = 0; i < lPoD.size() ; i++){
                    row = new Object[3];
                    row[0] =  lPoD.get(i).getNombre();
                    row[1] =  lPoD.get(i).getTipoVendedor();
                    row[2] =  lPoD.get(i).getTipoProductoVenta();
                    model.addRow(row);
            } 
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboCantidad;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelText;
    private javax.swing.JLabel labeltxt;
    private Modelo.PanelRound panelRound1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
