/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metaland;



import java.security.Timestamp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Date;
public class veritabani {
	static String url = "jdbc:postgresql://localhost:5432/";//postgre sql için bunu kullan 
  //  static String url = "jdbc:mysql://127.0.0.1:3340/postgres";//127 yerinelocal host vardı
	static Connection conn = null;
	static Statement myStat;
        Connection connection = null;///en son ben  ekledimmm
	static void baglan() {
		try {
			conn = DriverManager.getConnection(url,"postgres","PASSWORD");//sadece root vardı
			System.out.println("Baglanti gerceklesti ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	static ResultSet listele(String sorgu) {
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sorgu);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
       

        static ResultSet sorgula(String sorgu) {
		ResultSet myRs = null;		
		try {			
			myRs = myStat.executeQuery(sorgu);
		} catch (SQLException e) {
                    System.out.println("baglanti kuruldu sorgu yapilamadi");
			e.printStackTrace();
		}
		
		return myRs;
	}
       static ResultSet yap() {
		ResultSet myRs = null;
		try {			
			conn = (Connection) DriverManager.getConnection(url,"postgres","PASSWORD");
			myStat = (Statement) conn.createStatement();
		//	myRs = myStat.executeQuery("select * from postgres");//yorum satırına alınabilir burası
			                 System.out.println("baglanti kuruldu ");
		//yorum satırlarını ben ekledim 	
		} catch (Exception e) {
                    System.out.println("baglanti kurulamadi");
			e.printStackTrace();
		}
		return myRs;
	}
       String query = "update users set num_points = ? where first_name = ?";
static void guncellemeFonk(String sorgu, int simdikiYemek,int simdikiEsya,int simdikiPara,int harcananPara,int kazanilanEsya,int kazanilanYemek){
    //int simdikiYemek = 1000;
   // int simdikiEsya =1000;
   // int simdikiPara=1000;
    try (Connection connection = DriverManager.getConnection(url, "postgres","PASSWORD");

            PreparedStatement preparedStatement = connection.prepareStatement(sorgu)) {
       // ResultSet rs = preparedStatement.executeQuery(sorgu);
         //while(rs.next()){
            //Display values
           // System.out.print("ID: " + rs.getInt("id"));
           // System.out.print(", Age: " + rs.getInt("age"));
          //  System.out.print(", First: " + rs.getString("first"));
           // System.out.println(", Last: " + rs.getString("last"));
           ///simdikiYemek=rs.getInt("kullanici_yemek_miktari");
          // simdikiEsya=rs.getInt("kullanici_esya_miktari");
          // simdikiPara=rs.getInt("kullanici_para_miktari");
         //}
        // rs.close();
         // preparedStatement.setDate(1, java.sql.Date.valueOf(yil+"-"+ay+"-"+gun));
           // preparedStatement.setInt(3, calisma_saati);//2
            //preparedStatement.setInt(2, calisma_gunu);//3
           // preparedStatement.setInt(4, kullanici_id);
           preparedStatement.setInt(1, simdikiYemek+kazanilanYemek);
           preparedStatement.setInt(2,simdikiEsya+kazanilanEsya );
            preparedStatement.setInt(3,simdikiPara-harcananPara );
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

         
            System.out.println("hata");
            e.printStackTrace();
        }
    
}
 // private static final String INSERT_USERS_SQL = "INSERT INTO kullanici" + " (id,kullanici_adi,sifre) VALUES " + " (?, ?, ?);";
private static final String INSERT_USERS_SQL = "INSERT INTO kullanici" + " (kullanici_adi,sifre) VALUES " + " (?,?);";
        public void insertRecord(String calisma_bilgisi_ekleme_sorgusu,int gun,int ay,int yil,int calisma_saati,int calisma_gunu,int kullanici_id) throws SQLException {
        String naber="95";
           Date birlestirilmisDate=new Date();
           birlestirilmisDate.setDate(gun);
             birlestirilmisDate.setMonth(ay);
               birlestirilmisDate.setYear(yil);
           //simdikiZaman.setTime(0);
         //  String ss=simdikiZaman.toString();
                    System.out.println(calisma_bilgisi_ekleme_sorgusu);
        // Step 1: Establishing a Connection
        try (Connection connection = DriverManager.getConnection(url, "postgres","PASSWORD");
          //  birlestirilmisDate.setMonth(txt)=txt
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(calisma_bilgisi_ekleme_sorgusu)) {
           //date.getDay();
          //  preparedStatement.setInt(1,+1 );
          preparedStatement.setDate(1, java.sql.Date.valueOf(yil+"-"+ay+"-"+gun));
            preparedStatement.setInt(3, calisma_saati);//2
            preparedStatement.setInt(2, calisma_gunu);//3
            preparedStatement.setInt(4, kullanici_id);
         //    preparedStatement.setDate(3, simdikiZaman);
         //    preparedStatement.setString(3,  ss);
        //  preparedStatement.setTimestamp(3, new Timestamp(Long.parseLong(naber)));
          //  preparedStatement.setString(4, "US");
          //  preparedStatement.setString(5, "secret");

            System.out.println(preparedStatement);
         
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

         
            System.out.println("hata");
            e.printStackTrace();
        }

        
    }

   
       
       
       
       
       
       
       
	
}
