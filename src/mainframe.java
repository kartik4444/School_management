
import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * mainframe.java
 *
 * Created on Dec 26, 2014, 10:02:18 PM
 */

/**
 *
 * @author mukesh
 */
public class mainframe extends javax.swing.JFrame {
    private Object t1;

    /** Creates new form mainframe */
    public mainframe() {
        initComponents();
          Timer t2=new Timer(100,new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int i=Integer.parseInt(ctr.getText());
                int j = i%40;
                i++;
                ctr.setText(""+i);
                ctr.setVisible(false);
                switch(j){
                    case 0:Img.setIcon(new ImageIcon("E:\\pics\\1.PNG"));
                        break;
                    case 1:Img.setIcon(new ImageIcon("E:\\pics\\2.PNG"));
                        break;
                    case 3:Img.setIcon(new ImageIcon("E:\\pics\\3.PNG"));
                        break;
                    case 4:Img.setIcon(new ImageIcon("E:\\pics\\4.PNG"));
                        break;
                    case 5:Img.setIcon(new ImageIcon("E:\\pics\\5.PNG"));
                        break;
                    case 6:Img.setIcon(new ImageIcon("E:\\pics\\6.PNG"));
                        break;
                    case 7:Img.setIcon(new ImageIcon("E:\\pics\\7.PNG"));
                        break;
                    case 8:Img.setIcon(new ImageIcon("E:\\pics\\8.PNG"));
                        break;
                    case 9:Img.setIcon(new ImageIcon("E:\\pics\\9.PNG"));
                        break;
                    case 10:Img.setIcon(new ImageIcon("E:\\pics\\10.PNG"));
                        break;
                    case 11:Img.setIcon(new ImageIcon("E:\\pics\\11.PNG"));
                        break;
                    case 12:Img.setIcon(new ImageIcon("E:\\pics\\12.PNG"));
                        break;
                    case 13:Img.setIcon(new ImageIcon("E:\\pics\\13.PNG"));
                        break;
                    case 14:Img.setIcon(new ImageIcon("E:\\pics\\14.PNG"));
                        break;
                    case 15:Img.setIcon(new ImageIcon("E:\\pics\\15.PNG"));
                        break;
                    case 16:Img.setIcon(new ImageIcon("E:\\pics\\16.PNG"));
                        break;
                    case 17:Img.setIcon(new ImageIcon("E:\\pics\\17.PNG"));
                        break;
                    case 18:Img.setIcon(new ImageIcon("E:\\pics\\18.PNG"));
                        break;
                    case 19:Img.setIcon(new ImageIcon("E:\\pics\\19.PNG"));
                        break;
                    case 20:Img.setIcon(new ImageIcon("E:\\pics\\20.PNG"));
                        break;
                    case 21:Img.setIcon(new ImageIcon("E:\\pics\\21.PNG"));
                        break;
                    case 22:Img.setIcon(new ImageIcon("E:\\pics\\22.PNG"));
                        break;
                    case 23:Img.setIcon(new ImageIcon("E:\\pics\\23.PNG"));
                        break;
                    case 24:Img.setIcon(new ImageIcon("E:\\pics\\24.PNG"));
                                break;
                     case 25:Img.setIcon(new ImageIcon("E:\\pics\\25.PNG"));
                        break;
                    case 26:Img.setIcon(new ImageIcon("E:\\pics\\26.PNG"));
                        break;
                    case 27:Img.setIcon(new ImageIcon("E:\\pics\\27.PNG"));
                        break;
                    case 28:Img.setIcon(new ImageIcon("E:\\pics\\28.PNG"));
                        break;
                    case 29:Img.setIcon(new ImageIcon("E:\\pics\\29.PNG"));
                        break;
                    case 30:Img.setIcon(new ImageIcon("E:\\pics\\30.PNG"));
                        break;
                    case 31:Img.setIcon(new ImageIcon("E:\\pics\\31.PNG"));
                        break;
                    case 32:Img.setIcon(new ImageIcon("E:\\pics\\32.PNG"));
                        break;
                    case 33:Img.setIcon(new ImageIcon("E:\\pics\\33.PNG"));
                        break;
                    case 34:Img.setIcon(new ImageIcon("E:\\pics\\34.PNG"));
                        break;
                    case 35:Img.setIcon(new ImageIcon("E:\\pics\\35.PNG"));
                        break;
                    case 36:Img.setIcon(new ImageIcon("E:\\pics\\36.PNG"));
                        break;
                    case 37:Img.setIcon(new ImageIcon("E:\\pics\\37.PNG"));
                        break;
                    case 38:Img.setIcon(new ImageIcon("E:\\pics\\38.PNG"));
                        break;
                    case 39:Img.setIcon(new ImageIcon("E:\\pics\\39.PNG"));
                        break;
                      case 40:Img.setIcon(new ImageIcon("E:\\pics\\40.PNG"));
                      j=0;
                        break;
                   
                      
                }
            }
          });
          t2.start();








          Timer t1=new Timer(500,new ActionListener(){
            public void actionPerformed(ActionEvent e){

                int hh,mm,ss,Day,doweek;
                int mont;
                ss=Integer.parseInt(sec.getText());
                mm=Integer.parseInt(min.getText());
                hh=Integer.parseInt(hour.getText());
                Day=Integer.parseInt(day.getText());


                 int a=Integer.parseInt(ctr.getText());
                 int b=a%2;
                 a++;
                 switch(b){
                    case 0: x.setText("");x1.setText("");

                        break;
                     case 1:
                         x.setText(":"); x1.setText(":");
                        break;
                }
                ss=ss+1;

                if(ss==60)
                    {
                    ss=0;
                    mm=mm+1;
                }
                if(mm==60)
                    {
                    mm=0;
                    hh=hh+1;
                }
                if(hh==24)
                    {
                    hh=0;
                }

                 Calendar c=Calendar.getInstance();
                sec.setText(""+c.get(Calendar.SECOND));
                min.setText(""+c.get(Calendar.MINUTE));
                hour.setText(""+c.get(Calendar.HOUR));
               
                mon.setText(""+c.get(Calendar.MONTH)+1);
                day.setText(""+c.get(Calendar.DATE));
                dayofweek.setText(""+c.get(Calendar.DAY_OF_WEEK));
                mon.setVisible(false);
                dayofweek.setVisible(false);
                mont=Integer.parseInt(mon.getText());
                doweek=Integer.parseInt(dayofweek.getText());
                switch(doweek){
                    case 1: dna.setText("Sunday");
                    break;
                    case 2: dna.setText("Monday");
                    break;
                    case 3: dna.setText("Tuesday");
                    break;
                    case 4: dna.setText("Wednesday");
                    break;
                    case 5: dna.setText("Thursday");
                    break;
                    case 6: dna.setText("Friday");
                    break;
                    case 7: dna.setText("Saturday");
                    break;
                }
                switch(mont){
                    case 1: month.setText("January");
                    break;
                    case 2: month.setText("February");
                    break;
                    case 3: month.setText("March");
                    break;
                    case 4: month.setText("April");
                    break;
                    case 5: month.setText("May");
                    break;
                    case 6: month.setText("June");
                    break;
                    case 7: month.setText("July");
                    break;
                    case 8: month.setText("August");
                    break;
                    case 9: month.setText("September");
                    break;
                    case 10: month.setText("October");
                    break;
                    case 11: month.setText("November");
                    break;
                    case 12: month.setText("December");
                    break;
                }

            }
        });
        t1.start();
         

         }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dayofweek = new javax.swing.JLabel();
        mon = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        hour = new javax.swing.JLabel();
        ctr = new javax.swing.JLabel();
        sec = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        day = new javax.swing.JLabel();
        dna = new javax.swing.JLabel();
        month = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        Img = new javax.swing.JLabel();

        dayofweek.setFont(new java.awt.Font("Tahoma", 1, 36));
        dayofweek.setForeground(new java.awt.Color(255, 255, 255));
        dayofweek.setText("00");

        mon.setText("00");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addmission.jpg"))); // NOI18N
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setLabel("<html><font size= 6><center>Addmision</font></html>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 150, 70));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Light", 1, 18));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tc.png"))); // NOI18N
        jButton2.setText("<html><font size=6>Transfer<br><center>Form</br></font>");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 160, 80));

        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result.png"))); // NOI18N
        jButton3.setText("<html><font size=6><center><b>M</b>ake<br><center><b>R</b>eport");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setInheritsPopupMenu(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 220, 80));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro (5).png"))); // NOI18N
        jButton5.setText("<html><font size=6><center>Student<br><center>Profile");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 150, 80));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/report.png"))); // NOI18N
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 220, 100));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro (8).png"))); // NOI18N
        jButton6.setText("<html><font size=6><center><p>Payment<br><center>Form");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 160, 90));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic4.png"))); // NOI18N
        jButton7.setText("<html><font size=6>  <center><b>C</b>heck<br><center><P><b>P</b>ayment");
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 150, 70));

        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RED002.JPG"))); // NOI18N
        jButton8.setText("<html><font size = 4><b>S</b>ystem<b>  E</b>xit</font>");
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 120, 30));

        hour.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        hour.setForeground(new java.awt.Color(255, 102, 0));
        hour.setText("00");
        getContentPane().add(hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 80, 70));

        ctr.setText("1");
        getContentPane().add(ctr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 10));

        sec.setFont(new java.awt.Font("Tahoma", 1, 48));
        sec.setForeground(new java.awt.Color(204, 102, 0));
        sec.setText("00");
        getContentPane().add(sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 220, 70, 50));

        min.setFont(new java.awt.Font("Tahoma", 1, 48));
        min.setForeground(new java.awt.Color(204, 102, 0));
        min.setText("00");
        getContentPane().add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 70, 50));

        day.setFont(new java.awt.Font("Tahoma", 1, 36));
        day.setForeground(new java.awt.Color(204, 102, 0));
        day.setText("00");
        getContentPane().add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 60, 50));

        dna.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        dna.setForeground(new java.awt.Color(204, 102, 0));
        getContentPane().add(dna, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, 230, 50));

        month.setFont(new java.awt.Font("Tahoma", 1, 48));
        month.setForeground(new java.awt.Color(204, 102, 0));
        getContentPane().add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 220, 60));

        x.setFont(new java.awt.Font("Tahoma", 1, 36));
        x.setForeground(new java.awt.Color(204, 102, 0));
        getContentPane().add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 40, 60));

        x1.setFont(new java.awt.Font("Tahoma", 1, 36));
        x1.setForeground(new java.awt.Color(204, 102, 0));
        getContentPane().add(x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, 50, 50));

        Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main.JPG"))); // NOI18N
        Img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12));
        getContentPane().add(Img, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1200, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new admission().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           new tcframe().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
           new resultframe().setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
             new studenprofile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
              new fee().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         this.dispose();
           new chkpay().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
           new records().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:


              new login().setVisible(false);


    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
                

    }//GEN-LAST:event_formWindowOpened

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Img;
    private javax.swing.JLabel ctr;
    private javax.swing.JLabel day;
    private javax.swing.JLabel dayofweek;
    private javax.swing.JLabel dna;
    private javax.swing.JLabel hour;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel min;
    private javax.swing.JLabel mon;
    private javax.swing.JLabel month;
    private javax.swing.JLabel sec;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    // End of variables declaration//GEN-END:variables

}
