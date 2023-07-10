package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connectionManager.ConnectionManager;
import model.Product;

public class ProductDAO {


	public void addProduct(Product product) throws ClassNotFoundException, SQLException
	{
		int id=product.getProductID();
		String name=product.getProductName();
		int minsell=product.getMinsell();
		int price=product.getPrice();
		int quantity=product.getQuantity();
		ConnectionManager conn=new ConnectionManager();
		Connection con=conn.establishConnection();
		String query="insert into"+"PRODUCT(PRODUCTID,PRODUCTNAME,MINSELL,PRICE,QUANTITY)"+"values(?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1,id);
	    ps.setString(2,name);
	    ps.setInt(3,minsell);
	    ps.setInt(4,price);
	    ps.setInt(5,quantity);
	    ps.executeUpdate();
	    conn.closeConnection();
	    }
	     public void display() throws SQLException, ClassNotFoundException
	     {
	    	 ConnectionManager conn=new ConnectionManager();
	    	 Connection con=conn.establishConnection();
	    	 
	    	 Statement st=con.createStatement();
	    	 ResultSet rs=st.executeQuery("SELECT*FROM PRODUCT");
	    	 while(rs.next())
	    	 {
				 System.out.println("------------------------------------------");
				 System.out.println(rs.getString("PRODUCTNAME")+" | "+rs.getInt("PRODUCTID")+" | "+rs.getInt("MINSELL")+" | "+rs.getInt("PRICE")+
						 " | "+rs.getInt("QUANTITY"));
				 
				 System.out.println("-------------------------------------------------------------");
	
	    	 }
	     }
}