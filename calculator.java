package com.company;

public class calculator {
    int angka1;
    public int getangka1 (){
        return angka1;
    }
    public void setangka1 (int angka1){
        this.angka1 = angka1;
    }
    int angka2;
    public int getangka2 (){
        return angka2;
    }
    public void setangka2 (int angka2){
        this.angka2 = angka2;
    }
    int hasil;
    public int gethasil (){
        hasil = angka1 + angka2;
        return hasil;
    }
    int hasil2;
    public int gethasil2 (){
        hasil2 = angka1 - angka2;
        return hasil2;
    }
    int hasil3;
    public int gethasil3 (){
        hasil3 = angka1 * angka2;
        return hasil3;
    }
    int hasil4;
    public int gethasil4 (){
        hasil4 = angka1 + angka2;
        return hasil4;
    }
    public void sethasil (int hasil){
        this.hasil = hasil;
    }
}
