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
public class EKelas {
     String nokelas,nama_kelas,Nip,Nis;
    
    public void setnokelas(String nok){
        nokelas=nok;
    }
    public void setnama(String namakelas){
        nama_kelas=namakelas;
    }
    public void setnip(String nip){
        Nip=nip;
    }
    public void setnis(String nis){
        Nis=nis;
    }
    public String getnokelas(){
        return nokelas;
    }
    public String getnama(){
        return nama_kelas;
    }
     public String getnip(){
        return Nip;
    }
     public String getnis(){
        return Nis;
    }
    
}
