package com.ufsm.csi.dao;

import com.ufsm.csi.infra.ConnectionFactory;
import com.ufsm.csi.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO implements IUsuarioDAO {
    public UsuarioDAO(Connection connection) {
    }

    @Override
    public Usuario save(Usuario usuario) {
        try(Connection connection = ConnectionFactory.getConnection()) {

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Usuario (nome, email, senha, ativo, data_cadastro) VALUES ( ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setString(2, usuario.getEmail());
            preparedStatement.setString(3, usuario.getSenha());
            preparedStatement.setBoolean(4, usuario.isAtivo());
            preparedStatement.setDate(5, usuario.getData_cadastro());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
