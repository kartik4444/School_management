
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.lang.String;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import javax.swing .Timer;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import sun.java2d.DisposerTarget;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame.java
 *
 * Created on Jan 4, 2015, 12:12:09 PM
 */

/**
 *
 * @author mukesh
 */
public class login extends javax.swing.JFrame {
    Timer t;
    int u=0;

    /** Creates new form NewJFrame */
    public login() {
        initComponents();
           t=new Timer(1000,new ActionListener(){
            public void actionPerformed(ActionEvent e){
             int sec = Integer.parseInt(sec1.getText());
           
           sec++;
           
             

                 sec1.setText(""+sec);
                 if(sec==4){

                     new mainframe().setVisible(true);
                    Img.setIcon(new ImageIcon());
                     new login().setEnabled(false);
                     exit.doClick();

                 }


              



       

            
            
       
             
            }

           

        });
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Img1 = new javax.swing.JLabel();
        Img2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lbl3 = new javax.swing.JLabel();
        Img8 = new javax.swing.JLabel();
        Img = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        sec1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setDoubleBuffered(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gyanodya.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 18));
        jLabel2.setText("Gyanodaya Vidya Mandir");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("User Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 130, 20));

        jLabel5.setText("<html><font size=6><b>U</b>ser <b>     N</b>ame");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        tf1.setFont(new java.awt.Font("Arial Narrow", 1, 18));
        tf1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        jPanel1.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 180, 30));

        jLabel6.setText("<html><font size=6><b>P</b>assword");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        tf2.setFont(new java.awt.Font("Tahoma", 1, 14));
        tf2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        tf2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tf2CaretUpdate(evt);
            }
        });
        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });
        tf2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf2FocusGained(evt);
            }
        });
        jPanel1.add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 180, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro (7).png"))); // NOI18N
        jButton1.setText("<html><font size=4><b>N</b>ew<b>  U</b>ser");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 120, 40));

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro (9).png"))); // NOI18N
        btn2.setText("<html><font size=4><b>L</b>ogin");
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 110, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro (6).png"))); // NOI18N
        jButton3.setText("<html><font size=3><b>S</b>ystem<b> E</b>xit</font>\n");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 110, 30));
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 240, 20));

        Img8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animated-gifs-birds-031.gif"))); // NOI18N
        Img8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Img8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 100, 70));
        jPanel1.add(Img, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 100, 60));

        exit.setText("exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 0, 0));

        sec1.setText("00");
        jPanel1.add(sec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 10, 0));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         new newuser().setVisible(true);
         this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        String rt = new String (tf2.getPassword());

           try{


               Class.forName("java.sql.Driver");
               Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/school1", "root", "tiger");

               Statement stmt = (Statement) con.createStatement();
               String qry = "Select * from userid;";
               ResultSet rs = stmt.executeQuery(qry);

               while(rs.next())

               {       lbl3.setText("");
                   String name = rs.getString("name");
                   String passward = rs.getString("password");

                 if(name.equals(tf1.getText())&&passward.equals(rt)){

                {  
                   t.start();
                   Img.setIcon(new ImageIcon("E:\\pics1\\1.GIF"));
                   break;
                   


                   


                }
        
             



                 }

               


                 
               
               
                
                else{
                    lbl3.setText("password incorrect");
                    
                      }
 
               }
           
               rs.close();
               stmt.close();
               con.close();





           }


           catch(Exception e)
           {
              JOptionPane.showMessageDialog(null , "oops Error in Coonectivity");

           }



        

  
         









 

    }//GEN-LAST:event_btn2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        sec1.setVisible(false);
        exit.setVisible(false);
        tf1.requestFocus();
       
            

   
        
    }//GEN-LAST:event_formWindowOpened

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
        tf2.requestFocus();
    }//GEN-LAST:event_tf1ActionPerformed

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
        btn2.requestFocus();
        btn2.doClick();

    }//GEN-LAST:event_tf2ActionPerformed

    private void tf2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tf2CaretUpdate
        // TODO add your handling code here:
      
    }//GEN-LAST:event_tf2CaretUpdate

    private void tf2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf2FocusGained
        // TODO add your handling code here:


          lbl3.setText("");
    }//GEN-LAST:event_tf2FocusGained

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Img;
    private javax.swing.JLabel Img1;
    private javax.swing.JLabel Img2;
    private javax.swing.JLabel Img8;
    private javax.swing.JButton btn2;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel sec1;
    private javax.swing.JTextField tf1;
    private javax.swing.JPasswordField tf2;
    // End of variables declaration//GEN-END:variables

}
