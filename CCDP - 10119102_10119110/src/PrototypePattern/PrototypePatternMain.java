package PrototypePattern;

public class PrototypePatternMain {

    private static Integer hitungHargaEmas(Integer gram) {
        return gram * Emas.getHarga().intValue();
    }

    public static void main(String[] args) {
        // Membuat objek Emas asli
        Emas emasAsli = new Emas(1);

        // Kloning objek Emas dengan benar
        Emas emasClone = emasAsli.clone();

        // Mengubah nilai atribut pada objek clone
        emasClone.setBerat(5);

        // Output
        System.out.println("Objek Emas Asli - Berat: " + emasAsli.getBerat() + " Gram, Harga: Rp. " + hitungHargaEmas(emasAsli.getBerat()));
        System.out.println("Objek Emas Klon - Berat: " + emasClone.getBerat() + " Gram, Harga: Rp. " + hitungHargaEmas(emasClone.getBerat()));

    }

}










