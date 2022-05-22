package com.ufsm.csi.servlets;

import com.ufsm.csi.dao.UsuarioDAO;
import com.ufsm.csi.infra.ConnectionFactory;
import com.ufsm.csi.model.Usuario;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.util.Calendar;

@WebServlet("/addUsuario")
public class AddUserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");
        Date data_cadastro = new Date(Calendar.getInstance().getTime().getTime());

        if(nome == null | nome.isEmpty() | email == null | email.isEmpty() | senha == null | senha.isEmpty()){
            RequestDispatcher dispatcher = req.getRequestDispatcher("erro.jsp");
            dispatcher.forward(req, resp);
        }
        else {
            Usuario usuario = new Usuario(nome, email, senha, data_cadastro);

            Connection connection = ConnectionFactory.getConnection();
            UsuarioDAO dao = new UsuarioDAO(connection);
            dao.save(usuario);
            RequestDispatcher dispatcher = req.getRequestDispatcher("Login.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
