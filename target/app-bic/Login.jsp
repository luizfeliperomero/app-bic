<%--
  Created by IntelliJ IDEA.
  User: luizf
  Date: 21/05/2022
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Entrar</title>
  <link rel="stylesheet" href="resources/css/styles.css">
</head>
<body>
<form action="Dashboard.jsp">
  <h1>Entrar</h1>
  <div class="field">
    <div class="labels">
      <label>Email</label>
      <label>Senha</label>
    </div>
    <div class="inputs">
      <input type="email" name="email">
      <input type="password" name="senha">
    </div>
  </div>
  <div class="redirect">
    <p>Não Possui uma Conta? <a href="CadastroUsuario.jsp">Criar Conta</a></p>
  </div>
  <div class="buttons">
    <a href="Home.jsp"><button class="cancel">Cancelar</button></a>
    <button class="sub" type="submit">Acessar</button>
  </div>
</form>
</body>
</html>
