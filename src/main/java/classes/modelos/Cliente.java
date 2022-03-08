package classes.modelos;

import java.util.Date;

public class Cliente {
	
	/*Atributos*/
	
	private int id;
    private int cpf;
    private int telefone;
	private String nome;
	private String email;
	private Date dataDeNascimento;
	
    /*Métodos Construtores */
	
    public Cliente(int idInput, int cpfInput, int telefoneInput, String nomeInput, String emailInput, Date dataDeNascimentoInput) {
    
        setId(idInput);
        setCpf(cpfInput);
        setTelefone(telefoneInput);
        setNome(nomeInput);
        setEmail(emailInput);
        setDataDeNascimento(dataDeNascimentoInput);
    }
    public Cliente(int cpfInput, int telefoneInput, String nomeInput, String emailInput, Date dataDeNascimentoInput) {
        
        
        setCpf(cpfInput);
        setTelefone(telefoneInput);
        setNome(nomeInput);
        setEmail(emailInput);
        setDataDeNascimento(dataDeNascimentoInput);
    }
    public Cliente(){

    }
    
    /*Métodos getter e setter*/
    
    public int getId() {
        return id;
    }
    public void setId(int id) {

        this.id = id;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }   
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {

        this.email = email;
    }
    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}