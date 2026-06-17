package Chap9_quiz;
import java.util.ArrayList;
import java.sql.*;

public class ItemsDAO {
    public static ArrayList<Item> findByMinimumPrice(int minprice){
        ArrayList<Item> items = new ArrayList<>();

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs =null;

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "mysecretpassword");

            pstmt = con.prepareStatement("SELECT * FROM ITEMS WHERE PRICE >= ?");
            pstmt.setInt(1, minprice);

            rs = pstmt.executeQuery();
            ;
            while (rs.next()) {
                String name = rs.getString("name");
                int price = rs.getInt("price");
                int weight = rs.getInt("weight");

                Item item = new Item();
                item.setName(name);
                item.setPrice(price);
                item.setWeight(weight);

                items.add(item);
            }
            }catch (Exception e){
                e.printStackTrace();
            }finally{
                if(rs != null){
                    try{rs.close();}catch(SQLException e){e.printStackTrace();}
                }
                if(pstmt != null){
                    try{pstmt.close();}catch(SQLException e){e.printStackTrace();}
                }
                if(con != null){
                    try{con.close();}catch (SQLException e){e.printStackTrace();}
                }
            }
            return items;
    }
}
