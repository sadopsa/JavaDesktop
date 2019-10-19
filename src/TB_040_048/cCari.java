/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TB_040_048;
import TB_040_048.EMapel;
import TB_040_048.EMurid;
import TB_040_048.ENilai;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * 
 */
public class cCari{ 
    Connection koneksi=null;
    Statement stat=null;
    ResultSet result=null;
    String query=null;
    
    public cCari(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            koneksi = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","oop","rail");
            stat = koneksi.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal");
        }
    }
    
    public void tambahmatkul(EMapel matkul){
        String query = "INSERT INTO MAPEL VALUES('"
                +matkul.getid()+ "','"
                +matkul.getnama()+ "','"
                +matkul.getnip()+"')";
       
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Simpan");
        }
    }
    
    
    public void ubahmatkul(EMapel matkul){
        String query="UPDATE MAPEL SET NAMA_MAPEL='"+matkul.getnama()+"',NIP='"+matkul.getnip()+"' WHERE NO_MAPEL='"+matkul.getid()+"'";
        
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Ubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
        }
        
    }
    
    public void hapusmatkul(EMapel matkul){
        String query="DELETE FROM MAPEL WHERE NO_MAPEL='"+matkul.getid()+"'";
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Hapus");
        }
    }
    
    public void tambahmhs(EMurid mhs){
        String query = "INSERT INTO SISWA VALUES('"
                +mhs.getid()+ "','"
                +mhs.getnama()+ "','"
                +mhs.getalamat()+ "','"
                +mhs.getgender()+"')";
        
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Simpan");
        }
    }
    
    public void ubahmhs(EMurid mhs){
         String query="UPDATE SISWA SET NAMA='"+mhs.getnama()+"', ALAMAT='"+mhs.getalamat()+"',GENDER='"+mhs.getgender()+"' WHERE NIS='"+mhs.getid()+"'";
         try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Ubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Ubah");
        }
    }
         
    public void hapusmhs(EMurid mhs){
        
    String query="DELETE FROM SISWA WHERE NIS='"+mhs.getid()+"'";
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Hapus");
        }
        
    }
    
    
    
    public void tambahnilai(ENilai nilai){
        
        String query = "INSERT INTO NILAI VALUES('"
                +nilai.getno()+"','"
                +nilai.getnis()+ "','"
                +nilai.getidmapel()+"','"
                +nilai.getnilai()+"')";
         try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Tambah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Tambah");
        }
    }
    
    public void ubahnilai(ENilai nilai){
        String query="UPDATE NILAI SET NIS='"+nilai.getnis()+"',NO_MAPEL='"+nilai.getidmapel()+"', NILAI='"+nilai.getnilai()+"' WHERE NO='"+nilai.getno()+"'";
        
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Ubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Ubah");
        }
        
    }
         
  public void hapusnilai(ENilai nilai){
      String query="DELETE FROM NILAI WHERE NO='"+nilai.getno()+"'";
      try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Hapus");
        }   
  }
  
  public void tambahguru(EGuru guru){
        String query = "INSERT INTO GURU VALUES('"
                +guru.getid()+ "','"
                +guru.getnama()+ "','"
                +guru.getalamat()+ "','"
                +guru.getgender()+"')";
        
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Simpan");
        }
    }
    
    public void ubahguru(EGuru guru){
         String query="UPDATE GURU SET NAMA='"+guru.getnama()+"', ALAMAT='"+guru.getalamat()+"',GENDER='"+guru.getgender()+"' WHERE NIP='"+guru.getid()+"'";
         try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Ubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Ubah");
        }
    }   
   
    public void hapusguru(EGuru guru){
        
    String query="DELETE FROM GURU WHERE NIP='"+guru.getid()+"'";
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Hapus");
        }
        
    }
  
      public void tambahkelas(EKelas kelas){
        String query = "INSERT INTO KELAS VALUES('"
                +kelas.getnokelas()+ "','"
                +kelas.getnama()+ "','"
                +kelas.getnip()+ "','"
                +kelas.getnis()+"')";
        
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Simpan");
        }
    }
    
    public void ubahkelas(EKelas kelas){
         String query="UPDATE kelas SET NAMA_KELAS ='"+kelas.getnama()+"',IDWK='"+kelas.getnip()+"',NIS='"+kelas.getnis()+"' WHERE NO_KELAS='"+kelas.getnokelas()+"'";
         try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Ubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Ubah");
        }
    }   
   
    public void hapuskelas(EKelas kelas){
        
    String query="DELETE FROM kelas WHERE No_kelas='"+kelas.getnokelas()+"'";
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Hapus");
        }
        
    }
    
    public void tambahwali(EWaliKelas wali){
        String query = "INSERT INTO WALIKELAS VALUES('"
                +wali.getidwk()+ "','"
                +wali.getnip()+ "','"
                +wali.getkelas()+"')";
        
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Simpan");
        }
    }
    
    public void ubahwali(EWaliKelas wali){
         String query="UPDATE WALIKELAS SET NIP='"+wali.getnip()+"',KELAS='"+wali.getkelas()+"' WHERE IDWK='"+wali.getidwk()+"'";
         try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Ubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Ubah");
        }
    }   
   
    public void hapuswali(EWaliKelas wali){
        
    String query="DELETE FROM WALIKELAS WHERE IDWK='"+wali.getidwk()+"'";
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Hapus");
        }
        
    }
    
       public void tambahekskul(EEkskul ekskul){
        String query = "INSERT INTO EKSKUL VALUES('"
                +ekskul.getno()+ "','"
                +ekskul.getnama()+ "','"
                +ekskul.getnis()+"')";
        
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Simpan");
        }
    }
    
    public void ubahekskul(EEkskul ekskul){
         String query="UPDATE EKSKUL SET NAMA_EKSKUL='"+ekskul.getnama()+"',NIS='"+ekskul.getnis()+"' WHERE NO='"+ekskul.getno()+"'";
         try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Ubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Ubah");
        }
    }   
   
    public void hapusekskul(EEkskul ekskul){
        
    String query="DELETE FROM EKSKUL WHERE NO='"+ekskul.getno()+"'";
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Hapus");
        }
        
    }
 
}