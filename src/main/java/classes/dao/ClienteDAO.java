package classes.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import classes.modelos.Cliente;
import factory.ConnectionFactory;

public class ClienteDAO {
    
    public void create(Cliente input) {

        String sql = "INSERT INTO clientes(nome, email, cpf, telefone, data_de_nascimento) VALUES (?, ?, ?, ?, ?)";

        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = ConnectionFactory.createConnectionToMySQL();

            pstm = (PreparedStatement) con.prepareStatement(sql);
            pstm.setString(1, input.getNome());
            pstm.setString(2, input.getEmail());
            pstm.setInt(3, input.getCpf());
            pstm.setInt(4, input.getTelefone());
            pstm.setDate(5, new Date(input.getDataDeNascimento().getTime()));
            
            pstm.execute();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } 
            catch (Exception e) {
                e.printStackTrace();
            }   
        }
    } 
    
    public List<Cliente> read(){
    	
    	String sql = "SELECT * FROM clientes";
    	
    	List<Cliente> clientes = new ArrayList<Cliente>();
    	
    	Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try {
        	
			con = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) con.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while (rset.next()) {
				
				Cliente c = new Cliente();
				
				c.setId(rset.getInt("id_usuario"));
				c.setNome(rset.getString("nome"));
				c.setEmail(rset.getString("email"));
				c.setCpf(rset.getInt("cpf"));
				c.setTelefone(rset.getInt("telefone"));
				c.setDataDeNascimento(rset.getDate("data_de_nascimento"));
				clientes.add(c);		
			}
		}
        catch (Exception e) {
				e.printStackTrace();
			}
        finally {
				try {
					if(rset!=null) {
						rset.close();
					}
					if(pstm!=null) {
						pstm.close();
					}
					if(con!=null) {
						con.close();
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		
			return clientes;
	}
    
    public void update(Cliente input){
    	
    	String sql = "UPDATE clientes SET "
    				+ "nome = ?, "
    				+ "email = ?, "
    				+ "cpf = ?, "
    				+ "telefone = ?, "
    				+ "data_de_nascimento = ? "
    				+ "WHERE id_usuario = ?";
    	
    	Connection con = null;
        PreparedStatement pstm = null;
        
        try {
        	con = ConnectionFactory.createConnectionToMySQL();
        	pstm = (PreparedStatement) con.prepareStatement(sql);

        	pstm.setString(1, input.getNome());
            pstm.setString(2, input.getEmail());
            pstm.setInt(3, input.getCpf());
            pstm.setInt(4, input.getTelefone());
            pstm.setDate(5, new Date(input.getDataDeNascimento().getTime()));
            pstm.setInt(6, input.getId());
            
            pstm.execute();
        }
        catch (Exception e) {
        	e.printStackTrace();
        }
        finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } 
            catch (Exception e) {
                e.printStackTrace();
            }   
        }
    }

    public void delete(int idInput){

    	String sql = "DELETE FROM clientes WHERE id_usuario = ?";
    	
    	Connection con = null;
        PreparedStatement pstm = null;
        
        try {
        	
        	con = ConnectionFactory.createConnectionToMySQL();
        	pstm = (PreparedStatement) con.prepareStatement(sql);
        	
        	pstm.setInt(1, idInput);
        	pstm.execute();
        }
        catch (Exception e) {
			e.printStackTrace();
		}
        finally {
			try {
				if(pstm!=null) {
					pstm.close();
				}
				if(con!=null) {
					con.close();
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
    }
}
