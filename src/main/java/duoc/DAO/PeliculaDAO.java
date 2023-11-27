package duoc.DAO;

import duoc.cl.hoytsmarkplanet.DTO.PeliculaDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PeliculaDAO {

    public Connection conexion = null;

    public void conectar() {
        try {
            String url = "jdbc:mysql://localhost:3306/moviesdb";
            String user = "root";
            String password = "";
            conexion = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    
}
