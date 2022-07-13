/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.poo.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public Connection pegaConexao() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");		
		return DriverManager.getConnection("JDBC:mysql://localhost/poo", "root", "1401");
	}

}