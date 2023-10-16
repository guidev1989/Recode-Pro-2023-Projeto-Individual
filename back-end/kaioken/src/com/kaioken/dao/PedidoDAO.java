package com.kaioken.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kaioken.model.Pedido;

public class PedidoDAO {

	private static String sql;

	private final Connection connection;

	public PedidoDAO(Connection connection) {
		this.connection = connection;
	}
		
	//CREATE	
	public void createPedido(Pedido pedido) {
		sql = "INSERT INTO pedido (status_pedido, data_ida, data_volta, num_viajantes) VALUES(?,?,?,?)";
		try(PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setString(1, pedido.getStatus_pedido());
			stmt.setString(2, pedido.getData_ida());
			stmt.setString(3, pedido.getData_volta());		
			stmt.setString(4, pedido.getNum_viajantes());			
			stmt.executeUpdate();
			System.out.println("Pedido criado com sucesso!");			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
		
		//READ	
		public void readAllPedidos() {
			sql="SELECT * FROM pedido";
			try(PreparedStatement stmt = connection.prepareStatement(sql)){
				ResultSet r = stmt.executeQuery();
				while(r.next()) {				
					Pedido pedido = new Pedido();
					//pedido.setId_pedido(r.getInt("id_pedido"));
					pedido.setStatus_pedido(r.getString("status_pedido"));	
					
					pedido.setData_ida(r.getString("data_ida"));
					
					pedido.setData_volta(r.getString("data_volta"));									
					
					pedido.setNum_viajantes(r.getString("num_viajantes"));					
					
					System.out.printf("Status: %s\n Data Ida: %s\n Data Volta: %s\n Quantidade de Viajantes: %s\n",
							pedido.getStatus_pedido(), pedido.getData_ida(), pedido.getData_volta(), pedido.getNum_viajantes());
					
				}
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
	
		
		}
}

