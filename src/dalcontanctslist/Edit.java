package dalcontanctslist;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import static javax.management.Query.or;
import javax.swing.JOptionPane;

public class Edit extends javax.swing.JDialog {

    DalContanctsList dal = new DalContanctsList();
    MainTable m = new MainTable();

    public Edit(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        dal.Connect();
//        int i = m.btnedit.x;
//        int i = Integer.parseInt(m.getString());
//        int i = m.Row();
        int i = m.jTable1.getSelectedRow() + 1;
        lline.setText(m.jTable1.getValueAt(i, 0).toString());
        tfname.setText(m.jTable1.getValueAt(i, 1).toString());
        tflname.setText(m.jTable1.getValueAt(i, 2).toString());
        tfhno.setText(m.jTable1.getValueAt(i, 3).toString());
        tfmno.setText(m.jTable1.getValueAt(i, 4).toString());
        tfemail.setText(m.jTable1.getValueAt(i, 5).toString());
        tfaddress.setText(m.jTable1.getValueAt(i, 6).toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfaddress = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tflname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfhno = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        tfemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfmno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lline = new javax.swing.JLabel();
        le = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit");

        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("**");

        jLabel1.setText("Name :");

        jLabel2.setText("Last Name :");

        tfaddress.setColumns(20);
        tfaddress.setRows(5);
        tfaddress.setText("     ");
        tfaddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfaddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfaddressFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(tfaddress);

        jLabel5.setText("Email :");

        jLabel3.setText("Home Number :");

        jLabel4.setText("Mobile Number :");

        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("**");

        tfhno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfhnoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfhnoFocusLost(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tfemail.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tfemailCaretUpdate(evt);
            }
        });
        tfemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfemailFocusLost(evt);
            }
        });

        jLabel6.setText("Address :");

        tfmno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfmnoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfmnoFocusLost(evt);
            }
        });

        jLabel9.setText("Line :");

        lline.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        le.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane1)
                            .addComponent(tfmno, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(tfhno)
                            .addComponent(tfemail)
                            .addComponent(tflname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(le, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lline, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9))
                    .addComponent(lline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tflname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfhno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfmno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(le, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfaddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfaddressFocusGained
        if (tfaddress.getText() == "     ") {
            tfaddress.setText("");
        }
    }//GEN-LAST:event_tfaddressFocusGained

    private void tfaddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfaddressFocusLost

    }//GEN-LAST:event_tfaddressFocusLost

    private void tfhnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfhnoFocusGained

    }//GEN-LAST:event_tfhnoFocusGained

    private void tfhnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfhnoFocusLost

    }//GEN-LAST:event_tfhnoFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dal.Disconnect();
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        if (tfname.getText() == null) {
//            JOptionPane.showMessageDialog(null, "Writing the name is necessary.");
//            return;
//        }
//        if (tflname.getText() == null) {
//            JOptionPane.showMessageDialog(null, "Writing the lastname is necessary.");
//            return;
//        }
//        try {
//            int c = Integer.parseInt(tfhno.getText());
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Home Number is just NUMBERS!!!!");
//            return;
//        }
//
//        try {
//            int c = Integer.parseInt(tfmno.getText());
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Mobile Number is just NUMBERS!!!!");
//            return;
//        }

        String sql = "update phonecontacts set Name='" + tfname.getText() + "',"
                + "Last_Name='" + tflname.getText() + "',Home_Number='" + tfhno.getText() + "',"
                + "Mobile_Number='" + tfmno.getText() + "' ,"
                + "Email='" + tfemail.getText() + "',Address='" + tfaddress.getText() + "'"
                + " where Line=" + lline.getText() + "";
//        sql = String.format(sql, tfname.getText(), tflname.getText(), tfhno.getText(), tfmno.getText(), tfemail.getText(), tfaddress.getText());
        dal.Execute(sql);
        dal.Disconnect();
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfemailFocusGained

    }//GEN-LAST:event_tfemailFocusGained

    private void tfemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfemailFocusLost

               try {
          int y = tfemail.getText().compareTo(""+'a'+"@s.s");
            if (y >= 0) {
                le.setForeground(Color.GREEN);
                le.setText("Correct type of Email");

            } else {
                le.setForeground(Color.red);
                le.setText("Incorrect type of Email");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tfemailFocusLost

    private void tfmnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfmnoFocusGained

    }//GEN-LAST:event_tfmnoFocusGained

    private void tfmnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfmnoFocusLost

    }//GEN-LAST:event_tfmnoFocusLost

    private void tfemailCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tfemailCaretUpdate

   
    }//GEN-LAST:event_tfemailCaretUpdate

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Mac".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Edit dialog = new Edit(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel le;
    private javax.swing.JLabel lline;
    private javax.swing.JTextArea tfaddress;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tfhno;
    private javax.swing.JTextField tflname;
    private javax.swing.JTextField tfmno;
    private javax.swing.JTextField tfname;
    // End of variables declaration//GEN-END:variables
}
