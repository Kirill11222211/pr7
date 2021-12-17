package pr7;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel primary = new JPanel();
        primary.setBackground(Color.GREEN);
        primary.setPreferredSize(new Dimension(250,75));
        JLabel label1 = new JLabel("Kizaru and Big Baby Tape");

        primary.add(label1);

        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
    }
}
import java.awt.Color;
        import java.awt.Graphics;
        import java.awt.Image;

        import javax.swing.ImageIcon;
        import javax.swing.JFrame;
        import javax.swing.JPanel;

public class Main extends JPanel{

    Image img = new ImageIcon("/images/tape.png").getImage();

    public static void main(String[] args){
        JFrame fr = new JFrame();
//устанавливаем абсолюбтное позиционирование на фрейме
        fr.setLayout(null);
        fr.setSize(500,500);

        Main m = new Main();
//устанавливаем размеры и координаты компонента для размещения в родителя с абсолютным позиционированием
        m.setBounds(0,0,500,500);
        fr.add(m);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, null);
    }
}
import java.awt.Color;
        import java.awt.Graphics;
        import java.awt.Image;

        import javax.swing.ImageIcon;
        import javax.swing.JFrame;
        import javax.swing.JPanel;

public class Main extends JPanel{

    Image img = new ImageIcon("/images/tape.png").getImage();

    public static void main(String[] args){
        JFrame fr = new JFrame();
//устанавливаем абсолюбтное позиционирование на фрейме
        fr.setLayout(null);
        fr.setSize(500,500);

        Main m = new Main();
//устанавливаем размеры и координаты компонента для размещения в родителя с абсолютным позиционированием
        m.setBounds(0,0,500,500);
        fr.add(m);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, null);
    }
}
