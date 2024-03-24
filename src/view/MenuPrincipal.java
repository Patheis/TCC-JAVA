/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import javax.swing.JOptionPane;

/**
 *
 * @author jao07
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    
    public MenuPrincipal() {
        initComponents();
    }
    
 
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Cad_Pacientes = new javax.swing.JMenuItem();
        Cad_Medicamentos = new javax.swing.JMenuItem();
        Cad_Doenca = new javax.swing.JMenuItem();
        Cad_Patologia = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        Cad_Medicar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Gera_Relat_Med = new javax.swing.JMenuItem();
        Gera_Relat_Paciente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de monitoramento de medicacao - V.01\n");
        setIconImages(null);
        setResizable(false);

        jMenu1.setText("Cadastro");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Cad_Pacientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Cad_Pacientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cad_Pacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pessoas.png"))); // NOI18N
        Cad_Pacientes.setText("Paciente");
        Cad_Pacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_PacientesActionPerformed(evt);
            }
        });
        jMenu1.add(Cad_Pacientes);

        Cad_Medicamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Cad_Medicamentos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cad_Medicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-comprimidos-16.png"))); // NOI18N
        Cad_Medicamentos.setText("Medicamentos");
        Cad_Medicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_MedicamentosActionPerformed(evt);
            }
        });
        jMenu1.add(Cad_Medicamentos);

        Cad_Doenca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cad_Doenca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-vírus-16.png"))); // NOI18N
        Cad_Doenca.setText("Doencas");
        Cad_Doenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_DoencaActionPerformed(evt);
            }
        });
        jMenu1.add(Cad_Doenca);

        Cad_Patologia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cad_Patologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-anatomy-16.png"))); // NOI18N
        Cad_Patologia.setText("Patologia");
        Cad_Patologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_PatologiaActionPerformed(evt);
            }
        });
        jMenu1.add(Cad_Patologia);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Registrar");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Cad_Medicar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cad_Medicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/medicar.png"))); // NOI18N
        Cad_Medicar.setText("Medicar");
        Cad_Medicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_MedicarActionPerformed(evt);
            }
        });
        jMenu4.add(Cad_Medicar);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Relatorio");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Gera_Relat_Med.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Gera_Relat_Med.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-comprimidos-16.png"))); // NOI18N
        Gera_Relat_Med.setText("Relatorio de medicamentos");
        Gera_Relat_Med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gera_Relat_MedActionPerformed(evt);
            }
        });
        jMenu3.add(Gera_Relat_Med);

        Gera_Relat_Paciente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Gera_Relat_Paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pessoa.png"))); // NOI18N
        Gera_Relat_Paciente.setText("Relatorio de pacientes");
        Gera_Relat_Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gera_Relat_PacienteActionPerformed(evt);
            }
        });
        jMenu3.add(Gera_Relat_Paciente);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Sair");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fechar.png"))); // NOI18N
        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Cad_MedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_MedicamentosActionPerformed
      dispose();
        Tela_CadMedicamento S = new Tela_CadMedicamento();
        S.setVisible(true);
    }//GEN-LAST:event_Cad_MedicamentosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         int resp = JOptionPane.showConfirmDialog(null, 
                "Deseja realmente sair ? ", "Aviso de saida...",
                           JOptionPane.YES_NO_CANCEL_OPTION);

	// 0=yes, 1=no, 2=cancel
	System.out.println(resp);
        
        if (resp==0)
            System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void Gera_Relat_MedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gera_Relat_MedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gera_Relat_MedActionPerformed

    private void Gera_Relat_PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gera_Relat_PacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gera_Relat_PacienteActionPerformed

    private void Cad_PacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_PacientesActionPerformed
        dispose();
        Tela_CadPaciente S = new Tela_CadPaciente();
        S.setVisible(true);
    }//GEN-LAST:event_Cad_PacientesActionPerformed

    private void Cad_MedicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_MedicarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cad_MedicarActionPerformed

    private void Cad_DoencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_DoencaActionPerformed
         dispose();
        Tela_CadDoenca Sz = new Tela_CadDoenca();
        Sz.setVisible(true);
    }//GEN-LAST:event_Cad_DoencaActionPerformed

    private void Cad_PatologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_PatologiaActionPerformed
        dispose();
        Tela_CadPatologia Sz = new Tela_CadPatologia();
        Sz.setVisible(true);
    }//GEN-LAST:event_Cad_PatologiaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cad_Doenca;
    private javax.swing.JMenuItem Cad_Medicamentos;
    private javax.swing.JMenuItem Cad_Medicar;
    private javax.swing.JMenuItem Cad_Pacientes;
    private javax.swing.JMenuItem Cad_Patologia;
    private javax.swing.JMenuItem Gera_Relat_Med;
    private javax.swing.JMenuItem Gera_Relat_Paciente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
