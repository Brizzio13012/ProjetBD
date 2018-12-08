/*
 * Created by JFormDesigner on Fri Dec 07 18:49:02 CET 2018
 */

package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Fabrice
 */
public class AdminPage extends JPanel {
    public AdminPage() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Fabrice
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        textField1 = new JTextField();

        //======== this ========
        setBackground(Color.gray);
        setPreferredSize(new Dimension(1000, 650));

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(list1);
        }

        //---- textField1 ----
        textField1.setHorizontalAlignment(SwingConstants.CENTER);
        textField1.setText("Liste des salles de ventes");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup()
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                        .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE))
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 372, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(201, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Fabrice
    private JScrollPane scrollPane1;
    private JList list1;
    private JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
