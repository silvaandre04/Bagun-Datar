package com.tutorial;

class BagunDatar{
    float Luas(){
        return 0;
    }
}

class Persegi extends BagunDatar {
    private float sisi;

    public float getSisi() {
        return sisi;
    }

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    public float hitungLuas() {
        return sisi * sisi;
    }

    public float hitungKeliling() {
        return 4 * sisi;
    }
}

class PersegiPanjang extends BagunDatar {
    private float panjang;
    private float lebar;

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float hitungLuas() {
        return panjang * lebar;
    }

    public float hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

class Lingkaran extends BagunDatar {
    private float jariJari;

    public float getJariJari() {
        return jariJari;
    }

    public void setJariJari(float jariJari) {
        this.jariJari = jariJari;
    }

    public float hitungLuas() {
        return (float) (Math.PI * jariJari * jariJari);
    }

    public float hitungKeliling() {
        return (float) (2 * Math.PI * jariJari);
    }
}

class Segitiga extends BagunDatar{
    private float alas;
    private float tinggi;
    private float sisi1;
    private float sisi2;
    private float sisi3;

    public float getAlas() {
        return alas;
    }

    public void setAlas(float alas) {
        this.alas = alas;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public float getSisi1() {
        return sisi1;
    }

    public void setSisi1(float sisi1) {
        this.sisi1 = sisi1;
    }

    public float getSisi2() {
        return sisi2;
    }

    public void setSisi2(float sisi2) {
        this.sisi2 = sisi2;
    }

    public float getSisi3() {
        return sisi3;
    }

    public void setSisi3(float sisi3) {
        this.sisi3 = sisi3;
    }

    public float hitungLuas() {
        return (alas * tinggi) / 2;
    }

    public float hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Persegi persegi = new Persegi();
        persegi.setSisi(5.0f);
        System.out.println ("Luas Persegi: " + persegi.hitungLuas());
        System.out.println ("Keliling Persegi: " + persegi.hitungKeliling());

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPanjang (4.0f);
        persegiPanjang.setLebar   (6.0f);
        System.out.println ("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println ("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJariJari (3.0f);
        System.out.println    ("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println    ("Keliling Lingkaran: " + lingkaran.hitungKeliling());

        Segitiga segitiga = new Segitiga();
        segitiga.setAlas   (4.0f);
        segitiga.setTinggi (5.0f);
        segitiga.setSisi1  (3.0f);
        segitiga.setSisi2  (4.0f);
        segitiga.setSisi3  (5.0f);
        System.out.println ("Luas Segitiga: " + segitiga.hitungLuas());
        System.out.println ("Keliling Segitiga: " + segitiga.hitungKeliling());
    }
}
