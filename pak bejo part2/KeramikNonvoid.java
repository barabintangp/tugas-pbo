/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pak.bejo.part2;

/**
 *
 * @author User
 */
public class KeramikNonvoid {
    /*membuat atribut*/
    int luas;
    int panjang;
    int harga;
    int lebar;
    int isibox;
    
    /*methods*/
    int hitungKeramik(){
        int keramik;
        keramik = this.luas/(this.panjang*this.lebar);
        return keramik;
    }
    int hitungKerdus(){
        int kerdus;
        kerdus = (this.luas/(this.panjang*this.lebar))/this.isibox;
        return kerdus;
    }
    int totalBiaya(){
        int biaya;
        biaya = ((this.luas/(this.panjang*this.lebar)))/this.isibox*this.harga;
        return biaya;
    }
            
}
