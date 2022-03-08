package aplicacao;

import java.util.Date;
import classes.modelos.Cliente;
import classes.dao.ClienteDAO;

public class Main {
    
    public static void main(String[] args) throws Exception {
    
        Cliente cliente = new Cliente(3, 2, 3, "bruno", "bruninhoferamentas11@hotmail.com", new Date());
        ClienteDAO clienteDao = new ClienteDAO();
        
        clienteDao.create(cliente);
        
        for(Cliente c : clienteDao.read()) {
			System.out.println("Contato: "+c.getId()+c.getNome()+c.getEmail()+c.getCpf()+c.getTelefone()+c.getDataDeNascimento());
			
		}
        
        System.out.println("Fim de processamento");
    }
}