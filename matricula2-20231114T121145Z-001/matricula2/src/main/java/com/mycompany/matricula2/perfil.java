/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.matricula2;

/**
 *
 * @author yefer
 */
public class perfil extends javax.swing.JFrame {

    /**
     * Creates new form perfil
     */
    public perfil() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setText("PERFIL");
        jPanel3.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 111, -1));

        jToggleButton2.setText("SEGUIMIENTO");
        jToggleButton2.setToolTipText("");
        jPanel3.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 111, -1));

        jToggleButton3.setText("TRAMITES");
        jPanel3.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 111, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 560));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel5.setText("Perfil del Estudiante");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion de Estudiante"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("N° DNI:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel7.setText("Apellidos:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel8.setText("Nombres:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jLabel9.setText("Direccion:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        txtdni.setText("75265472");
        jPanel4.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 130, -1));

        txtapellido.setText("Ramon Medina");
        jPanel4.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 130, -1));

        txtnombre.setText("Yeferson Denys");
        jPanel4.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 120, -1));

        txtdireccion.setText("jr veliz 192");
        jPanel4.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 120, -1));

        jLabel10.setText("Fecha de nacimiento:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel4.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 100, -1));

        jLabel11.setText("Codigo:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel4.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 110, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 590, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
