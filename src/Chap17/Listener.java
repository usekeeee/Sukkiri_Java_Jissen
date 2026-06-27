package Chap17;
import java.awt.*;
import java.awt.event.*;

public class Listener implements ActionListener{
   @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("押されました!");
    }
}
