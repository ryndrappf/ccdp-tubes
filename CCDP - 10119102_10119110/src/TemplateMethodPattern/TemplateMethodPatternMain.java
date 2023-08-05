package TemplateMethodPattern;

public class TemplateMethodPatternMain {

    public static void main(String[] args) {
        // Membuat objek HargaEmasDefault untuk perhitungan harga emas secara default
        HargaEmasTemplate hargaEmasDefault = new HargaEmasDefault();
        Integer berat = 1;
        hargaEmasDefault.hitungHargaEmas(berat);

        // Membuat objek HargaEmasDiskon untuk perhitungan harga emas dengan diskon 10%
        HargaEmasTemplate hargaEmasDiskon = new HargaEmasDiskon(0.1);
        berat = 5;
        hargaEmasDiskon.hitungHargaEmas(berat);
    }
}
