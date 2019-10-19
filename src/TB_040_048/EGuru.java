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
public class EGuru {
    String nip,nama,alamat,gender;
    
    public void setid(String id){
        nip=id;
    }
    public void setnama(String nama){
        this.nama=nama;
    }
    public void setalamat(String alamat){
        this.alamat=alamat;
    }
    public void setgender(String gender){
        this.gender=gender;
    }
    public String getid(){
        return nip;
    }
    public String getnama(){
        return nama;
    }
    public String getalamat(){
        return alamat;
    }
    public String getgender(){
        return gender;
    }
}

