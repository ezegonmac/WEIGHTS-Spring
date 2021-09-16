package es.ezegonmac.Hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {
	
	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3307/weights2?useSSL=false";
		
		String user = "root";
		String passwd = "";
		
		try {
			
			System.out.println("Intentando conectar con la DDBB: " + jdbcUrl);
			
			Connection connection = DriverManager.getConnection(jdbcUrl, user, passwd);
			
			System.out.println("* Conexión Exitosa *");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
