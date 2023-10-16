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
        PedidoDAO pedidoDAO = new PedidoDAO(connection);

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Escolha uma opção de 1 a 6:\n" +
                    "1 - Criar usuário\n" +
                    "2 - Consultar usuários\n" +
                    "3 - Atualizar usuário\n" +
                    "4 - Deletar usuário\n" +
                    "5 - Pedidos\n" +
                    "6 - Sair");

            option = scanner.nextInt();

            switch (option) {
                case 1: // Criar usuário
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

                case 2: // Consultar usuários
                    usuarioDAO.readAllUsers();
                    break;

                case 3: // Atualizar usuário
                    Usuario usuarioAtualizado = new Usuario();

                    System.out.println("Digite o ID do usuário a ser atualizado:");
                    usuarioAtualizado.setId_usuario(scanner.nextInt());

                    scanner.nextLine(); 

                    System.out.println("Novo Nome Completo: ");
                    usuarioAtualizado.setNome(scanner.nextLine());
                    System.out.println("Novo CPF: ");
                    usuarioAtualizado.setCpf(scanner.nextLine().trim());
                    System.out.println("Novo Telefone: ");
                    usuarioAtualizado.setTelefone(scanner.nextLine().trim());
                    System.out.println("Novo E-mail: ");
                    usuarioAtualizado.setEmail(scanner.next());

                    usuarioDAO.updateUsuario(usuarioAtualizado);
                    break;

                case 4: // Deletar usuário
                    System.out.println("Digite o ID do usuário a ser deletado:");
                    int id_usuario = scanner.nextInt();
                    usuarioDAO.deleteUsuario(id_usuario);
                    break;

                case 5: // Pedidos
                    int subOption;

                    do {
                        System.out.println("Submenu - Pedidos:\n" +
                                "1 - Criar pedido\n" +
                                "2 - Consultar pedidos\n" +
                                "3 - Atualizar pedido\n" +
                                "4 - Deletar pedido\n" +
                                "5 - Voltar ao menu principal");

                        subOption = scanner.nextInt();

                        switch (subOption) {
                            case 1: // Criar pedido
                                Pedido novoPedido = new Pedido();

                                scanner.nextLine();
                                System.out.println("Status do Pedido: ");
                                novoPedido.setStatus_pedido(scanner.nextLine());

                                System.out.println("Data de Ida no formato (DD/MM/AAAA): ");
                                novoPedido.setData_ida(scanner.nextLine());

                                System.out.println("Data de Volta no formato (DD/MM/AAAA): ");
                                novoPedido.setData_volta(scanner.nextLine());

                                System.out.println("Número de Viajantes: ");
                                novoPedido.setNum_viajantes(scanner.next());

                                pedidoDAO.createPedido(novoPedido);
                                break;

                            case 2: // Consultar pedidos
                                pedidoDAO.readAllPedidos();
                                break;

                            case 3: // Atualizar pedido
                                Pedido pedidoAtualizado = new Pedido();

                                System.out.println("Digite o ID do pedido a ser atualizado:");
                                pedidoAtualizado.setId_pedido(scanner.nextInt());

                                scanner.nextLine();

                                System.out.println("Novo Status do Pedido: ");
                                pedidoAtualizado.setStatus_pedido(scanner.nextLine());

                                System.out.println("Nova Data de Ida no formato (DD/MM/AAAA): ");
                                pedidoAtualizado.setData_ida(scanner.nextLine());

                                System.out.println("Nova Data de Volta no formato (DD/MM/AAAA): ");
                                pedidoAtualizado.setData_volta(scanner.nextLine());

                                System.out.println("Novo Número de Viajantes: ");
                                pedidoAtualizado.setNum_viajantes(scanner.next());

                                pedidoDAO.updatePedido(pedidoAtualizado);
                                break;

                            case 4: // Deletar pedido
                                System.out.println("Digite o ID do pedido a ser deletado:");
                                int id_pedido = scanner.nextInt();
                                pedidoDAO.deletePedido(id_pedido);
                                break;
                        }
                    } while (subOption != 5);
                    break;

                case 6: // Sair
                    System.out.println("Saindo do programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (option != 6);
    }


		
		
		// ABAIXO SÃO OS TESTES REALIZADOS PARA O CRUD DAS TABELAS
		
		//CREATE PEDIDO
//		var connection = DatabaseConnection.createConnection();		
//		PedidoDAO pedidoDAO = new PedidoDAO(connection);
//		
//		Pedido pedido = new Pedido();
//		pedido.setStatus_pedido("Aguardando Pagamento");
//		pedido.setData_ida("01/01/2024");
//		pedido.setData_volta("22/01/2024");
//		pedido.setNum_viajantes("2");
//		
//		pedidoDAO.createPedido(pedido);		
		
			
		
		// READ PEDIDO
//		pedidoDAO.readAllPedidos();
		
		
		//UPDATE PEDIDO
//		Pedido pedido = new Pedido("Aguardando Pagamento" , "10/10/2023", "25/01/2023", "1");
//		pedido.setId_pedido(3);
//		
//		pedidoDAO.updatePedido(pedido);
		
		
		
		//DELETE PEDIDO
		
//		pedidoDAO.deletePedido(6);
		
		
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
//		Read USUARIO		
//		usuarioDAO.readAllUsers();
		
		
				
//		UPDATE USUARIO
//		Usuario usuario = new Usuario("11111111" , "77777777", "2222222", "Bob Esponja");
//		usuario.setId_usuario(2);
//		
//		usuarioDAO.updateUsuario(usuario);
//		
//		DELETE USUARIO
//		
//		usuarioDAO.deleteUsuario(2);
//		

	
	}
//

