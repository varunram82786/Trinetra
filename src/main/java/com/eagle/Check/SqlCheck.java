/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eagle.Check;

/**
 *
 * @author varun
 */
import java.sql.*;
import java.util.ArrayList;




public class SqlCheck {
        public static void main(String [] args)throws Exception
    {
    SqlCheck s=new SqlCheck();
           
            System.out.println(s.Check1());
    }
     public  ArrayList Check1() throws ClassNotFoundException, SQLException 
        {
        String url="jdbc:mysql://localhost:3306/Trinetra";
                
        String uname="root";
        String pass="Varun@1234";
        String que="select url from varun";

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection con = DriverManager.getConnection(url,uname,pass); Statement st = con.createStatement()) {
            
            ResultSet rs=st.executeQuery(que);
            ArrayList <String> list=new ArrayList<>();
            
            while(rs.next())
            {
                list.add(rs.getString(1));
            
                     //   System.out.println(list);
            }
            
            return list;
            
            
            
        }
    
}
}
