package com.ufsm.csi.servlets;

import com.ufsm.csi.acoes.AddUsuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("poow")
public class ControllerServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String acao = req.getParameter("acao");

        if(acao.equals("AddUsuario")) {
            new AddUsuario().execute(req, resp);
        }
    }
}
