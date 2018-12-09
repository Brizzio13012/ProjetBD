/*
 * Created by JFormDesigner on Tue Nov 27 23:55:32 CET 2018
 */

package gui;

import DAO.UtilisateurDAO;
import connection.SConnection;
import utils.Utilisateur;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Fabrice
 */
public class Formulaire extends JPanel {
    public Formulaire() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        // Création de l'objet utilisateur
        Utilisateur user = new Utilisateur(this.nom.getText(),this.prenom.getText(),this.email.getText(),this.adresse.getText());

        // Création du DAO pour se connecter à la BD
        UtilisateurDAO daoUser= new UtilisateurDAO(SConnection.getInstance());
        if (daoUser.find(this.email.getText()) != null) {
            System.out.println("Mail déjà utilisé");
        }
        else {
            daoUser.create(user);
            JPanel contentPane = (JPanel) ((JFrame) this.getTopLevelAncestor()).getContentPane();
            contentPane.removeAll();
            contentPane.add(new Login());
            contentPane.revalidate();
        }
    }

    private void annulerMouseClicked(MouseEvent e) {
        JPanel contentPane = (JPanel) ((JFrame) this.getTopLevelAncestor()).getContentPane();
        contentPane.removeAll();
        contentPane.add(new Login());
        contentPane.revalidate();
        contentPane.repaint();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Fabrice
        button1 = new JButton();
        textField5 = new JLabel();
        textField6 = new JLabel();
        textField7 = new JLabel();
        nom = new JTextField();
        email = new JTextField();
        prenom = new JTextField();
        annuler = new JButton();
        textField1 = new JLabel();
        textField8 = new JLabel();
        adresse = new JTextField();

        //======== this ========
        setBackground(Color.gray);
        setPreferredSize(new Dimension(600, 500));

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


        //---- button1 ----
        button1.setText("Valider");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });

        //---- textField5 ----
        textField5.setText("Nom");
        textField5.setBackground(Color.gray);
        textField5.setFont(textField5.getFont().deriveFont(textField5.getFont().getSize() + 5f));
        textField5.setForeground(Color.black);

        //---- textField6 ----
        textField6.setText("Pr\u00e9nom");
        textField6.setBackground(Color.gray);
        textField6.setFont(textField6.getFont().deriveFont(textField6.getFont().getSize() + 5f));
        textField6.setForeground(Color.black);

        //---- textField7 ----
        textField7.setText("E-mail");
        textField7.setBackground(Color.gray);
        textField7.setFont(textField7.getFont().deriveFont(textField7.getFont().getSize() + 5f));
        textField7.setForeground(Color.black);

        //---- annuler ----
        annuler.setText("Annuler");
        annuler.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                annulerMouseClicked(e);
            }
        });

        //---- textField1 ----
        textField1.setHorizontalAlignment(SwingConstants.CENTER);
        textField1.setFont(new Font("Noto Sans", Font.PLAIN, 26));
        textField1.setText("Inscription");
        textField1.setBackground(Color.gray);

        //---- textField8 ----
        textField8.setText("Adresse");
        textField8.setBackground(Color.gray);
        textField8.setFont(textField8.getFont().deriveFont(textField8.getFont().getSize() + 5f));
        textField8.setForeground(Color.black);

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(230, 230, 230)
                                    .addComponent(annuler, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(139, 139, 139)
                                    .addGroup(layout.createParallelGroup()
                                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(textField5)
                                                .addComponent(textField6)
                                                .addComponent(textField7)
                                                .addComponent(textField8))
                                            .addGap(27, 27, 27)
                                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(prenom)
                                                .addComponent(email)
                                                .addComponent(nom, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(adresse, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))))))
                            .addGap(0, 155, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(textField1)
                    .addGap(85, 85, 85)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(nom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(textField6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(prenom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(textField7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(textField8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(adresse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(50, 50, 50)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)
                    .addComponent(annuler)
                    .addContainerGap(52, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Fabrice
    private JButton button1;
    private JLabel textField5;
    private JLabel textField6;
    private JLabel textField7;
    private JTextField nom;
    private JTextField email;
    private JTextField prenom;
    private JButton annuler;
    private JLabel textField1;
    private JLabel textField8;
    private JTextField adresse;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
