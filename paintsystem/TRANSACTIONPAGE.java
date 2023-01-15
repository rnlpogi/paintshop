/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintsystem;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ADMIN
 */
public class TRANSACTIONPAGE extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs;
    DefaultTableModel model;

    public TRANSACTIONPAGE() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventtable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txttotalcost = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        transactiontable = new javax.swing.JTable();
        txtcash = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtchange = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        brand = new javax.swing.JTextField();
        jButton33 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Price = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Category = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        Quantity = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        warn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-go-back-16.png"))); // NOI18N
        jButton1.setText("BACK");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 30));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setBorder(null);
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, -1, -1));

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, -1, -1));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("TRANSACTION");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 180, 40));

        inventtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Type", "Brand Name", "Product Name", "Price", "Stocks"
            }
        ));
        inventtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(inventtable);
        if (inventtable.getColumnModel().getColumnCount() > 0) {
            inventtable.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 510, 150));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cash:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, 30));
        jPanel3.add(txttotalcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 80, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Search:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        jPanel3.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 170, 30));

        transactiontable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Type", "Brand Name", "Product Name", "Price", "Quantity", "Total Cost"
            }
        ));
        transactiontable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transactiontableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transactiontableMouseEntered(evt);
            }
        });
        jScrollPane3.setViewportView(transactiontable);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 510, 120));

        txtcash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcashKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcashKeyTyped(evt);
            }
        });
        jPanel3.add(txtcash, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 80, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Change:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Total Cost:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, 30));
        jPanel3.add(txtchange, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 80, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/178e0d6bf187d054b7e40c888564da1d.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabel3KeyReleased(evt);
            }
        });
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 450));

        ID.setText("jLabel2");
        jPanel3.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 530, 450));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel10.setText("Type:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 40, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel6.setText("Price:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 230, 50, -1));

        brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandActionPerformed(evt);
            }
        });
        brand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                brandKeyTyped(evt);
            }
        });
        jPanel4.add(brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 140, 30));

        jButton33.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-add-16.png"))); // NOI18N
        jButton33.setText("Add");
        jButton33.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 70, 30));

        jButton20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PRINT.png"))); // NOI18N
        jButton20.setText("Print Receipt");
        jButton20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 110, 30));

        jButton8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-unavailable-16.png"))); // NOI18N
        jButton8.setText("Cancel");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 70, 30));

        Price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PriceKeyTyped(evt);
            }
        });
        jPanel4.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 140, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel13.setText("Product Name:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });
        pname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pnameKeyTyped(evt);
            }
        });
        jPanel4.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 140, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setText("TRANSACTION");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        Category.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT TYPE", "Enamel Paint", "Emulsion Paint", "Oil paint", "Anti-Corrosive Paint", "Synthetic Rubber Paint", "Latex paint", "Acrylic Paint", "Silicon Paint", "Alkyd Paint" }));
        jPanel4.add(Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 140, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel14.setText("Brand Name:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 130, 100, -1));

        Quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                QuantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                QuantityKeyTyped(evt);
            }
        });
        jPanel4.add(Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 140, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel12.setText("Quantity:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 280, 70, -1));

        warn.setForeground(new java.awt.Color(255, 51, 0));
        warn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel4.add(warn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 140, 20));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 310, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CASHIERMENU s = new CASHIERMENU();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CASHIERMENU s = new CASHIERMENU();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void print() {
        String cash = txtcash.getText();
        String totalcost = txttotalcost.getText();
        String change = txtchange.getText();

        try {
            new printtransaction(cash, totalcost, change, transactiontable.getModel()).setVisible(true);
        } catch (PrinterException ex) {
            Logger.getLogger(TRANSACTIONPAGE.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        save_data();
        savedata_salesreport();
        print();
        Category.setSelectedItem("SELECT TYPE");
        brand.setText("");
        pname.setText("");
        Price.setText("");
        Quantity.setText("");
        txttotalcost.setText("");
        txtcash.setText("");
        txtchange.setText("");
        DefaultTableModel model = (DefaultTableModel) transactiontable.getModel();
        model.setRowCount(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandActionPerformed

    private void pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conn = DBConnection.getConnection();
         transactiontable.removeColumn(transactiontable.getColumnModel().getColumn(0));
        retrievestocks();

    }//GEN-LAST:event_formWindowOpened

    private void inventtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventtableMouseClicked

        DefaultTableModel model = (DefaultTableModel) inventtable.getModel();
        int selectedRowIndex = inventtable.getSelectedRow();
        ID.setText(model.getValueAt(selectedRowIndex, 0).toString());
        Category.setSelectedItem(model.getValueAt(selectedRowIndex, 1).toString());
        brand.setText(model.getValueAt(selectedRowIndex, 2).toString());
        pname.setText(model.getValueAt(selectedRowIndex, 3).toString());
        Price.setText(model.getValueAt(selectedRowIndex, 4).toString());
    }//GEN-LAST:event_inventtableMouseClicked

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        try {
            String a = "%" + search.getText() + "%";

            String sql = "SELECT Product_id AS 'ID', Type AS 'Type',brandname AS 'BrandName', productname AS 'ProductName',price AS 'Price',Stocks AS 'Stocks'  FROM inventory WHERE productname LIKE'" + a + "' OR Type LIKE'" + a + "' OR Brandname LIKE'" + a + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            inventtable.setModel(DbUtils.resultSetToTableModel(rs));
             inventtable.removeColumn(inventtable.getColumnModel().getColumn(0));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_searchKeyReleased

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        model.removeRow(transactiontable.getSelectedRow());
        int sum = 0;
        for (int e = 0; e < transactiontable.getRowCount(); e++) {
            sum = sum + Integer.parseInt(transactiontable.getValueAt(e, 5).toString());
        }
        txttotalcost.setText(Integer.toString(sum));
        updateinventorycancel();
        retrievestocks();

        Category.setSelectedItem("SELECT TYPE");
        brand.setText("");
        pname.setText("");
        Price.setText("");
        Quantity.setText("");
        txtcash.setText("");
        txtchange.setText("");

    }//GEN-LAST:event_jButton8ActionPerformed

    private void PriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PriceKeyTyped
        char vchar = evt.getKeyChar();

        if (!(Character.isDigit(vchar))) {
            evt.consume();
        }
    }//GEN-LAST:event_PriceKeyTyped

    private void transactiontableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactiontableMouseClicked
        DefaultTableModel model = (DefaultTableModel) transactiontable.getModel();
       
        int selectedRowIndex = transactiontable.getSelectedRow();
        ID.setText(model.getValueAt(selectedRowIndex, 0).toString());
        Category.setSelectedItem(model.getValueAt(selectedRowIndex, 1).toString());
        brand.setText(model.getValueAt(selectedRowIndex, 2).toString());
        pname.setText(model.getValueAt(selectedRowIndex, 3).toString());
        Price.setText(model.getValueAt(selectedRowIndex, 4).toString());
        Quantity.setText(model.getValueAt(selectedRowIndex, 5).toString());

    }//GEN-LAST:event_transactiontableMouseClicked

    private void brandKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_brandKeyTyped
        char vchar = evt.getKeyChar();
        char bchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))) {
            evt.consume();
        } else if (!(Character.isAlphabetic(bchar))) {
            evt.consume();
        }
    }//GEN-LAST:event_brandKeyTyped

    private void pnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnameKeyTyped
        char vchar = evt.getKeyChar();
        char bchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))) {
            evt.consume();
        } else if (!(Character.isAlphabetic(bchar))) {
            evt.consume();
        }
    }//GEN-LAST:event_pnameKeyTyped

    private void QuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantityKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityKeyTyped

    private void QuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantityKeyReleased
        if (Quantity.getText().isEmpty()) {
            warn.setText("");
            jButton33.setEnabled(true);
        } else {
            try {
                String sql = "SELECT * FROM inventory WHERE Product_id = '" + ID.getText() + "'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if (rs.next()) {
                    int available_stocks = Integer.parseInt(rs.getString("Stocks"));
                    int order_quantity = Integer.parseInt(Quantity.getText());
                    if (available_stocks < order_quantity) {
                        //JOptionPane.showMessageDialog(null, "Not Enough Stocks");
                        warn.setText("Not Enough Stocks");
                        jButton33.setEnabled(false);
                    } else {
                        //JOptionPane.showMessageDialog(null, "Enough Stocks");
                        warn.setText("");
                        jButton33.setEnabled(true);
                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_QuantityKeyReleased

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed

        String pid = (ID.getText());
        String type = (String) (Category.getSelectedItem());
        String bname = (brand.getText());
        String prname = (pname.getText());
        int price = (int) Double.parseDouble(Price.getText());
        int qty = Integer.parseInt(Quantity.getText());
        int total = qty * price;

        model = (DefaultTableModel) transactiontable.getModel();
        model.addRow(new Object[]{
            pid,
            type,
            bname,
            prname,
            price,
            qty,
            total});
        int sum = 0;
        for (int i = 0; i < transactiontable.getRowCount(); i++) {
            sum = sum + Integer.parseInt(transactiontable.getValueAt(i, 5).toString());
        }
        txttotalcost.setText(Integer.toString(sum));
        updateinventoryadd();
        retrievestocks();
        ID.setText("");
        Category.setSelectedItem("SELECT TYPE");
        brand.setText("");
        pname.setText("");
        Price.setText("");
        Quantity.setText("");
    }//GEN-LAST:event_jButton33ActionPerformed

    private void txtcashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcashKeyReleased
        if (txtcash.getText().isEmpty()) {
            txtchange.setText("");
        } else {
            int total = Integer.parseInt(txttotalcost.getText());

            int pay = Integer.parseInt(txtcash.getText());
            int change = pay - total;
            txtchange.setText(String.valueOf(change));
        }


    }//GEN-LAST:event_txtcashKeyReleased

    private void txtcashKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcashKeyTyped

    }//GEN-LAST:event_txtcashKeyTyped

    private void transactiontableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactiontableMouseEntered

    }//GEN-LAST:event_transactiontableMouseEntered

    private void jLabel3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3KeyReleased

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
            java.util.logging.Logger.getLogger(TRANSACTIONPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TRANSACTIONPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TRANSACTIONPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TRANSACTIONPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TRANSACTIONPAGE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Category;
    private javax.swing.JLabel ID;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField Quantity;
    private javax.swing.JTextField brand;
    private javax.swing.JTable inventtable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField search;
    private javax.swing.JTable transactiontable;
    private javax.swing.JTextField txtcash;
    private javax.swing.JTextField txtchange;
    private javax.swing.JTextField txttotalcost;
    private javax.swing.JLabel warn;
    // End of variables declaration//GEN-END:variables
private void save_data() {
        model = (DefaultTableModel) transactiontable.getModel();
        String type, bname, prname, price, quantity, totalcost;
        try {
            for (int i = 0; i < transactiontable.getRowCount(); i++) {
                type = model.getValueAt(i, 1).toString();
                bname = model.getValueAt(i, 2).toString();
                prname = model.getValueAt(i, 3).toString();
                price = model.getValueAt(i, 4).toString();
                quantity = model.getValueAt(i, 5).toString();
                totalcost = model.getValueAt(i, 6).toString();

                String sql = "INSERT INTO  transaction(Type,Brandname,Productname,Price,Quantity, Totalcost)VALUE(?,?,?,?,?,?)";

                pst = conn.prepareStatement(sql);
                pst.setString(1, type);
                pst.setString(2, bname);
                pst.setString(3, prname);
                pst.setString(4, price);
                pst.setString(5, quantity);
                pst.setString(6, totalcost);

                pst.execute();

            }
            JOptionPane.showMessageDialog(null, "Transaction Successfull");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void savedata_salesreport() {
        model = (DefaultTableModel) transactiontable.getModel();
        String type, bname, prname, price, quantity, totalcost;
        try {
            for (int i = 0; i < transactiontable.getRowCount(); i++) {
                type = model.getValueAt(i, 1).toString();
                bname = model.getValueAt(i, 2).toString();
                prname = model.getValueAt(i, 3).toString();
                price = model.getValueAt(i, 4).toString();
                quantity = model.getValueAt(i, 5).toString();
                totalcost = model.getValueAt(i, 6).toString();

                String sql = "INSERT INTO  salesreport(Type,Brandname,Productname,Price,Quantity, Totalcost)VALUE(?,?,?,?,?,?)";

                pst = conn.prepareStatement(sql);
                pst.setString(1, type);
                pst.setString(2, bname);
                pst.setString(3, prname);
                pst.setString(4, price);
                pst.setString(5, quantity);
                pst.setString(6, totalcost);

                pst.execute();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void retrievestocks() {
        try {
            String sql = "SELECT Product_id AS 'Product ID',Type AS 'Type',Brandname AS 'Brand Name', Productname AS 'Product Name',Price AS 'Price',Stocks AS 'Stocks'  FROM inventory";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            inventtable.setModel(DbUtils.resultSetToTableModel(rs));
             inventtable.removeColumn(inventtable.getColumnModel().getColumn(0));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    private void updateinventoryadd() {
        try {
            String sql = "UPDATE inventory SET Stocks = Stocks - ? WHERE Product_id = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, Quantity.getText());
            pst.setString(2, ID.getText());
            pst.executeUpdate();
            inventtable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    private void updateinventorycancel() {
        try {
            String sql = "UPDATE inventory SET Stocks = Stocks + ? WHERE Product_id = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, Quantity.getText());
            pst.setString(2, ID.getText());
            pst.executeUpdate();
            inventtable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
}