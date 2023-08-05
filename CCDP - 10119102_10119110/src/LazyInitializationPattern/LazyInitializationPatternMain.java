package LazyInitializationPattern;

public class LazyInitializationPatternMain {

    public static void main(String[] args) {
        // Memanggil metode hitungHargaEmas() menggunakan singleton instance
        HargaEmasLazy hargaEmasLazy = HargaEmasLazy.getInstance();
        Integer berat = 1;
        System.out.println("Harga Emas - Berat: " + berat + " Gram, Harga: Rp. " + hargaEmasLazy.hitungHargaEmas(berat));

        // Memanggil metode hitungHargaEmas() lagi
        berat = 5;
        System.out.println("Harga Emas - Berat: " + berat + " Gram, Harga: Rp. " + hargaEmasLazy.hitungHargaEmas(berat));
    }
}

