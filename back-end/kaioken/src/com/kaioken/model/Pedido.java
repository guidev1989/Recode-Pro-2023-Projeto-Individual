package com.kaioken.model;

public class Pedido {
	
	private int id_pedido;
	
	private String status_pedido;
	
	private String data_ida ;
	
	private String data_volta;
	
	private String num_viajantes;
	
	public Pedido(String status_pedido, String data_ida, String data_volta, String num_viajantes) {
		super();
		this.status_pedido = status_pedido;
		this.data_ida = data_ida;
		this.data_volta = data_volta;
		this.num_viajantes = num_viajantes;
	}
	
	@Override
	public String toString() {
		return "Pedido [id_pedido=" + id_pedido + ", status_pedido =" + status_pedido + ", data_ida =" + data_ida + ", data_volta=" + data_volta
				+ ", num_viajantes=" + num_viajantes + "]";
	}


	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}

	public String getStatus_pedido() {
		return status_pedido;
	}

	public void setStatus_pedido(String status_pedido) {
		this.status_pedido = status_pedido;
	}

	public String getData_ida() {
		return data_ida;
	}

	public void setData_ida(String data_ida) {
		this.data_ida = data_ida;
	}

	public String getData_volta() {
		return data_volta;
	}

	public void setData_volta(String data_volta) {
		this.data_volta = data_volta;
	}

	public String getNum_viajantes() {
		return num_viajantes;
	}

	public void setNum_viajantes(String num_viajantes) {
		this.num_viajantes = num_viajantes;
	}
	
	

}
