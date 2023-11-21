/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p6;

/**
 *
 * @author ASUS
 */
class Hewan {
    String nama;
    String jenis;
    String Habitat;

    Hewan(String nama, String jenis, String Habitat) {
        this.nama = nama;
        this.jenis = jenis;
        this.Habitat=Habitat;
    }

    void bersuara() {
        System.out.println(nama + " bersuara.");
    }
}

class Kucing extends Hewan {
    String Ras;

    Kucing(String nama, String jenis, String Habitat,String Ras) {
        super(nama, jenis, Habitat);
        this.Ras = Ras;
    }

    @Override
    void bersuara() {
        System.out.println(nama + " mengeluarkan suara 'Meow'.");
    }
}

class Buaya extends Hewan {


    Buaya(String nama, String jenis, String Habitat) {
        super(nama, jenis,Habitat);
    
    }

    @Override
    void bersuara() {
        System.out.println(nama + " mengaung 'Rawwww'.");
    }
}
class Ayam extends Hewan {


    Ayam(String nama, String jenis, String Habitat) {
        super(nama, jenis,Habitat);
    
    }

    @Override
    void bersuara() {
        System.out.println(nama + " Berkokok 'Kukkuruyukkk'.");
    }
}

public class tugasACC {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Neko", "Anggora","Darat", "Oren");
        Buaya buaya = new Buaya("Ali", "Albino", "Amfibi");
        Ayam ayam = new Ayam("Elgato", "Katek", "Darat");
        
        System.out.println(kucing.nama + " adalah Kucing jenis " + kucing.jenis + " Berhabitat " + kucing.Habitat+ " dengan bulu berwarna " + kucing.Ras + ".");
        System.out.println(buaya.nama + " adalah buaya jenis " + buaya.jenis + " Berhabitat " + buaya.Habitat + ".");
        System.out.println(ayam.nama + " adalah ayam jenis " + ayam.jenis + " Berhabitat " + ayam.Habitat + ".");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        
        kucing.bersuara();  
        buaya.bersuara();
        ayam.bersuara();
    }
}


