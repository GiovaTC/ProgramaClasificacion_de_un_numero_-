package com.ejemplo.dao;

import com.ejemplo.config.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NumeroDAO {

    public void guardar(int numero, String clasificacion) {

        String sql = """
                INSERT INTO numeros(numero, clasificacion)
                VALUES (?, ?)
                """;

        try (Connection connection = ConexionBD.conectar();
             PreparedStatement statement =
                     connection.prepareStatement(sql)) {

            statement.setInt(1, numero);
            statement.setString(2, clasificacion);

            statement.executeUpdate();

            System.out.println("INFORMACION guardada en ORACLE 19C.");
        }
        catch (SQLException e) {
            System.out.println(
                    "error al guardar en ORACLE: " + e.getMessage()
            );
        }
    }
}
