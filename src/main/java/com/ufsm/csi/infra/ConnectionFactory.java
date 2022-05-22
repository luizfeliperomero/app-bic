package com.ufsm.csi.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private ConnectionFactory(){}

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost/ufsm", "postgres", "fab06688");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
