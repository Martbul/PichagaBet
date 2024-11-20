/*
 * Created by JFormDesigner on Fri Nov 08 10:39:17 EET 2024
 */

package menu;

import roulete.kazino;
import blackjack.blackjackGame;

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
                frame.setVisible(false);

                new kazino();
            }
        });

        this.button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);


                blackjackGame game = new blackjackGame();
                game.setVisible(true);
            }
        });
    }
//    public void setMenuListener(MenuListener listener) {
//        this.listener = listener;
//    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Ivaylo Yordanov (ivayloay)
        panel1 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();

        //======== panel1 ========
        {

            //---- button1 ----
            button1.setText("Roulete");

            //---- button2 ----
            button2.setText("Blackjack");

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(button1)
                            .addComponent(button2))
                        .addContainerGap(89, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(button1)
                        .addGap(54, 54, 54)
                        .addComponent(button2)
                        .addContainerGap(24, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(mainMenu::new);

    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Ivaylo Yordanov (ivayloay)
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}


