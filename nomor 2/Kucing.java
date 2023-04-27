
package com.mycompany.tampil;

class Kucing extends Hewan {
    //Menggunakan method dari kelas induk abstrak
    @Override
    protected void munculSuara(){
        System.out.println("Suara Kucing: meow...meow..meow.");
    }
    
}
