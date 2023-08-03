
package interfaces;



import Modelo.*;
import static interfaces.Menu.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FacturarPedido extends javax.swing.JPanel {

    DefaultTableModel model;
    
    Calendar fecha = new GregorianCalendar();
    int anio = fecha.get(Calendar.YEAR);
    int dia = fecha.get(Calendar.DATE);
    int mes = fecha.get(Calendar.MONTH)+1;
    
    
    public FacturarPedido() {
        initComponents();
        model = (DefaultTableModel)tabla.getModel();
        llenarTablaPedidos(peXML.listaPedidos());
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        panelRound1 = new Modelo.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        btnFacturar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(174, 53, 117));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Facturar pedido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

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
                "Numero de mesa", "Nombre del platillo", "Monto total"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 823, 230));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-return-24.png"))); // NOI18N
        btnRegresar.setText(" Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnFacturar.setText("Facturar");
        btnFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturarActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("*Seleccione un pedido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(btnFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(146, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
       
        GestionEstadisticas m = new GestionEstadisticas();
        m.setSize(920,528);
        m.setLocation(0,0);

        this.removeAll();
        this.add(m,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        this.revalidate();
        this.repaint();
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturarActionPerformed
        if (tabla.getSelectedRow() == -1){    //Guarda los ingredientes en el xml y llena la tabla de ingredientes ingresados
            JOptionPane.showMessageDialog(null, "Seleccione un elemento de la tabla");
        }
        else {
            Pedidos pe = peXML.obtenerPedido(tabla.getValueAt(tabla.getSelectedRow(),1).toString());
            Mesero m = mXML.obtenerMesero(String.valueOf(pe.getCodigoMesero()));
            GananciasPerdidas gp = new GananciasPerdidas(Double.parseDouble(tabla.getValueAt(tabla.getSelectedRow(),2).toString()),"Facturacion(Ganancia)",dia+"/"+mes+"/"+anio,pe.getNombrePlatillo());
            gpXML.agregarGananciaPerdida(gp);
            m.setNumMesa(0);
            mXML.actualizarMesero(m);
            peXML.eliminarPedido(pe.getNombrePlatillo());
            eliminarFila();
            JOptionPane.showMessageDialog(null, "Facturacion realizada con exito.");       
        }
        
        
    }//GEN-LAST:event_btnFacturarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFacturar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Modelo.PanelRound panelRound1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

 void llenarTablaPedidos(LinkedList<Pedidos> listaPedidos){
       if(!listaPedidos.isEmpty()){
       DefaultTableModel model = (DefaultTableModel)tabla.getModel();
       Object[] row;
        for(int i = 0; i < listaPedidos.size() ; i++){
                    row = new Object[3];
                    row[0] =  listaPedidos.get(i).getMesa();
                    row[1] =  listaPedidos.get(i).getNombrePlatillo();
                    row[2] =  listaPedidos.get(i).getPrecio();
                    model.addRow(row);
            } 
       }
       else{
           JOptionPane.showMessageDialog(null, "No se ha realizado ningun pedido.");
       }
    }
 
    void eliminarFila(){
        if (!(tabla.getSelectedRow() == -1)){
            model.removeRow(tabla.getSelectedRow());
        }
    }

}
