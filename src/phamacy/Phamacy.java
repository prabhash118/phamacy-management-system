/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phamacy;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prabhash
 */
public class Phamacy extends javax.swing.JFrame {

    /**
     * Creates new form Pharmacy
     */
    public Phamacy() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextPossibleSideEffect = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextFutherInformation = new javax.swing.JTextField();
        jTextStorageAdvices = new javax.swing.JTextField();
        jTextAdministration = new javax.swing.JTextField();
        jTextDrivingandUsingMachines = new javax.swing.JTextField();
        jTextHowtouseMedication = new javax.swing.JTextField();
        jTextPatientID = new javax.swing.JTextField();
        jTextDoctorsNHSNo = new javax.swing.JTextField();
        jTextDos = new javax.swing.JTextField();
        jTextNumberofTablets = new javax.swing.JTextField();
        jTextLOT = new javax.swing.JTextField();
        jTextIssuredDAte = new javax.swing.JTextField();
        jTextExpDate = new javax.swing.JTextField();
        jTextDailyDose = new javax.swing.JTextField();
        jTextRef = new javax.swing.JTextField();
        JcmbNameofTables = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Daily Dose:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jTextPossibleSideEffect.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextPossibleSideEffect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPossibleSideEffectActionPerformed(evt);
            }
        });
        getContentPane().add(jTextPossibleSideEffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 190, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Futher Information:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Dose(mg):");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Number of Tablets:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("LOT:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Issured date:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Exp Date:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Possible Side Effect:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Storage Advices:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Administration:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Driving and Using Machines:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("How to use Medication:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Patient ID:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Doctors NHS No:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Refference No:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Name of Tables:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jTextFutherInformation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFutherInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFutherInformationActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFutherInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, 190, -1));

        jTextStorageAdvices.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextStorageAdvices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextStorageAdvicesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextStorageAdvices, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, 190, -1));

        jTextAdministration.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextAdministration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAdministrationActionPerformed(evt);
            }
        });
        getContentPane().add(jTextAdministration, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, 190, -1));

        jTextDrivingandUsingMachines.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextDrivingandUsingMachines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDrivingandUsingMachinesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextDrivingandUsingMachines, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, 190, -1));

        jTextHowtouseMedication.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextHowtouseMedication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHowtouseMedicationActionPerformed(evt);
            }
        });
        getContentPane().add(jTextHowtouseMedication, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, 190, -1));

        jTextPatientID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPatientIDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, 190, -1));

        jTextDoctorsNHSNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextDoctorsNHSNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDoctorsNHSNoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextDoctorsNHSNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 350, 190, -1));

        jTextDos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 190, -1));

        jTextNumberofTablets.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextNumberofTablets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNumberofTabletsActionPerformed(evt);
            }
        });
        getContentPane().add(jTextNumberofTablets, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 190, -1));

        jTextLOT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextLOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextLOTActionPerformed(evt);
            }
        });
        getContentPane().add(jTextLOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 190, -1));

        jTextIssuredDAte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextIssuredDAte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIssuredDAteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextIssuredDAte, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 190, -1));

        jTextExpDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextExpDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextExpDateActionPerformed(evt);
            }
        });
        getContentPane().add(jTextExpDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 190, -1));

        jTextDailyDose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextDailyDose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDailyDoseActionPerformed(evt);
            }
        });
        getContentPane().add(jTextDailyDose, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 190, -1));

        jTextRef.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRefActionPerformed(evt);
            }
        });
        getContentPane().add(jTextRef, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 190, -1));

        JcmbNameofTables.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JcmbNameofTables.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Make a selection", "Ibuprofen", "Co-codamol", "Paracitomol", "Amaiodpine", "penadol", " " }));
        JcmbNameofTables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcmbNameofTablesActionPerformed(evt);
            }
        });
        getContentPane().add(JcmbNameofTables, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 190, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name of tablet", "Refferance no", "Dose(mg)", "Number of Tablets", "LOT", "Issred date", "Exp date", "Daily dose ", "Possible side effect", "Futher Information", "Storage Advice", "Administration", "Dirving and using machines", "Hoe to use medication", "Patient id", "Doctors NHS No"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 1020, 290));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 51), 3, true));

        jButton1.setText("Patient");

        jButton2.setText("GP Appoinment");

        jButton3.setText("Doctor");

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Pharmacy Office");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Payment");

        jButton8.setBackground(new java.awt.Color(255, 153, 0));
        jButton8.setText("Exit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 153, 0));
        jButton9.setText("Login");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 1020, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPossibleSideEffectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPossibleSideEffectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPossibleSideEffectActionPerformed

    private void jTextFutherInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFutherInformationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFutherInformationActionPerformed

    private void jTextStorageAdvicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextStorageAdvicesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextStorageAdvicesActionPerformed

    private void jTextAdministrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAdministrationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAdministrationActionPerformed

    private void jTextDrivingandUsingMachinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDrivingandUsingMachinesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDrivingandUsingMachinesActionPerformed

    private void jTextHowtouseMedicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHowtouseMedicationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHowtouseMedicationActionPerformed

    private void jTextPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPatientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPatientIDActionPerformed

    private void jTextDoctorsNHSNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDoctorsNHSNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDoctorsNHSNoActionPerformed

    private void jTextDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDosActionPerformed

    private void jTextNumberofTabletsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNumberofTabletsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNumberofTabletsActionPerformed

    private void jTextLOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextLOTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextLOTActionPerformed

    private void jTextIssuredDAteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIssuredDAteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIssuredDAteActionPerformed

    private void jTextExpDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextExpDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextExpDateActionPerformed

    private void jTextDailyDoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDailyDoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDailyDoseActionPerformed

    private void jTextRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRefActionPerformed

    private void JcmbNameofTablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcmbNameofTablesActionPerformed
       if(JcmbNameofTables.getSelectedItem().equals("Ibuprofen"))
       {
        jTextRef.setText("Ibu005875");
        jTextDos.setText("2");
        jTextNumberofTablets.setText("32");
        jTextLOT.setText("42411221");
        jTextIssuredDAte.setText("02/02/2019");
        jTextExpDate.setText("02/02/2020");
        jTextDailyDose.setText("4");
        
        jTextPossibleSideEffect.setText("Bleeding");
        jTextFutherInformation.setText("Place Dispensary");
        jTextStorageAdvices.setText("Less than 20%");
        jTextAdministration.setText("Yes actioned");
        jTextDrivingandUsingMachines.setText("No");
        jTextHowtouseMedication.setText("Use Water,No Alcohol");
        jTextPatientID.setText("P123343");
        jTextDoctorsNHSNo.setText("222222");
                                        
                                        
       }
    }//GEN-LAST:event_JcmbNameofTablesActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed
private JFrame frame;
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        frame=new JFrame ("Exit");
    if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Pharmacy Management System",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
    System.exit(0);
    }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       
      
        model.addRow(new Object[]{JcmbNameofTables.getSelectedItem(),toString(),
        jTextNumberofTablets.getText(),jTextRef.getText(),jTextLOT.getText(),
        jTextIssuredDAte.getText(),jTextExpDate.getText(), jTextDailyDose.getText(),
        jTextPossibleSideEffect.getText(),jTextFutherInformation.getText(),jTextStorageAdvices.getText(),
        jTextAdministration.getText(),jTextDrivingandUsingMachines.getText(),
        jTextHowtouseMedication.getText(),
        jTextPatientID.getText(),jTextDoctorsNHSNo.getText(),});
        
         
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow()==-1){
            if(jTable1.getRowCount()==0){
            
            JOptionPane.showMessageDialog(null,"No data to delete","Phamacy MAnagemant System",JOptionPane.OK_OPTION);
            
            }
            else{
                JOptionPane.showMessageDialog(null,"Selecty row to delete","Phamacy Management System",JOptionPane.OK_OPTION);
                
            }
        }       else{
        
                    model.removeRow(jTable1.getSelectedRow());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Phamacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Phamacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Phamacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Phamacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Phamacy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JcmbNameofTables;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextAdministration;
    private javax.swing.JTextField jTextDailyDose;
    private javax.swing.JTextField jTextDoctorsNHSNo;
    private javax.swing.JTextField jTextDos;
    private javax.swing.JTextField jTextDrivingandUsingMachines;
    private javax.swing.JTextField jTextExpDate;
    private javax.swing.JTextField jTextFutherInformation;
    private javax.swing.JTextField jTextHowtouseMedication;
    private javax.swing.JTextField jTextIssuredDAte;
    private javax.swing.JTextField jTextLOT;
    private javax.swing.JTextField jTextNumberofTablets;
    private javax.swing.JTextField jTextPatientID;
    private javax.swing.JTextField jTextPossibleSideEffect;
    private javax.swing.JTextField jTextRef;
    private javax.swing.JTextField jTextStorageAdvices;
    // End of variables declaration//GEN-END:variables
}
