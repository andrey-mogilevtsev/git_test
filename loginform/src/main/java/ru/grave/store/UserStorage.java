package ru.grave.store;

import ru.grave.form.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Lenovo on 7/19/2016.
 */
public class UserStorage {

    public static User findByName(String name){
        Connection connection = ConnectionPool.getConnention();
        User user = null;
        try{
            PreparedStatement ps = connection.prepareStatement("Select * from users where login=?");
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if(rs!=null) user = RStoUser(rs);

        }catch (SQLException e){
            e.printStackTrace();
        }
        return user;


    }

    public static User RStoUser(ResultSet rs){
        User user = null;
        try {
            while (rs.next()) {
                user = new User(rs.getString("login"), rs.getString("password"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return user;
    }

    public static void UserToDB (String login, String password, String language, String firstname, String secondname){
        Connection connection = ConnectionPool.getConnention();
        try{
            PreparedStatement ps = connection.prepareStatement("Insert INTO users(login, password, language, firstname, secondname) values(?,?,?,?,?)");
            ps.setString(1,login);
            ps.setString(2,password);
            ps.setString(3,language);
            ps.setString(4, firstname);
            ps.setString(5, secondname);
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
