import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "1293";

        try(
            Connection con = DriverManager.getConnection(url,user,password);
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("SELECT * FROM students")){;

            while (rs.next()){
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("age"));   
            };
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
