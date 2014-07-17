package dalcontanctslist;

import javax.swing.JOptionPane;
import javax.swing.JTable;

public class MainTable extends javax.swing.JFrame {

    DalContanctsList dal = new DalContanctsList();

    public MainTable() {
        initComponents();
        dal.Connect();
        Showing();

    }

    public Integer Row() {
        int x = jTable1.getSelectedRow();
        return x;
    }

    public void Showing() {
        String sql = "select * from phonecontacts";
        String[][] data = dal.Select(sql);
        jTable1 = new JTable(data, dal.hdr);
        jScrollPane1.setViewportView(jTable1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnadd = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        tfsearch = new javax.swing.JTextField();
        btnexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contacts List");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnadd.setText("Add new contact");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btndel.setText("Delete");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        tfsearch.setForeground(new java.awt.Color(153, 153, 153));
        tfsearch.setText("Search any of details in the table below to find the contact you're searching for");
        tfsearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tfsearchCaretUpdate(evt);
            }
        });
        tfsearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfsearchFocusGained(evt);
            }
        });

        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(tfsearch)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnexit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btndel)
                    .addComponent(btnedit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfsearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tfsearchCaretUpdate
        String sql = "select * from phonecontacts where Name like '%%%s%%'or"
                + " Last_Name like '%%%s%%'"
                + "or Home_Number like '%%%s%%'"
                + "or Mobile_Number like '%%%s%%'or"
                + " Email like '%%%s%%'"
                + "or Address like '%%%s%%'";
        sql = String.format(sql, tfsearch.getText(), tfsearch.getText(),
                tfsearch.getText(), tfsearch.getText(),
                tfsearch.getText(), tfsearch.getText());
        String[][] data = dal.Select(sql);
        jTable1 = new JTable(data, dal.hdr);
        jScrollPane1.setViewportView(jTable1);

    }//GEN-LAST:event_tfsearchCaretUpdate

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        dal.Disconnect();
        System.exit(1);
    }//GEN-LAST:event_btnexitActionPerformed

    private void tfsearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfsearchFocusGained
        tfsearch.setText("");
    }//GEN-LAST:event_tfsearchFocusGained

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        Add a = new Add(this, true);
        a.setVisible(true);
        a.setAlwaysOnTop(true);
        Showing();
    }//GEN-LAST:event_btnaddActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        int x = jTable1.getSelectedRow();
        if (x == -1) {
            JOptionPane.showMessageDialog(null, "Choose a row first!!!");
            return;
        }
        int res = JOptionPane.showConfirmDialog(this, "Are you sure?", "Delete",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (res == JOptionPane.NO_OPTION) {
            return;
        }
        int y = 0;
        String a = jTable1.getValueAt(x, y).toString();
        String sql = "delete from phonecontacts where Line=" + a + " ";
        dal.Execute(sql);
        Showing();


    }//GEN-LAST:event_btndelActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
//        Row();
        int x = jTable1.getSelectedRow();
        if (x == -1) {
            JOptionPane.showMessageDialog(null, "Choose a row first!!!");
            return;
        }
        Edit e = new Edit(this, true);
        e.setVisible(true);
        e.setAlwaysOnTop(true);
        Showing();
    }//GEN-LAST:event_btneditActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Mac".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnexit;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField tfsearch;
    // End of variables declaration//GEN-END:variables
}
