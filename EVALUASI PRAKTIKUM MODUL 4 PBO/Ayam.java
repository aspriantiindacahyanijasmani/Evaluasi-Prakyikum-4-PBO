package com.mycompany.tampil;

class Ayam extends Hewan {
    //menggunakan method dari kelas induk abstrak
    @Override 
    protected void munculSuara(){
        System.out.println("Suara Ayam: Pkok...pkok...pkok.");
    }
    
}
