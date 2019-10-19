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
public class EMapel {
     String id_mapel, nama_mapel,Nip;
    
    public void setidmpel(String idmapel){
        id_mapel=idmapel;
    }
    public void setnamamapel(String namamapel){
        nama_mapel=namamapel;
    }
    public void setnip(String nip){
        Nip=nip;
    }
    public String getid(){
        return id_mapel;
    }
    public String getnama(){
        return nama_mapel;
    }
     public String getnip(){
        return Nip;
    }
    
}
