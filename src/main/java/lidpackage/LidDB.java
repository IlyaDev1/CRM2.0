package lidpackage;


import java.sql.*;
import java.util.ArrayList;
 
public class LidDB {
 
    private static String url = "jdbc:mysql://localhost:3306/CRM?serverTimezone=Europe/Moscow&useSSL=false";
    private static String username = "root";
    private static String password = "neilyanoilyA_1";
    public static ArrayList<LidObject> select() {
         
        ArrayList<LidObject> lids = new ArrayList<LidObject>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                  
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM lid");
                while(resultSet.next()){
                      
                    int id = resultSet.getInt(1);
                    String name = resultSet.getString(2);
                    int old = resultSet.getInt(3);
                    String subject = resultSet.getString(4);
 
                    LidObject lid = new LidObject(id, name, old, subject);
                    lids.add(lid);
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return lids;
    }
    
    public static LidObject selectOne(int id) {
         
        LidObject lid = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                  
                String sql = "SELECT * FROM lid WHERE id=?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setInt(1, id);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if(resultSet.next()){
 
                        int lidId = resultSet.getInt(1);
                        String name = resultSet.getString(2);
                        int old = resultSet.getInt(3);
                        String subject = resultSet.getString(4);
                        lid = new LidObject(lidId, name, old, subject);
                    }
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return lid;
    }

    public static int insert(LidObject lid) {
         
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                  
                String sql = "INSERT INTO lid (name, old, subject) Values (?, ?, ?)";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setString(1, lid.getName());
                    preparedStatement.setInt(2, lid.getOld());
                    preparedStatement.setString(3, lid.getSubject());
                      
                    return  preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return 0;
    }
     
    public static int delete(int id) {
         
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                  
                String sql = "DELETE FROM lid WHERE id = ?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setInt(1, id);
                      
                    return  preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return 0;
    }
}