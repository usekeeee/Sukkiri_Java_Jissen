package Chap9;
import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("ドライバのロードに失敗しました");
        }

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "mysecretpassword"
            );
            System.out.println("ポスグレに無事つながりました！");

            pstmt = con.prepareStatement("INSERT INTO users (name,email)VALUES(?,?)");

            pstmt.setString(1,"Java次郎");
            pstmt.setString(2,"jiro@example.com");

            int r = pstmt.executeUpdate();
            if(r > 0){
                System.out.println(r + "件のユーザーを追加しました！");
            }else{
                System.out.println("追加されませんでした。");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}