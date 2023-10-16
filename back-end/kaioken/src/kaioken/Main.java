package kaioken;


import java.util.Scanner;

import com.kaioken.dao.PedidoDAO;
import com.kaioken.dao.UsuarioDAO;
import com.kaioken.database.DatabaseConnection;
import com.kaioken.model.Pedido;
import com.kaioken.model.Usuario;

public class Main {

	public static void main(String[] args) {
		
			
		
		var connection = DatabaseConnection.createConnection();		
		UsuarioDAO usuarioDAO = new UsuarioDAO(connection);
		
		
		Scanner scanner = new Scanner(System.in);
		
		var option = 0;
		
		do {
		System.out.println("Escolha uma opcao de 1 - 5\n" 
		+ "1 - Create\n"
		+ "2 - Read\n"	
		+ "3 - Update\n"
		+ "4 - Delete\n"
		+ "5 - Sair\n");
		
		option = scanner.nextInt();
		
		
		
		switch (option) {
	case 1:
			Usuario usuario = new Usuario();
			
			scanner.nextLine();						
			System.out.println("Nome Completo: ");
			usuario.setNome(scanner.nextLine());
			System.out.println("CPF: ");
			usuario.setCpf(scanner.nextLine().trim());
			System.out.println("Telefone: ");
			usuario.setTelefone(scanner.nextLine().trim());
			System.out.println("E-mail: ");
			usuario.setEmail(scanner.next());
			
			usuarioDAO.createUsuario(usuario);
			
			break;
			
		case 2:
			usuarioDAO.readAllUsers();
			break;
		
		case 3 :			
			Usuario usuarioAtualizado = new Usuario();
			System.out.println("Digite o ID do usuario a ser atualizado");
			usuarioAtualizado.setId_usuario(scanner.nextInt());
			scanner.nextLine();						
			System.out.println("Nome Completo: ");
			usuarioAtualizado.setNome(scanner.nextLine());
			System.out.println("CPF: ");
			usuarioAtualizado.setCpf(scanner.nextLine().trim());
			System.out.println("Telefone: ");
			usuarioAtualizado.setTelefone(scanner.nextLine().trim());
			System.out.println("E-mail: ");
			usuarioAtualizado.setEmail(scanner.next());
			
			usuarioDAO.updateUsuario(usuarioAtualizado);
			
			break;
		case 4:
			System.out.println("Digite o ID do usuario a ser *** DELETADO ***");			
			int id_usuario = scanner.nextInt();
			usuarioDAO.deleteUsuario(id_usuario);		
		default:
		break;
		}
		
		
		}while (option != 5);
		
		
		
		
		
		// ABAIXO SÃO OS TESTES REALIZADOS PARA O CRUD DAS TABELAS
		
		//CREATE PEDIDO
//		Pedido pedido = new Pedido();
//		pedido.setStatus_pedido("Pago");
//		pedido.setData_ida("15/12/2023");
//		pedido.setData_volta("22/01/2024");
//		pedido.setNum_viajantes("4");
//		
//		pedidoDAO.createPedido(pedido);		
		
			
		
		 //CREATE USUARIO
//		Usuario usuario = new Usuario();		
//		usuario.setTelefone("21987101010");
//		usuario.setCpf("12346578911");
//		usuario.setEmail("vegeta@email.com");
//		usuario.setNome("VEGETA");
//		
//		usuarioDAO.createUsuario(usuario);
//		
//		
		//Read USUARIO		
//		usuarioDAO.readAllUsers();
		
		
//				
//		//UPDATE USUARIO
//		//Usuario usuario = new Usuario("11111111" , "77777777", "2222222", "Bob Esponja");
//		//usuario.setId_usuario(2);
//		
//		//usuarioDAO.updateUsuario(usuario);
//		
//		//DELETE USUARIO
//		
//		//usuarioDAO.deleteUsuario(2);
//		

	
	}
//
}
