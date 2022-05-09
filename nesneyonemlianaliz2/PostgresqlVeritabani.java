package nesneyonemlianaliz2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgresqlVeritabani implements IVeritabani{
	
	private Connection connection;
    @Override
    public boolean baglan() {
        String jdbcURL = "jdbc:postgresql://localhost:5432/NYAT";
        String username = "postgres";
        String password = "salih123";
        try{
            connection = DriverManager.getConnection(jdbcURL,username,password);
            return true;
        }
        catch (Exception e) {
            System.out.println("Error in connecting to PostreSql");
            e.printStackTrace();
            return false;
        }
    }

    //kullanici doðrulama iþlemi
    @Override
    public boolean kullaniciKontrol(IKisi kullanici) {
    	String sql = "SELECT * FROM \"bilgiler\" WHERE \"ad\"='"+kullanici.getKullaniciAdi()+"' AND \"sifre\"='"+kullanici.getSifre()+"'";
        try
        {
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery(sql);
            if(rs.next())
            {
                return true;
            }
            else return false;
        }catch (Exception e)
        {
            e.printStackTrace();
            return  false;
        }
    
        
    }
}
