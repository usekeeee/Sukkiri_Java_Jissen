package Chap8_quiz;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Smtp_quiz {
    public static void main(String[] args) throws Exception {

        Socket sock = new Socket("smtp.example.com", 60025);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));

        bw.write("HELO smtp.example.com\r\n");
        bw.write("MAIL FROM: asaka@example.com\r\n");
        bw.write("RCPT TO: minato@example.com\r\n");
        bw.write("DATA\r\n");

        bw.write("From: asaka@example.com\r\n");
        bw.write("Subject: Please send me your RPG\r\n");
        bw.write("\r\n");

        bw.write("Hello minato. I would like to play your RPG\r\n");
        bw.write("Could you please send it to me ?\r\n");
        bw.write(".\r\n");
        bw.write("QUIT\r\n");


        bw.flush();

        bw.close();
        sock.close();
        System.out.println("メールの送信指示が完了したよ！");
    }
}