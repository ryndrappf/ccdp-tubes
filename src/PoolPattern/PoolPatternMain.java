package PoolPattern;

public class PoolPatternMain {
    public static void main(String[] args) {
        PembelianEmasPool pembelianEmasPool = new PembelianEmasPool();

        double berat1Gram = 2;
        double berat5Gram = 1.5;
        double berat10Gram = 0.75;

        PembelianEmas pembelianEmas1Gram = pembelianEmasPool.acquirePembelianEmas(berat1Gram,  1000000 * 1 - (1000000 * (5 * 0.025)));
        PembelianEmas pembelianEmas5Gram = pembelianEmasPool.acquirePembelianEmas(berat5Gram, 1000000 * 5 - (1000000 * (5 * 0.025)));
        PembelianEmas pembelianEmas10Gram = pembelianEmasPool.acquirePembelianEmas(berat10Gram, 1000000 * 10 - (1000000 * (10 * 0.025)));

        double harga1Gram = pembelianEmas1Gram.getHarga();
        double harga5Gram = pembelianEmas5Gram.getHarga();
        double harga10Gram = pembelianEmas10Gram.getHarga();

        pembelianEmasPool.releasePembelianEmas(pembelianEmas1Gram);
        pembelianEmasPool.releasePembelianEmas(pembelianEmas5Gram);
        pembelianEmasPool.releasePembelianEmas(pembelianEmas10Gram);

        System.out.println("Harga pembelian emas 1 gram: " + harga1Gram + " Rupiah");
        System.out.println("Harga pembelian emas 5 gram: " + harga5Gram + " Rupiah");
        System.out.println("Harga pembelian emas 10 gram: " + harga10Gram + " Rupiah");
    }
}
