
package conexaosql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public static Connection ConexaoBanco (){
        // criar o objecto conexão
        java.sql.Connection conexaoSQL = null;
        
        //chamar driver
        String driver = "com.mysql.jdbc.Driver";
        
        // informações referente ao banco de dados
        String url = "jdbc:mysql://br234.hostgator.com.br:3306/somde078_EstudosMySQL";
        String user = "somde078_conn";
        String password  = "1.juetania";
        
        //Tratar as exceções
        try {
            Class.forName(driver);
            conexaoSQL = DriverManager.getConnection(url, user, password);
            return conexaoSQL;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }
            /* criar método conectar e desconectar, 
            ver https://www.youtube.com/watch?v=_Ke7CiTdmiI&list=PL-mvLy2ws8ILNrs8jtEAwaZMxDZvlMj48 
            no minuto 2:52
        
               
        */     
    }
    public static void main(String[] args) {
            Connection strConexao = Conexao.ConexaoBanco();
            if (strConexao == null){
                System.out.println("Não conectado!");
                
            }else{
                System.out.println(strConexao + " CONECTADO COM SUCESSO!");
            }
            
    }

    /*
    public static Connection Connect() {
        /*
        try {
            String URL = "jdbc:mysql://br234.hostgator.com.br:2083/somde078_EstudosMySQL";
            String USER = "somde078_conn";
            String PASSWORD = "1.juetania";

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                    //.getConnection(URL, USER, PASSWORD);
            return conn;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }*/

    
    
    /*
    Ser for preciso para o mysql remoto, Meu IP: 200.186.56.188

    
    Informações sobre as configurações de DNS:

    Nome do Servidor: br234.hostgator.com.br
    IP do Servidor: 192.185.176.78

    Se você estiver usando um domínio existente com a sua nova conta de hospedagem, 
    você precisará atualizá-los para apontar para os DNS listados abaixo.

    Nameserver 1: ns234.hostgator.com.br (192.185.176.78)
    Nameserver 2: ns235.hostgator.com.br (192.185.217.16
    */
}
   
