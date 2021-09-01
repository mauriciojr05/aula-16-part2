/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import java.io.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author mauricio.junior1
 */
public class IHM extends javax.swing.JFrame implements Function{
    ArrayList<D1> da;
    /**
     * Creates new form IHM
     */
    public IHM() {
        initComponents();
        da = new ArrayList<D1>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Select = new javax.swing.JTextField();
        A1 = new javax.swing.JTextField();
        A2 = new javax.swing.JTextField();
        A3 = new javax.swing.JTextField();
        Salvar = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();
        Ler = new javax.swing.JButton();
        Magic = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        Ler.setText("Ler");
        Ler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LerActionPerformed(evt);
            }
        });

        Magic.setText("Magic");
        Magic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MagicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Select)
                    .addComponent(A1)
                    .addComponent(A2)
                    .addComponent(A3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(Salvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Magic)
                .addGap(4, 4, 4)
                .addComponent(Ler)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Limpar)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salvar)
                    .addComponent(Limpar)
                    .addComponent(Ler)
                    .addComponent(Magic))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A2ActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        if (A1.getText().isEmpty() || A2.getText().isEmpty() || A3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete info...");
        } else {
            String a1 = A1.getText().trim();
            String a2 = A2.getText().trim();
            String a3 = A3.getText().trim();

            D1 I1 = new D1(a1, a2, a3);

            da.add(I1);
            cadDados();
        }
    }//GEN-LAST:event_SalvarActionPerformed

    private void LerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LerActionPerformed
        A1.setText("");
        A2.setText("");
        A3.setText("");
        if(Select.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Acesso negado, Complete as informacoes, por favor ");
        }else{
            lerDados();
            int a = Integer.parseInt(Select.getText());
            A1.setText(da.get(a) .getA1());
            A2.setText(da.get(a) .getA2());
            A3.setText(da.get(a) .getA3());
        }
    }//GEN-LAST:event_LerActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        A1.setText("");
        A2.setText("");
        A3.setText("");
            JOptionPane.showMessageDialog(null, " Limpando os Campos de Texto ");
    }//GEN-LAST:event_LimparActionPerformed

    private void MagicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MagicActionPerformed

        da.clear();
        cadDados();
        JOptionPane.showMessageDialog(null, " Limpando os Dados Salvos ");
        A1.setText("");
        A2.setText("");
        A3.setText("");

    }//GEN-LAST:event_MagicActionPerformed

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
            java.util.logging.Logger.getLogger(IHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IHM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A1;
    private javax.swing.JTextField A2;
    private javax.swing.JTextField A3;
    private javax.swing.JButton Ler;
    private javax.swing.JButton Limpar;
    private javax.swing.JButton Magic;
    private javax.swing.JButton Salvar;
    private javax.swing.JTextField Select;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cadDados() {
        try {
            FileOutputStream file = new FileOutputStream("infor.dat");
            ObjectOutputStream Of = new ObjectOutputStream(file);
            for (int i = 0; i < da.size(); i++) {
                Of.writeObject(da.get(i));
            }
            
            Of.close();
        } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, " Dados Salvos com Sucesso");
        }
    }

    @Override
    public void lerDados() {
        try {
            FileInputStream file = new FileInputStream("infor.dat");
            ObjectInputStream Inf = new ObjectInputStream(file);
            boolean endOfFile = false;
            while (!endOfFile) {
                try {
                    da.add((D1) Inf.readObject());
                } catch (EOFException f) {
                    endOfFile = true;
                } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, " Carregando os dados ");
                }

            }
        }catch(IOException e ){
            
        }
        }
    }
