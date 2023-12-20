package grouppackage;

import java.sql.*;
import java.util.ArrayList;
 
public class GroupDB {
 
    private static String url = "jdbc:mysql://localhost:3306/CRM?serverTimezone=Europe/Moscow&useSSL=false";
    private static String username = "root";
    private static String password = "neilyanoilyA_1";
    public static ArrayList<GroupObject> select() {
         
        ArrayList<GroupObject> groups = new ArrayList<GroupObject>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                  
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM stgroup");
                while(resultSet.next()){
                      
                    int id = resultSet.getInt(1);
                    String schedule = resultSet.getString(2);
                    String subject = resultSet.getString(3);
                    GroupObject group = new GroupObject(id, schedule, subject);
                    groups.add(group);
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return groups;
    }
    
    public static GroupObject selectOne(int id) {
         
        GroupObject group = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                  
                String sql = "SELECT * FROM stgroup WHERE id=?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setInt(1, id);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if(resultSet.next()){
 
                        int groupId = resultSet.getInt(1);
                        String schedule = resultSet.getString(2);
                        String subject = resultSet.getString(3);
                        group = new GroupObject(groupId, schedule, subject);
                    }
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return group;
    }

    public static int insert(GroupObject group) {
         
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                  
                String sql = "INSERT INTO stgroup (schedule, subject) Values (?, ?)";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setString(1, group.getSchedule());
                    preparedStatement.setString(2, group.getSubject());
                      
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
                  
                String sql = "DELETE FROM stgroup WHERE id = ?";
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