/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasiswing2;

/**
 *
 * @author ACER
 */
import javax.swing.*;
public class Aplikasiswing2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("title");
                JPanel p = new JPanel();
                JButton b = new JButton("press me");
                
                f.setSize(400, 400);
                
                p.add(b);
                f.setContentPane(p);
                
                f.show();
    }
}
