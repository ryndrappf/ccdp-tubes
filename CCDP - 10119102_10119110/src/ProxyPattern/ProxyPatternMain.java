package ProxyPattern;

public class ProxyPatternMain {

    public static void main(String[] args) {
        // Membuat objek HargaEmasProxy sebagai proxy
        HargaEmas hargaEmasProxy = new HargaEmasProxy();

        // Menghitung harga emas dengan berat 1 gram
        Integer berat = 1;
        System.out.println("Harga Emas - Berat: " + berat + " Gram, Harga: Rp. " + hargaEmasProxy.hitungHargaEmas(berat));

        // Menghitung harga emas dengan berat 5 gram
        berat = 5;
        System.out.println("Harga Emas - Berat: " + berat + " Gram, Harga: Rp. " + hargaEmasProxy.hitungHargaEmas(berat));
    }
}

