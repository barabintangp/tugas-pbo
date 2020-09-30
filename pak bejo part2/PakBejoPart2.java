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
public class PakBejoPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("penggunaan constructor");
        System.out.println("keramik A");
        KeramikConstructor kc1 = new KeramikConstructor(30, 30, 1000000, 10, 54000);
        kc1.hitungKeramik();
        kc1.hitungKerdus();
        kc1.totalBiaya();
        
        System.out.println("keramik B");
        KeramikConstructor kc2 = new KeramikConstructor(40, 40, 1000000, 5, 65000);
        kc2.hitungKeramik();
        kc2.hitungKerdus();
        kc2.totalBiaya();
        
        System.out.println("keramik C");
        KeramikConstructor kc3 = new KeramikConstructor(30, 40, 1000000, 8, 60000);
        kc3.hitungKeramik();
        kc3.hitungKerdus();
        kc3.totalBiaya();
        
        System.out.println("penggunaan nonvoid");
        System.out.println("keramik A");
        KeramikNonvoid knv1 = new KeramikNonvoid();
        knv1.luas = 1000000;
        knv1.lebar = 30;
        knv1.panjang = 30;
        knv1.harga = 54000;
        knv1.isibox = 10;
        System.out.println("keramik: "+knv1.hitungKeramik()+" buah");
        System.out.println("total kerdus: "+knv1.hitungKerdus()+ " box");
        System.out.println("totalHarga: "+knv1.totalBiaya()+ " rupiah");
        
        System.out.println("keramik B");
        KeramikNonvoid knv2 = new KeramikNonvoid();
        knv2.luas = 1000000;
        knv2.lebar = 40;
        knv2.panjang = 40;
        knv2.harga = 65000;
        knv2.isibox = 5;
        System.out.println("keramik: "+knv2.hitungKeramik()+" buah");
        System.out.println("total kerdus: "+knv2.hitungKerdus()+ " box");
        System.out.println("totalHarga: "+knv2.totalBiaya()+ " rupiah");
        
        System.out.println("keramik C");
        KeramikNonvoid knv3 = new KeramikNonvoid();
        knv3.luas = 1000000;
        knv3.lebar = 40;
        knv3.panjang = 30;
        knv3.harga = 60000;
        knv3.isibox = 8;
        System.out.println("keramik: "+knv3.hitungKeramik()+" buah");
        System.out.println("total kerdus: "+knv3.hitungKerdus()+ " box");
        System.out.println("totalHarga: "+knv3.totalBiaya()+ " rupiah");
    }
    
}
