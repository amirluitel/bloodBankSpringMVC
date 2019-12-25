package com.bloodBank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class registrationDao {
	
	
	public int addDetailsToDatabse(String fname, String lname,String email,String password,String address,String phone,String bloodGroup,String donate) {
		
		//Database Connection
		String url = "jdbc:mysql://localhost:3306/bloodBank";
        String username = "root";
        String mypassword = "root";
        int i=0;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, mypassword);
            String query = "INSERT INTO tbl_registration " + "VALUES ('"+fname+"','"+lname+"','"+email+"','"+password+"','"+address+"','"+phone+"','"+bloodGroup+"','"+donate+"')";
            Statement st = connection.createStatement();
            i=st.executeUpdate(query);
            connection.close();
               
            	}
            	    
		catch(Exception err){
			
			System.out.println(err);
			
		}
	return i;
	}

}
