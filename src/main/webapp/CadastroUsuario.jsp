<%--
  Created by IntelliJ IDEA.
  User: luizf
  Date: 21/05/2022
  Time: 13:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro</title>
    <link rel="stylesheet" href="resources/css/styles.css">
</head>
<body>
<form action="poow" method="post">
    <h1>Cadastro</h1>
    <div class="field">
        <div class="labels">
    <label>Nome</label>
    <label>Email</label>
    <label>Senha</label>
        </div>
        <div class="inputs">
    <input type="text" name="nome">
    <input type="email" name="email">
    <input type="password" name="senha">
            <input type="hidden" name="acao" value="AddUsuario">
        </div>
    </div>
    <div class="redirect">
    <p>Já Possui uma Conta? <a href="Login.jsp">Entrar</a></p>
    </div>
    <div class="buttons">
        <a href="Home.jsp"><button class="cancel">Cancelar</button></a>
    <button class="sub" type="submit">Cadastrar</button>
    </div>
</form>
</body>
</html>
