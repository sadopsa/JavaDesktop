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
public class EWaliKelas {
      String idwk,nip,kelas;
  
   
   public void setidwk(String id){
       this.idwk=id;
   }
   public void setnip(String guru){
       this.nip=guru;
   } 
   public void setkelas(String kls){
       this.kelas=kls;
   }
   public String getidwk(){
       return idwk;
   }
   public String getnip(){
       return nip;
   }
   public String getkelas(){
       return kelas;
   }
}
