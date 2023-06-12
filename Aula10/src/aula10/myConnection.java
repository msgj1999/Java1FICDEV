package aula10;
import java.sql.*;
public class myConnection {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver"); // registra o driver
            Connection conn = DriverManager.getConnection(
        "jdbc:postgresql://localhost:5432/ficdev", "postgres", "123456"); // abre conexão
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM escola"); // executa comando SQL
            while (rs.next()) { //manipula resultado
                int id = rs.getInt("idescola");
                String nome = rs.getString("nomeescola");
                System.out.println(id + ", " + nome );
            }
            conn.close(); // fecha conexão
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}