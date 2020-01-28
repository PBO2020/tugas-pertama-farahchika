package com.company;

public class Main {

    public static void main(String[] args) {

        calculator chk = new calculator();
        chk.setangka1(8);
        chk.setangka2(4);
        System.out.println("Angka 1 : " + chk.getangka1());
        System.out.println("Angka 2 : " + chk.getangka2());
        System.out.println("Hasil Penjumlahan : " + chk.gethasil());
        System.out.println("Hasil Pengurangan : " + chk.gethasil2());
        System.out.println("Hasil Perkalian : " + chk.gethasil3());
        System.out.println("Hasil Pembagian : " + chk.gethasil4());


    }
}
