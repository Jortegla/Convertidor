
package com.vistas;

import com.convertidor.Convertidor;
import java.awt.Color;
import java.awt.Image;
import java.awt.List;
import java.io.Console;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class ConvertidorMonedas extends javax.swing.JFrame {

    int xMouse, yMouse;
    Double moneda;
    
    public ConvertidorMonedas() {
        initComponents();
        this.setLocationRelativeTo(this);
        SetImageLabel(fondoConvMon, "src/img/mapa.png");
        SetDate();
    }
    
    private void SetImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }
    
    private void SetDate(){
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        dataTxt.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE  dd 'de' MMMM 'de' YYYY", spanishLocale)));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        tituloConvMon = new javax.swing.JLabel();
        nav = new javax.swing.JPanel();
        dataTxt = new javax.swing.JLabel();
        btnExit = new javax.swing.JPanel();
        txtExit = new javax.swing.JLabel();
        separadorTitulo = new javax.swing.JSeparator();
        panelCambio = new javax.swing.JPanel();
        txtIngresarMonto1 = new javax.swing.JLabel();
        listaMonedaInicial = new javax.swing.JComboBox<>();
        montoConvertir = new javax.swing.JTextField();
        txtIngresarMonto = new javax.swing.JLabel();
        listaMonedaFinal = new javax.swing.JComboBox<>();
        btnCambio = new javax.swing.JButton();
        valor = new java.awt.Label();
        monedaResul = new java.awt.Label();
        volverMenu = new javax.swing.JLabel();
        fondoConvMon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(460, 570));
        setResizable(false);

        fondo.setBackground(new java.awt.Color(0, 0, 0));
        fondo.setForeground(new java.awt.Color(0, 0, 0));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloConvMon.setBackground(new java.awt.Color(255, 255, 255));
        tituloConvMon.setFont(new java.awt.Font("Roboto Black", 3, 24)); // NOI18N
        tituloConvMon.setForeground(new java.awt.Color(255, 102, 0));
        tituloConvMon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloConvMon.setText("CONVERTIDOR DE MONEDAS");
        tituloConvMon.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tituloConvMon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fondo.add(tituloConvMon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 430, 60));

        nav.setBackground(new java.awt.Color(0, 0, 0));
        nav.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nav.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                navMouseDragged(evt);
            }
        });
        nav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                navMousePressed(evt);
            }
        });

        dataTxt.setBackground(new java.awt.Color(255, 255, 255));
        dataTxt.setForeground(new java.awt.Color(255, 255, 255));
        dataTxt.setText("Hoy es {dayName} {day} de {month} de {year}.");

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnExit.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        txtExit.setBackground(new java.awt.Color(0, 0, 0));
        txtExit.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        txtExit.setForeground(new java.awt.Color(255, 255, 255));
        txtExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtExit.setText("X");
        txtExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExitLayout.createSequentialGroup()
                .addComponent(txtExit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout navLayout = new javax.swing.GroupLayout(nav);
        nav.setLayout(navLayout);
        navLayout.setHorizontalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(dataTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        navLayout.setVerticalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addGroup(navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(navLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dataTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fondo.add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 40));

        separadorTitulo.setBackground(new java.awt.Color(255, 102, 0));
        separadorTitulo.setForeground(new java.awt.Color(255, 102, 0));
        fondo.add(separadorTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 400, 30));

        panelCambio.setBackground(new java.awt.Color(0, 0, 0));

        txtIngresarMonto1.setBackground(new java.awt.Color(0, 0, 255));
        txtIngresarMonto1.setForeground(new java.awt.Color(0, 0, 204));
        txtIngresarMonto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIngresarMonto1.setText("Seleccione la moneda y el monto a convertir");

        listaMonedaInicial.setBackground(new java.awt.Color(102, 102, 102));
        listaMonedaInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ARS", "USD", "EUR", "BS" }));
        listaMonedaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaMonedaInicialActionPerformed(evt);
            }
        });

        montoConvertir.setBackground(new java.awt.Color(204, 204, 204));
        montoConvertir.setForeground(new java.awt.Color(0, 0, 0));
        montoConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montoConvertirActionPerformed(evt);
            }
        });

        txtIngresarMonto.setBackground(new java.awt.Color(0, 0, 0));
        txtIngresarMonto.setForeground(new java.awt.Color(0, 0, 204));
        txtIngresarMonto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIngresarMonto.setText("Seleccione el tipo de cambio");

        listaMonedaFinal.setBackground(new java.awt.Color(102, 102, 102));
        listaMonedaFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ARS ", "USD", "EUR", "BS" }));
        listaMonedaFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaMonedaFinalActionPerformed(evt);
            }
        });

        btnCambio.setBackground(new java.awt.Color(204, 102, 0));
        btnCambio.setFont(new java.awt.Font("Roboto Black", 3, 14)); // NOI18N
        btnCambio.setForeground(new java.awt.Color(0, 0, 0));
        btnCambio.setText("CONVERTIR");
        btnCambio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioActionPerformed(evt);
            }
        });

        valor.setAlignment(java.awt.Label.RIGHT);
        valor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        valor.setFont(new java.awt.Font("Roboto Black", 3, 18)); // NOI18N
        valor.setForeground(new java.awt.Color(204, 102, 0));

        monedaResul.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        monedaResul.setFont(new java.awt.Font("Roboto Black", 3, 18)); // NOI18N
        monedaResul.setForeground(new java.awt.Color(204, 102, 0));

        javax.swing.GroupLayout panelCambioLayout = new javax.swing.GroupLayout(panelCambio);
        panelCambio.setLayout(panelCambioLayout);
        panelCambioLayout.setHorizontalGroup(
            panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCambioLayout.createSequentialGroup()
                .addGroup(panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCambioLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCambioLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCambioLayout.createSequentialGroup()
                                .addComponent(txtIngresarMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listaMonedaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCambioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCambioLayout.createSequentialGroup()
                        .addGroup(panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIngresarMonto1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCambioLayout.createSequentialGroup()
                                .addComponent(listaMonedaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(montoConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCambioLayout.createSequentialGroup()
                        .addComponent(monedaResul, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelCambioLayout.setVerticalGroup(
            panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCambioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtIngresarMonto1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(montoConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaMonedaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIngresarMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaMonedaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monedaResul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        fondo.add(panelCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 320, 280));

        volverMenu.setForeground(new java.awt.Color(0, 153, 255));
        volverMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volverMenu.setText("Volver a Menu");
        volverMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volverMenu.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/img/casa.png"))); // NOI18N
        volverMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMenuMouseClicked(evt);
            }
        });
        fondo.add(volverMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 90, -1));

        fondoConvMon.setBackground(new java.awt.Color(255, 255, 255));
        fondoConvMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mapa.png"))); // NOI18N
        fondo.add(fondoConvMon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 450, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtExitMouseClicked

    private void txtExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseEntered
        btnExit.setBackground(Color.red);
    }//GEN-LAST:event_txtExitMouseEntered

    private void txtExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseExited
        btnExit.setBackground(Color.black);
    }//GEN-LAST:event_txtExitMouseExited

    private void navMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_navMouseDragged

    private void navMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_navMousePressed

    private void montoConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoConvertirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montoConvertirActionPerformed

    private void listaMonedaFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaMonedaFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaMonedaFinalActionPerformed

    private void listaMonedaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaMonedaInicialActionPerformed
      
    }//GEN-LAST:event_listaMonedaInicialActionPerformed

    private void btnCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioActionPerformed
       /* String monedaI = listaMonedaInicial.getSelectedItem().toString();
        
        String monedaF = listaMonedaFinal.getSelectedItem().toString();*/
        
        double monto = Double.parseDouble(montoConvertir.getText());
        double moneda =1;
        double operacion;
        
        int i = listaMonedaInicial.getSelectedIndex();
        int y = listaMonedaFinal.getSelectedIndex();
       
        if(i == 0 && y == 1){
            moneda = 0.0044;
        }
        if(i == 0 && y == 2){
            moneda = 0.004;
        }
        if(i == 0 && y == 3){
            moneda = 0.11;
        }
        if(i == 1 && y == 0){
            moneda = 228.26;
        }
        if(i == 1 && y == 2){
            moneda = 0.91;
        }
        if(i == 1 && y == 3){
            moneda = 25.32;
        }
        if(i == 2 && y == 0){
            moneda = 249.66;
        }
        if(i == 2 && y == 1){
            moneda = 1.09;
        }
        if(i == 2 && y == 3){
            moneda = 27.69;
        }
        if(i == 3 && y == 0){
            moneda = 9.02;
        }
        if(i == 3 && y == 1){
            moneda = 0.039;
        }
        if(i == 3 && y == 2){
            moneda = 0.036;
        }
        
        operacion = monto * moneda;
        valor.setText(Double.toString(operacion));
        monedaResul.setText(listaMonedaFinal.getSelectedItem().toString());
    }//GEN-LAST:event_btnCambioActionPerformed

    private void volverMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMenuMouseClicked
        Convertidor ventana1 = new Convertidor();
        ventana1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverMenuMouseClicked
  
       
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConvertidorMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConvertidorMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConvertidorMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConvertidorMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConvertidorMonedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambio;
    private javax.swing.JPanel btnExit;
    private javax.swing.JLabel dataTxt;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel fondoConvMon;
    private javax.swing.JComboBox<String> listaMonedaFinal;
    private javax.swing.JComboBox<String> listaMonedaInicial;
    private java.awt.Label monedaResul;
    private javax.swing.JTextField montoConvertir;
    private javax.swing.JPanel nav;
    private javax.swing.JPanel panelCambio;
    private javax.swing.JSeparator separadorTitulo;
    private javax.swing.JLabel tituloConvMon;
    private javax.swing.JLabel txtExit;
    private javax.swing.JLabel txtIngresarMonto;
    private javax.swing.JLabel txtIngresarMonto1;
    private java.awt.Label valor;
    private javax.swing.JLabel volverMenu;
    // End of variables declaration//GEN-END:variables

   
}
