<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ATUALIZAR CLIENTE</title>
    <style>
        body {
            text-align: center;
            background-color: #f2f2f2;
            font-family: Arial, sans-serif;
        }
        h1 {
            margin-top: 50px;
        }
        form {
            margin: 0 auto;
            width: 300px;
            text-align: left;
        }
        label {
            display: block;
            margin-top: 10px;
        }
        input {
            width: 100%;
            padding: 5px;
            margin-top: 5px;
        }
        button {
            width: 100%;
            padding: 10px;
            background-color: #007BFF;
            color: #fff;
            border: none;
            cursor: pointer;
            margin-top: 10px;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h1>ATUALIZAR CLIENTE</h1>
    <form>
        <label for="id_usuario">ID:</label>
        <input type="text" id="id" name="id" required>
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" required>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
        <label for="telefone">Telefone:</label>
        <input type="tel" id="telefone" name="telefone" required>
        <label for="cpf">CPF:</label>
        <input type="text" id="cpf" name="cpf" required>
        <label for="senha">Senha:</label>
        <input type="password" id="senha" name="senha" required>
        <button type="submit">Atualizar</button>
    </form>
</body>
</html>
    