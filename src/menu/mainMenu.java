/*
 * Created by JFormDesigner on Fri Nov 08 10:39:17 EET 2024
 */

package menu;

import roulete.kazino;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
//import net.miginfocom.swing.*;

/**
 * @author martbul
 */
public class mainMenu extends JFrame {
    //private MenuListener listener;
    public mainMenu() {
        initComponents();
        JFrame frame = new JFrame("Pichaga");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(this.panel1);
        frame.setVisible(true);


        this.button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new kazino(); //
            }
        });
    }
//    public void setMenuListener(MenuListener listener) {
//        this.listener = listener;
//    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - martin kov
        panel1 = new JPanel();
        button1 = new JButton();

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder(
            0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder
            . BOTTOM, new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ), java. awt. Color.
            red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .
            beans .PropertyChangeEvent e) {if ("borde\u0072" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );

            //---- button1 ----
            button1.setText("Roulete");

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(button1)
                        .addContainerGap(91, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(button1)
                        .addContainerGap(112, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(mainMenu::new);

    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - martin kov
    private JPanel panel1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}


