/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TB_040_048;

/**
 *
 * 
 */
public class ENilai {
   String nis,idmapel,NO;
   int nilai;
   
   public void setno(String n){
       this.NO=n;
   }
   public void setnis(String id){
       this.nis=id;
   }
   public void setidmapel(String nomapel){
       this.idmapel=nomapel;
   } 
   public void setnilai(int nilai){
       this.nilai=nilai;
   }
   public String getnis(){
       return nis;
   }
   public String getidmapel(){
       return idmapel;
   }
   public int getnilai(){
       return nilai;
   }
   public String getno(){
       return NO;
   }
}
