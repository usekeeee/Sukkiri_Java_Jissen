package Chap17;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("初めてのSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        frame.setLayout(new BorderLayout());

        JLabel label = new JLabel("Hello world");
        frame.add(label,BorderLayout.CENTER);
        JButton buttonN =new JButton("上ボタン");
        buttonN.addActionListener(new Listener());
        frame.add(buttonN,BorderLayout.NORTH);
        JButton buttonS = new JButton("下ボタン");
        frame.add(buttonS,BorderLayout.SOUTH);
        JButton buttonE = new JButton("右ボタン");
        frame.add(buttonE,BorderLayout.EAST);

        frame.setVisible(true);
        System.out.println("フレームを表示");
    }
}
