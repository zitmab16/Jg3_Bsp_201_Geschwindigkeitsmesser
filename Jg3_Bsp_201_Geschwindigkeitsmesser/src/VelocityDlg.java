
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vizug
 */
public class VelocityDlg extends javax.swing.JDialog {

    private boolean ok = false;
    private Measurement m = null;

    /**
     * Creates new form VelocityDlg
     */
    public VelocityDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    public boolean isOk() {
        return ok;
    }

    public Measurement getMeasurement() {
        return m;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbDatum = new javax.swing.JLabel();
        tfDatum = new javax.swing.JTextField();
        lbUhrzeit = new javax.swing.JLabel();
        tfUhrzeit = new javax.swing.JTextField();
        lbKennzeichen = new javax.swing.JLabel();
        tfKennzeichen = new javax.swing.JTextField();
        lbVGemessen = new javax.swing.JLabel();
        tfVGemessen = new javax.swing.JTextField();
        lbVErlaubt = new javax.swing.JLabel();
        tfVErlaubt = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        btcancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(6, 2));

        lbDatum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDatum.setText("Datum: ");
        getContentPane().add(lbDatum);

        tfDatum.setText("12.03.2001");
        getContentPane().add(tfDatum);

        lbUhrzeit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbUhrzeit.setText("Uhrzeit: ");
        getContentPane().add(lbUhrzeit);

        tfUhrzeit.setText("12:03");
        getContentPane().add(tfUhrzeit);

        lbKennzeichen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbKennzeichen.setText("Kennzeichen: ");
        getContentPane().add(lbKennzeichen);

        tfKennzeichen.setText("SO-NNE6");
        getContentPane().add(tfKennzeichen);

        lbVGemessen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbVGemessen.setText("V-Gemessen: ");
        getContentPane().add(lbVGemessen);

        tfVGemessen.setText("132.3");
        getContentPane().add(tfVGemessen);

        lbVErlaubt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbVErlaubt.setText("V-Erlaubt: ");
        getContentPane().add(lbVErlaubt);

        tfVErlaubt.setText("80");
        tfVErlaubt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfVErlaubtActionPerformed(evt);
            }
        });
        getContentPane().add(tfVErlaubt);

        btAdd.setText("Übernehmen");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        getContentPane().add(btAdd);

        btcancel.setText("Abbrechen");
        btcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelActionPerformed(evt);
            }
        });
        getContentPane().add(btcancel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfVErlaubtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfVErlaubtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfVErlaubtActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed

//        LocalDate date = LocalDate.parse(tfDatum.getText(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//        LocalTime time = LocalTime.parse(tfUhrzeit.getText(), DateTimeFormatter.ofPattern("hh:mm"));
//        LocalDateTime ldt = LocalDateTime.of(date, time);
        String str = tfDatum.getText();
        str = str + " " + tfUhrzeit.getText();

        LocalDateTime ldt = LocalDateTime.parse(str, DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));

        String kz = tfKennzeichen.getText();
        int ver = Integer.parseInt(tfVErlaubt.getText());
        int vge = Integer.parseInt(tfVGemessen.getText());

        m = new Measurement(ldt, kz, vge, ver);

        ok = true;
        this.dispose();
    }//GEN-LAST:event_btAddActionPerformed

    private void btcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelActionPerformed
        this.dispose();
        ok = false;
    }//GEN-LAST:event_btcancelActionPerformed

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
            java.util.logging.Logger.getLogger(VelocityDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VelocityDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VelocityDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VelocityDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VelocityDlg dialog = new VelocityDlg(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btcancel;
    private javax.swing.JLabel lbDatum;
    private javax.swing.JLabel lbKennzeichen;
    private javax.swing.JLabel lbUhrzeit;
    private javax.swing.JLabel lbVErlaubt;
    private javax.swing.JLabel lbVGemessen;
    private javax.swing.JTextField tfDatum;
    private javax.swing.JTextField tfKennzeichen;
    private javax.swing.JTextField tfUhrzeit;
    private javax.swing.JTextField tfVErlaubt;
    private javax.swing.JTextField tfVGemessen;
    // End of variables declaration//GEN-END:variables
}
