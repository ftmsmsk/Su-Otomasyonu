
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DB {
    
     final private String url="org.sqlite.JDBC";
   final private String db="jdbc:sqlite:db/";
                     //bura sabıt   //projenn ıcınde old ıcın bole aldık masa ust olsa C: demek lazım
    
    private String dbName="musteriBilgileri.db";
    
   
    
    private Connection conn=null;   //iletısımı saglıyor
    private Statement st=null;
    
    
    public DB(){  //dbName ıcın bu bosu yazdı
        
    }
    
    public DB(String dbName){
        this.dbName=dbName;
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
            conn=DriverManager.getConnection(db+dbName);//yukarda ayırmıstı burda bırlestrdı dınamıkte oluyo
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
           String telefon=satirlar[2];
           String adres=satirlar[3];
           
           String insertMethod="insert into '"+isimler+"' values(null,'" + ad + "','" + soyad + "','" + telefon + "','" + adres + "')";
           return insertMethod;
         }
    
    
    
      
}
