package BridgePattern;

public class BridgePatternMain {
    public static void main(String[] args) {

        EmasImplementor emas1Gram = new Emas1GramImplementor();
        EmasImplementor emas5Gram = new Emas5GramImplementor();
        EmasImplementor emas10Gram = new Emas10GramImplementor();

        PembelianEmas pembelianEmas1Gram = new PembelianEmas1Gram(emas1Gram);
        PembelianEmas pembelianEmas5Gram = new PembelianEmas5Gram(emas5Gram);
        PembelianEmas pembelianEmas10Gram = new PembeliasEmas10gram(emas10Gram);

        double berat1Gram = 1;
        double berat5Gram = 5;
        double berat10Gram = 10;

        double harga1Gram = pembelianEmas1Gram.beliEmas(berat1Gram);
        double harga5Gram = pembelianEmas5Gram.beliEmas(berat5Gram);
        double harga10Gram = pembelianEmas10Gram.beliEmas(berat10Gram);

        System.out.println("Harga Pembelian Emas 1 Gram : " + harga1Gram);
        System.out.println("Harga Pembelian Emas 5 Gram : " + harga5Gram);
        System.out.println("Harga Pembelian Emas 10 Gram : " + harga10Gram);
    }
}
