package Chap17_quiz;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("ログイン画面");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        JLabel label = new JLabel("ユーザーID");
        JTextField textId = new JTextField(15);

        JLabel labelPass = new JLabel("パスワード");
        JPasswordField textpass = new JPasswordField(15);

        textpass.setEchoChar('★');

        JCheckBox checkBox = new JCheckBox("パスワードを隠さない");

        JButton buttonLog = new JButton("ログイン");
        JButton buttonCle = new JButton("クリア");

        frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));

        JPanel inputPanel = new JPanel(new GridLayout(2,2,5,5));
        inputPanel.add(label);
        inputPanel.add(textId);
        inputPanel.add(labelPass);
        inputPanel.add(textpass);

        frame.add(inputPanel);

       frame.add(checkBox);

       JPanel buttonPanel = new JPanel();
       buttonPanel.add(buttonLog);
       buttonPanel.add(buttonCle);
       frame.add(buttonPanel);

       buttonCle.addActionListener(e ->{
           textId.setText("");
           textpass.setText("");
       });

       checkBox.addActionListener(e ->{
           if(checkBox.isSelected()){
               textpass.setEchoChar((char)0);
           }else{
               textpass.setEchoChar('★');
           }
       });

       buttonLog.addActionListener(e ->{
           String id = textId.getText();
           String pass = textpass.getText();

           if(id.equals("minato")&& pass.equals("yusuke")){
               JOptionPane.showMessageDialog(frame,"ログイン成功！");
           }else{
               JOptionPane.showMessageDialog(frame,"ログイン失敗...");
           }
       });

       frame.setVisible(true);
    }
}
