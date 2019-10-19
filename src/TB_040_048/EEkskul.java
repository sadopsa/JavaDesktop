/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TB_040_048;

/**
 *
 * @author user
 */
public class EEkskul {
    String nama,nis;
    int no;
  
   
   public void setno(int n){
       this.no=n;
   }
   public void setnama(String nm){
       this.nama=nm;
   } 
   public void setnis(String siswa){
       this.nis=siswa;
   }
   public int getno(){
       return no;
   }
   public String getnama(){
       return nama;
   }
   public String getnis(){
       return nis;
   } 
}
