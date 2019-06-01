package model;
//Vai ser excluido esse arquivo '-'
import java.util.ArrayList;

public class BaseDados {
	
	private static ArrayList<Cliente> clientes = new ArrayList<>();
	private static ArrayList<Festa> festas     = new ArrayList<>();
	private static ArrayList<Usuario> usuarios = new ArrayList<>();
	private static ArrayList<Tema> temas       = new ArrayList<>();
	
	Usuario admin = new Usuario("admin", "admin");
	
	public BaseDados() {
		cadastrarUsuario(admin);
	}
	
	public void cadastrarClientes(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void cadastrarFesta(Festa festa) {
		festas.add(festa);	
	}
	
	public void cadastrarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public void cadastrarTema(Tema tema) {
		temas.add(tema);
	}
	
	public static boolean isUsuario(Usuario usuario) {
		return usuarios.contains(buscarUsuario(usuario));
	}
	
	public static Usuario buscarUsuario(Usuario usuario) {
		
		for (Usuario user : usuarios) {
			if (user.getNome().equalsIgnoreCase(usuario.getNome()) && user.getSenha().equals(usuario.getSenha()))
				return user;
		}
		
		return null;
	}
	
}
