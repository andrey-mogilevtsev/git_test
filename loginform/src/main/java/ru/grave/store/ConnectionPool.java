package ru.grave.store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool {

    public static Connection conn_instance;

    public ConnectionPool(){

    }

    public static Connection getConnention(){
        if(conn_instance==null){
           // ConnectionPool temp = new ConnectionPool();
            try {
                Class.forName("org.postgresql.Driver");
                try{
                    conn_instance = DriverManager.getConnection("jdbc:postgresql://localhost:5432/loginapp_users","postgres", "postgres");
                }catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }
        }
        return conn_instance;
    }

}