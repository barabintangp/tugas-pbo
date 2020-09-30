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
public class KeramikConstructor {
    /*membuat atribut*/
    int panjang;
    int lebar;
    int luas;
    int isibox;
    int harga;
    
    //costruc//
    KeramikConstructor(int p, int l, int L, int i, int h){
        this.panjang = p;
        this.lebar = l;
        this.luas = L;
        this.isibox = i;
        this.harga = h;
    }
    
    /*methods*/
    
    void hitungKeramik(){
        int keramik = this.luas/(this.panjang*this.lebar);
        System.out.println("keramik : " +keramik+ "buah");
    }
    void hitungKerdus(){
        int kerdus = (this.luas/(this.panjang*this.lebar))/this.isibox;
        System.out.println("total kerdus : " +kerdus+ "box");
    }
    void totalBiaya(){
        int biaya = ((this.luas/(this.panjang * this.lebar))/ this.isibox) * this.harga;
        System.out.println("total harga : " +biaya+ "rupiah");    
    }
    
}
