/*
 * Created by JFormDesigner on Sun Dec 09 16:08:42 CET 2018
 */

package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Fabrice
 */
public class MenuSalle extends JPanel {
    public MenuSalle() {
        initComponents();
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
        textField1 = new JLabel();
        button2 = new JButton();
        annuler = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        numero = new JTextField();
        label6 = new JLabel();

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

        //---- button2 ----
        button2.setText("Valider");

        //---- annuler ----
        annuler.setText("Annuler");
        annuler.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                annulerMouseClicked(e);
            }
        });

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }

        //---- label6 ----
        label6.setText("Num\u00e9ro Salle");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(textField1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(label6)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(numero, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                            .addComponent(annuler, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                        .addComponent(numero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label6)
                        .addComponent(annuler))
                    .addContainerGap(84, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Fabrice
    private JLabel textField1;
    private JButton button2;
    private JButton annuler;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JTextField numero;
    private JLabel label6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
