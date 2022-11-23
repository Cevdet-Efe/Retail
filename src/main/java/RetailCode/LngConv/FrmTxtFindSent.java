package RetailCode.LngConv;
import java.sql.*;

public class FrmTxtFindSent {
    public static void main(String[] args) throws SQLException {
        String connectionURL = "jdbc:oracle:thin:Win10SDbase:RETAILDB";
        String userName = "MAIN";
        String password = "MAIN";
        Connection connection = DriverManager.getConnection(connectionURL,userName,password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT EMTIANO,EMTIAAD FROM MASK0001");
        while(resultSet.next()){
            System.out.println("Emtiano :"+resultSet.getString(1));
        }
    }

}
