package com.bloodBank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bloodBank.model.search;
import com.bloodBank.model.srch;


public class searchDao {
	
	private String fname;
	private String lname;
	private String myAddress;
	private String phone;
	private String myBloodGroup;
	private String donate;

	public List getSearchResult(String bloodGroup, String address) {
		
		//Create a list to add database table of type srch inside com.bloodBank.model package
		List<srch> mylist= new ArrayList<>();
		
		//Database Connection
		String url = "jdbc:mysql://localhost:3306/bloodBank";
        String username = "root";
        String mypassword = "root";
       int index=0;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, mypassword);
            String query ="SELECT * FROM tbl_registration WHERE bloodGroup = '"+bloodGroup+"' OR address='"+address+"'";
            Statement st = connection.createStatement();
            ResultSet rs=st.executeQuery(query);
            while ( rs.next() ) {
            	
            	//srch is a class that defines all setters and getters method for fname,lname....etc
            	srch so= new srch();
            	
                fname=rs.getString("fname");
                lname=rs.getString("lname");
                myAddress=rs.getString("address");
                phone=rs.getString("phone");
                myBloodGroup=rs.getString("bloodGroup");
                donate=rs.getString("donate");
               
               //use so (object of srch) to dynamically set all the records of mysql database 
                //later on we can access these on our jsp page
                so.setFname(fname);
                so.setLname(lname);
                so.setAddress(myAddress);
                so.setPhone(phone);
                so.setBloodGroup(myBloodGroup);
                so.setDonate(donate);
                
                //add so object on  the list (list is of type srch)
                mylist.add(so);
                index++;
            }
            
            connection.close();
               
            	}
            	    
		catch(Exception err){
			
			System.out.println(err);
		}
		
		return mylist;
	}
}
