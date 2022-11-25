/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main extends javax.swing.JFrame {

//   private JPanel jPanel;
   private JPanel jpHoaDon;
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        jpHoaDon = new JPBanHang();
       
        container.removeAll();
        container.add(jpHoaDon);
        container.validate();
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        container.setLayout(new java.awt.BorderLayout());
        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 875, 625));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    // End of variables declaration//GEN-END:variables
}
