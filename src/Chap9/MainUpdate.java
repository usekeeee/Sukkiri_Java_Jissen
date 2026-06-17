package Chap9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainUpdate {
    public static void main(String[] args) {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("ドライバのロードに失敗しました");
        }
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "mysecretpassword");
            System.out.println("ポスグレに無事つながりました！");

            pstmt = con.prepareStatement("UPDATE users SET email = ? WHERE id = ?");
            pstmt.setString(1, "java_jiro@ample.com");
            pstmt.setInt(2, 2);

            int r = pstmt.executeUpdate();

            if (r > 0) {
                System.out.println(r + "件のユーザー情報を更新しました！");
            } else {
                System.out.println("更新対象のユーザーが見つかりませんでした。");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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