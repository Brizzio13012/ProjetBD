/*
 * Created by JFormDesigner on Tue Nov 27 23:40:04 CET 2018
 */

package gui;

import DAO.UtilisateurDAO;
import connection.SConnection;
import utils.UserCourant;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Fabrice
 */
public class Login extends JPanel {
    public Login() {
        initComponents();
    }

    private void button2MouseClicked(MouseEvent e) {
        JPanel contentPane = (JPanel) ((JFrame) this.getTopLevelAncestor()).getContentPane();
        contentPane.removeAll();
        contentPane.add(new Formulaire());
        contentPane.revalidate();
        contentPane.repaint();
    }

    private void button1MouseClicked(MouseEvent e) {
        JPanel contentPane = (JPanel) ((JFrame) this.getTopLevelAncestor()).getContentPane();
        if ( this.mail.getText().equals("admin")) {
            UserCourant.setAdmin(true);
            contentPane.removeAll();
            contentPane.add(new AdminMenuSalle());
        }
        else if (new UtilisateurDAO(SConnection.getInstance()).find(this.mail.getText()) != null){
            contentPane.removeAll();
            contentPane.add(new MenuSalle());
        }
        else System.out.println("Utilisateur inexistant");
        contentPane.revalidate();
        contentPane.repaint();
    }

    private void userMouseClicked(MouseEvent e) {
        ajout.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Fabrice
        text = new JLabel();
        mail = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        user = new JButton();
        ajout = new JDialog();
        scrollPane1 = new JScrollPane();
        table1 = new JTable(new UtilisateurListe().getData(), new UtilisateurListe().getEntetes());

        //======== this ========
        setBackground(Color.gray);
        setPreferredSize(new Dimension(600, 500));

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


        //---- text ----
        text.setText("Adresse mail");
        text.setBackground(Color.gray);
        text.setFont(text.getFont().deriveFont(text.getFont().getSize() + 5f));
        text.setForeground(Color.black);
        text.setHorizontalAlignment(SwingConstants.CENTER);

        //---- button1 ----
        button1.setText("Valider");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });

        //---- button2 ----
        button2.setText("Nouveau Client");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });

        //---- user ----
        user.setText("Liste des utilisateurs");
        user.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                userMouseClicked(e);
            }
        });

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(mail, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 159, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(text, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(201, Short.MAX_VALUE))))
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(263, Short.MAX_VALUE)
                    .addComponent(button1)
                    .addGap(259, 259, 259))
                .addGroup(layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(user)
                    .addContainerGap(385, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(user)
                    .addGap(65, 65, 65)
                    .addComponent(text, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(mail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(button1)
                    .addGap(88, 88, 88)
                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(66, Short.MAX_VALUE))
        );

        //======== ajout ========
        {
            ajout.setBackground(Color.gray);
            ajout.setModal(true);
            ajout.setResizable(false);
            Container ajoutContentPane = ajout.getContentPane();

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(table1);
            }

            GroupLayout ajoutContentPaneLayout = new GroupLayout(ajoutContentPane);
            ajoutContentPane.setLayout(ajoutContentPaneLayout);
            ajoutContentPaneLayout.setHorizontalGroup(
                ajoutContentPaneLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, ajoutContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                        .addContainerGap())
            );
            ajoutContentPaneLayout.setVerticalGroup(
                ajoutContentPaneLayout.createParallelGroup()
                    .addGroup(ajoutContentPaneLayout.createSequentialGroup()
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 52, Short.MAX_VALUE))
            );
            ajout.pack();
            ajout.setLocationRelativeTo(ajout.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Fabrice
    private JLabel text;
    private JTextField mail;
    private JButton button1;
    private JButton button2;
    private JButton user;
    private JDialog ajout;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
