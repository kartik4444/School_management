/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.ImageIcon;
import java.sql.*;
import javax.swing.table.*;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.sql.*;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.util.*;
import javax.swing.table.DefaultTableModel;
/*
 * chkpay.java
 *
 * Created on Jan 25, 2015, 4:47:13 PM
 */

/**
 *
 * @author Kartik
 */
public class chkpay extends javax.swing.JFrame {

    /** Creates new form chkpay */
    public chkpay() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("<html><font size=9><b>c</b>heck List");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 190, 60));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel2.setText("<html><hr><font size=8>GYANODAYA VIDYA MANDIR<hr>");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Admission number", "Name", "Father name", "Mother name", "City", "Installement First", "Installement Second"
            }
        ));
        t1.setGridColor(new java.awt.Color(102, 102, 255));
        jScrollPane1.setViewportView(t1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 810, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:


DefaultTableModel model=(DefaultTableModel)t1.getModel();

    int row =model.getRowCount();
    if(row>0){
        for(int i=0; i<row; i++){

            model.removeRow(0);

        }
    }
    try {


               Class.forName("java.sql.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost/school1","root", "tiger");

               Statement stmt =  con.createStatement();
               String qry = "Select * from payment;";
          ResultSet rs = stmt.executeQuery(qry);


               while(rs.next())

               {String subject=rs.getString("addmission");
                    String num =rs.getString("name");
                       String grade =rs.getString("payment_paid");
                       String tr=rs.getString("payment_remain");
                      
                       String t1=rs.getString("fill");
                         String t13=rs.getString("fill2");
                          String tr5=rs.getString("father_name");

                       String t18=rs.getString("mother_name");
                         String t17=rs.getString("city");
              model.addRow(new Object[]{

                    subject,num,tr5,t18,t17,t1,t13

              });
                   }


               rs.close();
               stmt.close();
               con.close();



    }






           catch(Exception e)
           {
              JOptionPane.showMessageDialog(null , "error");










           }






    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chkpay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable t1;
    // End of variables declaration//GEN-END:variables

}
