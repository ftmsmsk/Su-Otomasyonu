
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class DBS {
    
    
    final private String url="org.sqlite.JDBC";
    final private String db="jdbc:sqlite:db/";
    
    
    private String dbName1="siparisBilgileri.db";
    
    
    private Connection conn=null;   //iletısımı saglıyor
    private Statement st=null;
    
    
    public DBS(){  
        
    }
    
    public DBS(String dbName1){
        this.dbName1=dbName1;
    }

   
    
    //baglan metotu kuruluyor gerıye statment dondercek
    public Statement baglan(){
        if(st!=null && conn!=null){
            st=null;
            conn=null;
        }else{
        try {
            //kutuphane calıstrmk ıcın
            Class.forName(url);
            //tunelı kuruyoruz
            conn=DriverManager.getConnection(db+dbName1);//yukarda ayırmıstı burda bırlestrdı dınamıkte oluyo
            st=conn.createStatement();//conn ıcındekını bana getır
            System.out.println("bağlantı başarılı");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("bağlantı hatası:" + e);
        }
        }
        return st;
    }
      
    
    
    
      public void kapat(){
        //Connec ve Stat kapatıyor
        if(st != null && conn != null){ //baslangıcta atadıgım degerden farklıysa kapat
            try {
                st.close();
                conn.close();
                st=null;
                conn=null;
                System.out.println("kapatma yapıldı");
            } catch (SQLException e) {
                System.err.println("kapatma hatası:" + e);
            }
        }
    }  
    
    
 
    
     public String dizi(String isimler,String[] satirlar){
           String ad=satirlar[0];
           String soyad=satirlar[1];
           String adres=satirlar[2];
           String teslimDurumu=satirlar[3];
           
           String insertMethod="insert into '"+isimler+"' values(null,'" + ad + "','" + soyad + "','" + adres + "','" + teslimDurumu + "')";
           return insertMethod;
         }
    
    
    
    
    
    
    
}
