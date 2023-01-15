/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintsystem;

import java.awt.print.PrinterException;
import javax.swing.table.TableModel;

/**
 *
 * @author ADMIN
 */
public class printtransaction extends javax.swing.JFrame {

    /**
     * Creates new form printtransaction
     */
    public printtransaction() {
        initComponents();
    }
    String lcash;
     String ltotalcost;
      String lchange;
  public printtransaction( String cash, String totalcost, String change, TableModel tableModel) throws PrinterException {
        initComponents();
        this.lcash = cash;
        this.ltotalcost = totalcost;
        this.lchange = change;
        
        txtprint.setText(txtprint.getText()+"******************************************************************************************************\n");
        txtprint.setText(txtprint.getText()+"\n");
        txtprint.setText(txtprint.getText()+"\t"+"                                      CHRISKEN PAINT CENTER                                   \n");    
        txtprint.setText(txtprint.getText()+"\n");
        txtprint.setText(txtprint.getText()+"\n");
        txtprint.setText(txtprint.getText()+"Type"+"\t"+"Brand Name"+"\t"+"Product Name"+"\t"+"Price"+"\t"+"Quantity"+"\t"+"Total Cost");
        for (int i =0; i<tableModel.getRowCount(); i++)
        {
            String Type = (String)tableModel.getValueAt(i, 1);
               String Bname = (String)tableModel.getValueAt(i, 2);
                  String Pname = (String)tableModel.getValueAt(i, 3);
                    int Price = (int)tableModel.getValueAt(i, 4);
                       int Quantity = (int)tableModel.getValueAt(i, 5);
                         int Totalcost = (int)tableModel.getValueAt(i, 6);
       txtprint.setText(txtprint.getText()+"\n");
       txtprint.setText(txtprint.getText()+Type+"\t"+Bname+"\t"+Pname+"\t"+Price+"\t"+Quantity+"\t"+Totalcost);
        }
         txtprint.setText(txtprint.getText()+"\n");
        txtprint.setText(txtprint.getText()+"\n");
         txtprint.setText(txtprint.getText()+"..................................................................................................................................." + "Total Amount: "    +totalcost+  "\n");   
           txtprint.setText(txtprint.getText()+"..................................................................................................................................."+ "Cash: "    +cash+  "\n");  
             txtprint.setText(txtprint.getText()+"..................................................................................................................................."+ "Change: "    +change+  "\n"); 
      txtprint.setText(txtprint.getText()+"********************************************************************************************\n");
      txtprint.setText(txtprint.getText()+"********************************************************************************************\n");
      txtprint.setText(txtprint.getText()+"THANK YOU COME AGAIN!!!................................................................................\n");
      txtprint.print();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtprint = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtprint.setColumns(20);
        txtprint.setRows(5);
        jScrollPane1.setViewportView(txtprint);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(printtransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(printtransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(printtransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(printtransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new printtransaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtprint;
    // End of variables declaration//GEN-END:variables
}
