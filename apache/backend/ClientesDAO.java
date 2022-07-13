/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.poo.backend;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientesDAO {

	private Connection conexao;

	public ClientesDAO() throws SQLException, ClassNotFoundException {
		conexao = new Conexao().pegaConexao();
	}	

	public void insere(Clientes cliente) throws SQLException {
		String sql = "insert into Clientes(nome, endereco, cpf, celular, Email) values(?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, cliente.getNome());
		stmt.setString(2, cliente.getEndereco());
		stmt.setString(3, cliente.getCpf());
		stmt.setString(4, cliente.getCelular());
		stmt.setString(5, cliente.getEmail());
		stmt.execute();
	}
	public void altera(Clientes cliente) throws SQLException {
		String sql = "update clientes set " + 
					 "nome = ?," +
					 "endereco = ?," + 
					 "cpf = ?," + 
					 "celular = ?," + 
					 "email = ?" +
					 " where id = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1,cliente.getNome());
		stmt.setString(2,cliente.getEndereco());
		stmt.setString(3,cliente.getCpf());
		stmt.setString(4,cliente.getCelular());
		stmt.setString(5,cliente.getEmail());
		stmt.setLong(6,cliente.getId());
		stmt.execute();
	}
	public void delete(long ID) throws SQLException {
		String sql = "delete from clientes where Id = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setLong(1,ID);
		
		stmt.execute();
	}

    public void delete(String Id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void altera(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
	