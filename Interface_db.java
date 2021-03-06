/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ddaar
 */
public class Interface_db extends javax.swing.JFrame implements WindowListener, Observer {

    Controleur contr;
    Modele donne;

    /**
     * Creates new form interface_db
     */
    public Interface_db(Controleur c, Modele m) {
        initComponents();
        contr = c;
        donne = m;
        m.addObserver(this);
        donne.select_query();
        donne.premier();

        setLocationRelativeTo(null);
        setResizable(true);

        addWindowListener(this);
    }

    @Override
    public void windowClosing(WindowEvent e) {
//        try {
//            donne.getUtilitaire().deconnection_();
//        } catch (SQLException ex) {
//            // Logger.getLogger(Interface_db.class.getName()).log(Level.SEVERE, null, ex);
//        }
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
        JBdernier = new javax.swing.JButton();
        JBsuivant = new javax.swing.JButton();
        JBprecedent = new javax.swing.JButton();
        JBpremier = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        code_l = new javax.swing.JLabel();
        code_t = new javax.swing.JTextField();
        designation_l = new javax.swing.JLabel();
        designation_t = new javax.swing.JTextField();
        code_categorie_l = new javax.swing.JLabel();
        code_categorie_t = new javax.swing.JTextField();
        prix_l = new javax.swing.JLabel();
        prix_t = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        JBnouveau = new javax.swing.JButton();
        JBAjouter = new javax.swing.JButton();
        JBAnnuler = new javax.swing.JButton();
        JBmodifier = new javax.swing.JButton();
        JBsupprimer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 1, 1, 1));

        JBdernier.setText("Dernier");
        JBdernier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBdernierActionPerformed(evt);
            }
        });
        jPanel1.add(JBdernier);

        JBsuivant.setText("Suivant");
        JBsuivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsuivantActionPerformed(evt);
            }
        });
        jPanel1.add(JBsuivant);

        JBprecedent.setText("Precedent");
        JBprecedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBprecedentActionPerformed(evt);
            }
        });
        jPanel1.add(JBprecedent);

        JBpremier.setText("Premier");
        JBpremier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBpremierActionPerformed(evt);
            }
        });
        jPanel1.add(JBpremier);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 50, 50, 50));
        jPanel4.setLayout(new java.awt.GridLayout(4, 2));

        code_l.setText("code");
        jPanel4.add(code_l);
        jPanel4.add(code_t);

        designation_l.setText("designation");
        jPanel4.add(designation_l);
        jPanel4.add(designation_t);

        code_categorie_l.setText("code categorie");
        jPanel4.add(code_categorie_l);
        jPanel4.add(code_categorie_t);

        prix_l.setText("prix");
        jPanel4.add(prix_l);
        jPanel4.add(prix_t);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        jLabel5.setText("cette application vous permet de parcourir et de modifier les enregitrements de la table article");
        jPanel2.add(jLabel5, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 50, 1));

        JBnouveau.setText("Nouveau");
        JBnouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBnouveauActionPerformed(evt);
            }
        });
        jPanel3.add(JBnouveau);

        JBAjouter.setText("Ajouter");
        JBAjouter.setEnabled(false);
        JBAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAjouterActionPerformed(evt);
            }
        });
        jPanel3.add(JBAjouter);

        JBAnnuler.setText("Annuler");
        JBAnnuler.setEnabled(false);
        JBAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAnnulerActionPerformed(evt);
            }
        });
        jPanel3.add(JBAnnuler);

        JBmodifier.setText("Modifier");
        JBmodifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBmodifierActionPerformed(evt);
            }
        });
        jPanel3.add(JBmodifier);

        JBsupprimer.setText("Supprimer");
        JBsupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsupprimerActionPerformed(evt);
            }
        });
        jPanel3.add(JBsupprimer);

        getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void JBdernierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBdernierActionPerformed
        contr.afficherDernier();
    }//GEN-LAST:event_JBdernierActionPerformed

    private void JBsuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsuivantActionPerformed
        contr.afficherSuivant();
    }//GEN-LAST:event_JBsuivantActionPerformed

    private void JBprecedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBprecedentActionPerformed
        contr.afficherPrecedent();
    }//GEN-LAST:event_JBprecedentActionPerformed

    private void JBpremierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBpremierActionPerformed
        contr.afficherPremier();
    }//GEN-LAST:event_JBpremierActionPerformed

    private void JBnouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBnouveauActionPerformed
//        Nouveau une_fenetre = new Nouveau(donne, this);
//        une_fenetre.setVisible(true);
//        setResizable(true);
//        setLocationRelativeTo(null);

        JBAjouter.setEnabled(true);
        JBAnnuler.setEnabled(true);
        JBnouveau.setEnabled(false);
        JBmodifier.setEnabled(false);
        JBsupprimer.setEnabled(false);
        JBpremier.setEnabled(false);
        JBprecedent.setEnabled(false);
        JBsuivant.setEnabled(false);
        JBdernier.setEnabled(false);
        code_t.setText("");
        designation_t.setText("");
        code_categorie_t.setText("");
        prix_t.setText("");
        contr.saveCurrentRow();
    }//GEN-LAST:event_JBnouveauActionPerformed

    private void JBmodifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBmodifierActionPerformed
        if (verifyInput()) {
            contr.modifierCurent(code_t.getText(), designation_t.getText(), code_categorie_t.getText(), prix_t.getText());
        }
    }//GEN-LAST:event_JBmodifierActionPerformed

    private void JBsupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsupprimerActionPerformed
        contr.supprimerCurent();
    }//GEN-LAST:event_JBsupprimerActionPerformed

    private void JBAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAjouterActionPerformed
        if (verifyInput()) {
            contr.AjouterRow(code_t.getText(), designation_t.getText(), code_categorie_t.getText(), prix_t.getText());
            JBAjouter.setEnabled(false);
            JBAnnuler.setEnabled(false);
            JBnouveau.setEnabled(true);
            JBmodifier.setEnabled(true);
            JBsupprimer.setEnabled(true);
            JBpremier.setEnabled(true);
            JBprecedent.setEnabled(true);
            JBsuivant.setEnabled(true);
            JBdernier.setEnabled(true);
        }

    }//GEN-LAST:event_JBAjouterActionPerformed

    private void JBAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAnnulerActionPerformed
        JBAjouter.setEnabled(false);
        JBAnnuler.setEnabled(false);
        JBnouveau.setEnabled(true);
        JBmodifier.setEnabled(true);
        JBsupprimer.setEnabled(true);
        JBpremier.setEnabled(true);
        JBprecedent.setEnabled(true);
        JBsuivant.setEnabled(true);
        JBdernier.setEnabled(true);
        contr.annulerAjout();
    }//GEN-LAST:event_JBAnnulerActionPerformed

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
            java.util.logging.Logger.getLogger(Interface_db.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_db.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_db.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_db.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new Interface_db().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAjouter;
    private javax.swing.JButton JBAnnuler;
    private javax.swing.JButton JBdernier;
    private javax.swing.JButton JBmodifier;
    private javax.swing.JButton JBnouveau;
    private javax.swing.JButton JBprecedent;
    private javax.swing.JButton JBpremier;
    private javax.swing.JButton JBsuivant;
    private javax.swing.JButton JBsupprimer;
    private javax.swing.JLabel code_categorie_l;
    private javax.swing.JTextField code_categorie_t;
    private javax.swing.JLabel code_l;
    private javax.swing.JTextField code_t;
    private javax.swing.JLabel designation_l;
    private javax.swing.JTextField designation_t;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel prix_l;
    private javax.swing.JTextField prix_t;
    // End of variables declaration//GEN-END:variables

    @Override
    public void windowOpened(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Observable o, Object arg) {
        code_t.setText(contr.getCode());
        designation_t.setText(contr.getDesignation());
        code_categorie_t.setText(contr.getCodeCategorie());
        prix_t.setText(contr.getPrix());

        if (!contr.getMessage().equals("")) {
            JOptionPane.showMessageDialog(this, contr.getMessage());
        }

    }

    public boolean verifyInput() {
        String inputFeedback = "";
        if (code_t.getText() == null || code_t.getText().isEmpty()) {
            inputFeedback += "Le champ code doit avoir un valeur\n";

        }
        if (designation_t.getText() == null || designation_t.getText().isEmpty()) {
            inputFeedback += "Le champ designation doit avoir un valeur\n";

        }
        if (code_categorie_t.getText() == null || code_categorie_t.getText().isEmpty()) {
            inputFeedback += "Le champ code categorie doit avoir un valeur\n";

        }
        try {
            Double.parseDouble(prix_t.getText());
            //JOptionPane.showMessageDialog(this, "Good to go");

        } catch (NumberFormatException ex) {
            inputFeedback += "Le prix doit etre numeric\n";

        }
        if (!inputFeedback.equals("")) {
            JOptionPane.showMessageDialog(this, inputFeedback);
            return false;
        } else {
            return true;
        }
    }
}
