<%@page import="classes.modelos.Cliente"%>
<%@page import="classes.dao.ClienteDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<html>
<head><title>Página CRUD</title>
<link rel="stylesheet" href="estilo.css">

</head>
<body>
<h1 class="titulo">CRUD de Clientes</h1><br/>
<h3 class="texto"> aluno: Jair Chacon </h3>
<h3 class="texto"> aluno: Matheus Seiji</h3>

<form>
         <h1 class="subtitulo">   Cadastro de Cliente </h1>
        
        <label for="nome">Nome do Cliente:</label><br>
        <input type="text" id="nome" name="nome"><br>

        <label for="email">Email:</label><br>
        <input type="text" id="email" name="email"><br>

        <label for="cpf">CPF:</label><br>
        <input type="number" id="cpf" name="cpf"><br>

        <label for="telefone">Telefone:</label><br>
        <input type="number" id="telefone" name="telefone"><br>

        <label for="dataNas">Data de nascimento:</label><br>
        <input type="date" id="dataNas" name="dataNas"><br>

        <input type="submit" value="Enviar"><br>
</form>

<form>
       <h1 class="subtitulo"> Atualização do Cliente</h1>
       
        <label for="id">Id do Cliente:</label><br>
        <input type="number" id="usuario" name="id"><br>
        
        <label for="nome">Nome do Cliente:</label><br>
        <input type="text" id="nome" name="nome"><br>

        <label for="email">Email:</label><br>
        <input type="text" id="email" name="email"><br>

        <label for="cpf">CPF:</label><br>
        <input type="number" id="cpf" name="cpf"><br>

        <label for="telefone">Telefone:</label><br>
        <input type="number" id="telefone" name="telefone"><br>

        <label for="dataNas">Data de nascimento:</label><br>
        <input type="date" id="dataNas" name="dataNas"><br>

        <input type="submit" value="Enviar"><br>
</form>

<form>
       <h1 class="subtitulo"> Deletar Cliente</h1>
       
       <label for="deletarID">Id do Cliente </label><br>
       <input type="number" id="usuario" name="deletarID"><br>
       
       <h3 class="texto"> Deseja deletar o Cliente?</h3>
       <input type="submit" value="Deletar"><br>
       

</form>



 
</body>
</html>

