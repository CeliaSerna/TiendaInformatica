package com.cursoceat.controller;
import java.sql.*;
public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con;
		String url="jdbc:mysql://localhost:3306/tienda";
		String user="root";
		String password="";
		Statement sentencia;
		String sql;
		ResultSet rs;
		try {
			con=DriverManager.getConnection(url, user,password);
			
			sentencia= con.createStatement();
			
			//sql= "INSERT INTO fabricantes(nombreF) VALUES ('LG');";
			//sentencia.executeUpdate(sql);
			
			//="UPDATE articulos SET codArticulo=10 WHERE codArticulo=6;";
			
			//sql="DELETE FROM articulos WHERE codArticulo=1;";
			//sentencia.executeUpdate(sql);
			
			sql="SELECT * FROM  articulos;";
			rs= sentencia.executeQuery(sql);
			System.out.println("Artículos de la tabla ");
			while(rs.next()) {
				System.out.println(rs.getInt("codArticulo")+" - "+ rs.getString("nombreArticulo")+ " "+
				+ rs.getDouble("precio") );
			}
			
			System.out.println("Conexión exitosa");
			con.close();
			
			
		}catch (SQLException e) {
			System.out.println("Error al conectar la base de datos");
		}
		
		
	}

}
