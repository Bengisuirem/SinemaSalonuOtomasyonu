package Otomasyon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class baglanti
{

	static Connection myConn;
	static Statement myStat;
	
	public static void ekle(String sql)
	{
		 try {
			myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/uyeler?serverTimezone=UTC","root","");
			myStat = (Statement) ((java.sql.Connection) myConn).createStatement();
			myStat.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public static ResultSet sorgula(String sql)
	{
		ResultSet myRs = null ; 
			
		try 
		{
			myRs = myStat.executeQuery(sql);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	return myRs;
	}
	
	public static ResultSet yap()
	{
		ResultSet myRs = null ; 
			
		try 
		{
			myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/uyeler?serverTimezone=UTC","root","");
			myStat = (Statement) ((java.sql.Connection) myConn).createStatement();
			myRs = myStat.executeQuery("select * from uye_bilgi");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	return myRs;
	}
	
	public static void degistir(String sql)
	{
		try {
			myStat.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void sil(String sql)
	{
		try {
			myStat.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
