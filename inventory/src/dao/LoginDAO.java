package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connectionManager.ConnectionManager;
import model.Login;

public class LoginDAO {
	
   public boolean validate(Login login) throws ClassNotFoundException, SQLException 
   {
	   String username = login.getUsername();
	   String passsword = login.getPasssword();
	   
	   ConnectionManager conn=new ConnectionManager();
	   Connection con=conn.establishConnection();
	   
	   Statement st=con.createStatement();
	   ResultSet rs=st.executeQuery("SELECT * FROM LOGIN");
	   
	while(rs.next())
		
	{
		if(username.equals(rs.getString("Username")) && passsword.equals(rs.getString("passsword")))
		{
			conn.closeConnection();
			return true;
		}
	}
	conn.closeConnection();
	return false;
   }
}
