package br.ucsal.blog.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoDeDados {
	public static void main(String[] args) {
		
		String url = "jdbc:hsqldb:file:mymemdb";
		String user = "sa";
		String password = "";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		try {
			Statement statement = connection.createStatement();
			String sql = "CREATE TABLE ALUNOS (ID INT PRIMARY KEY, MATRICULA CHAR(20), NOME VARCHAR(250))";
			statement.execute(sql);
			System.out.println("Criou a tabela");
			
			
			Statement insert = connection.createStatement();
			String sqlDoInsert = "INSERT INTO ALUNOS (ID, MATRICULA, NOME) VALUES (1,'202012301','PEDRO LUCAS')";
			insert.execute(sqlDoInsert);
			sqlDoInsert = "INSERT INTO ALUNOS (ID, MATRICULA, NOME) VALUES (2,'202012302','JOSE AUGUSTO')";
			insert.execute(sqlDoInsert);
			System.out.println("Inseriu na tabela");
			
			
			Statement select = connection.createStatement();
			String sqlDoSelect = "SELECT * FROM ALUNOS";
			ResultSet resultSet = select.executeQuery(sqlDoSelect);
			//System.out.println(resultSet.getString(3));
			while(resultSet.next()) {
				System.out.println(resultSet.getString(3));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}