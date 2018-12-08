/*
 * Created by JFormDesigner on Fri Dec 07 19:37:56 CET 2018
 */

package gui;

import org.jdesktop.beansbinding.*;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import utils.SalleDeVente;
import utils.TypeEnchere;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.TableColumn;

/**
 * @author Fabrice
 */
public class AdminMenuSalle extends JPanel {
    public AdminMenuSalle() {
        initComponents();
        choixRevocable.addItem("true");
        choixRevocable.addItem("false");
        choixMultiple.addItem("true");
        choixMultiple.addItem("false");
        choixMontant.addItem("montante");
        choixMontant.addItem("descendante");
    }

    private void button1MouseClicked(MouseEvent e) {
        ajout.setVisible(true);
    }

    /**
     * Lorsque l'on clique sur le bouton valider, on va créer un objet TypeEnchere qu'il faudra rentrer dans la BD après
     *
     */
    private void button4MouseClicked(MouseEvent e) {
        boolean montante;
        if (choixMontant.getSelectedItem().equals("montante")) {
            montante = true;
            System.out.println("montante");
        }
        else montante = false;
        int duree;
        if (limite.isSelected()) {
            duree = -1;
        }
        else duree = Integer.parseInt(heure.getText()) + Integer.parseInt(jour.getText())*24;
        // TODO faire en sorte que l'id s'incrémente seul !

        // Renvoie un objet TypeEnchere contenant toutes les caractéristiques du type d'enchère
        boolean revocable = Boolean.valueOf((String) choixRevocable.getSelectedItem()).booleanValue();
        boolean multiple = Boolean.valueOf((String) choixMultiple.getSelectedItem()).booleanValue();

        TypeEnchere typeEnchere = new TypeEnchere(1, montante, revocable, multiple, Integer.parseInt(prix.getText()), limite.isSelected(), duree);

    }

    private void checkBox1MouseClicked(MouseEvent e) {
        if ((!limite.isSelected())) {
            jour.setEditable(true);
            heure.setEditable(true);
        }
        else {
            jour.setEditable(false);
            heure.setEditable(false);
        }
    }

    private void ajoutSalleDeVente(SalleDeVente salle) {

    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Fabrice
        textField1 = new JTextField();
        creerSalle = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        ajout = new JDialog();
        prix = new JTextField();
        button4 = new JButton();
        choixMultiple = new JComboBox();
        choixMontant = new JComboBox();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        choixRevocable = new JComboBox();
        limite = new JCheckBox();
        label5 = new JLabel();
        heure = new JTextField();
        label7 = new JLabel();
        jour = new JTextField();

        //======== this ========
        setBackground(Color.gray);
        setPreferredSize(new Dimension(600, 500));

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


        //---- textField1 ----
        textField1.setHorizontalAlignment(SwingConstants.CENTER);
        textField1.setText("Liste des salles de ventes");
        textField1.setFont(new Font("Noto Sans", Font.PLAIN, 26));
        textField1.setBackground(Color.gray);

        //---- creerSalle ----
        creerSalle.setText("Cr\u00e9er une salle ");
        creerSalle.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });

        //---- button2 ----
        button2.setText("Valider");

        //---- button3 ----
        button3.setText("Annuler");

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(textField1)
                    .addContainerGap())
                .addGroup(layout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(creerSalle, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                    .addGap(77, 77, 77))
                .addGroup(layout.createSequentialGroup()
                    .addGap(233, 233, 233)
                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(236, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(creerSalle, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(button3)
                    .addGap(51, 51, 51))
        );

        //======== ajout ========
        {
            ajout.setBackground(Color.gray);
            ajout.setModal(true);
            ajout.setResizable(false);
            Container ajoutContentPane = ajout.getContentPane();

            //---- button4 ----
            button4.setText("Cr\u00e9er ");
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button4MouseClicked(e);
                }
            });

            //---- label1 ----
            label1.setText("Ench\u00e8res multiple ?");

            //---- label2 ----
            label2.setText("Type d'ench\u00e8res");

            //---- label3 ----
            label3.setText("Prix d\u00e9part");

            //---- label4 ----
            label4.setText("R\u00e9vocables ?");

            //---- limite ----
            limite.setText("Dur\u00e9e illimit\u00e9e");
            limite.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    checkBox1MouseClicked(e);
                }
            });

            //---- label5 ----
            label5.setText("Nb Heures");

            //---- label7 ----
            label7.setText("Nb Jours");

            GroupLayout ajoutContentPaneLayout = new GroupLayout(ajoutContentPane);
            ajoutContentPane.setLayout(ajoutContentPaneLayout);
            ajoutContentPaneLayout.setHorizontalGroup(
                ajoutContentPaneLayout.createParallelGroup()
                    .addGroup(ajoutContentPaneLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(ajoutContentPaneLayout.createParallelGroup()
                            .addGroup(ajoutContentPaneLayout.createSequentialGroup()
                                .addComponent(button4, GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                .addGap(33, 33, 33))
                            .addGroup(ajoutContentPaneLayout.createSequentialGroup()
                                .addGroup(ajoutContentPaneLayout.createParallelGroup()
                                    .addGroup(ajoutContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(label1)
                                        .addComponent(choixMultiple, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(choixRevocable, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ajoutContentPaneLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(label4))
                                    .addGroup(ajoutContentPaneLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(ajoutContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(label7)
                                            .addComponent(label5))
                                        .addGap(18, 18, 18)
                                        .addGroup(ajoutContentPaneLayout.createParallelGroup()
                                            .addComponent(heure, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jour, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(ajoutContentPaneLayout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, ajoutContentPaneLayout.createSequentialGroup()
                                        .addGroup(ajoutContentPaneLayout.createParallelGroup()
                                            .addComponent(choixMontant, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(GroupLayout.Alignment.TRAILING, ajoutContentPaneLayout.createSequentialGroup()
                                                .addComponent(label3)
                                                .addGap(18, 18, 18)
                                                .addComponent(prix, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(limite, GroupLayout.Alignment.TRAILING))
                                        .addGap(33, 33, 33))
                                    .addGroup(GroupLayout.Alignment.TRAILING, ajoutContentPaneLayout.createSequentialGroup()
                                        .addComponent(label2)
                                        .addGap(41, 41, 41))))))
            );
            ajoutContentPaneLayout.setVerticalGroup(
                ajoutContentPaneLayout.createParallelGroup()
                    .addGroup(ajoutContentPaneLayout.createSequentialGroup()
                        .addContainerGap(36, Short.MAX_VALUE)
                        .addGroup(ajoutContentPaneLayout.createParallelGroup()
                            .addGroup(ajoutContentPaneLayout.createSequentialGroup()
                                .addComponent(label1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(choixMultiple, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(ajoutContentPaneLayout.createSequentialGroup()
                                .addComponent(label2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(choixMontant, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label4)
                        .addGap(4, 4, 4)
                        .addGroup(ajoutContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(prix, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3)
                            .addComponent(choixRevocable, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(ajoutContentPaneLayout.createParallelGroup()
                            .addGroup(ajoutContentPaneLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(limite))
                            .addGroup(ajoutContentPaneLayout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ajoutContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label7)
                                    .addComponent(jour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(ajoutContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label5)
                                    .addComponent(heure, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                        .addGap(69, 69, 69)
                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
            );
            ajout.pack();
            ajout.setLocationRelativeTo(ajout.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Fabrice
    private JTextField textField1;
    private JButton creerSalle;
    private JButton button2;
    private JButton button3;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JDialog ajout;
    private JTextField prix;
    private JButton button4;
    private JComboBox choixMultiple;
    private JComboBox choixMontant;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JComboBox choixRevocable;
    private JCheckBox limite;
    private JLabel label5;
    private JTextField heure;
    private JLabel label7;
    private JTextField jour;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
