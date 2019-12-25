package com.bloodBank.dao;

import java.sql.*;

public class loginDao {
	//get username and password from database and assigned to variables here and jobs done
	public String Myemail;
	public String password;
	public int getUserDetails(String myEmail) {
		
		//Database Connection
				String url = "jdbc:mysql://localhost:3306/bloodBank";
		        String username = "root";
		        String mypassword = "root";
		        int i=0;
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
		            Connection connection = DriverManager.getConnection(url, username, mypassword);
		            String query ="SELECT email, password FROM tbl_registration WHERE email = '"+myEmail+"'";
		            Statement st = connection.createStatement();
		            ResultSet rs=st.executeQuery(query);
		            while ( rs.next() ) {
		            	i++;
		                 Myemail = rs.getString("email");
		                 password=rs.getString("password");
		                
		            }
		            
		            connection.close();
		               
		            	}
		            	    
				catch(Exception err){
					
					System.out.println(err);
				}
				return i;
	}
}
