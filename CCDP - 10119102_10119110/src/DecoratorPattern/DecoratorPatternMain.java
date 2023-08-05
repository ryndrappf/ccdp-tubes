package DecoratorPattern;

// Main Class
public class DecoratorPatternMain {

    public static void main(String[] args) {
        // Membuat objek Emas asli
        HargaEmas emas = new Emas();

        // Menambahkan diskon 10%
        HargaEmas emasDiskon = new HargaEmasDiskon(emas, 0.1);

        // Menambahkan pajak 5%
        HargaEmas emasDiskonPajak = new HargaEmasPajak(emasDiskon, 0.05);

        // Menghitung harga emas dengan berat 1 gram
        Integer berat = 1;
        System.out.println("Harga Emas - Berat: " + berat + " Gram, Harga: Rp. " + emas.hitungHargaEmas(berat));
        System.out.println("Harga Emas dengan Diskon - Berat: " + berat + " Gram, Harga: Rp. " + emasDiskon.hitungHargaEmas(berat));
        System.out.println("Harga Emas dengan Diskon dan Pajak - Berat: " + berat + " Gram, Harga: Rp. " + emasDiskonPajak.hitungHargaEmas(berat));
    }
}

