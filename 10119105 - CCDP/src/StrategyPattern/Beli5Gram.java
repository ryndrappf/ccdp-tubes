package StrategyPattern;

public class Beli5Gram implements PembelianEmas {
    @Override
    public void beliEmas() {
        System.out.println("Berat Emas :  5 Gram " + "| Harga Emas : Rp " + hitungTotal());
    }

    @Override
    public Double hitungTotal() {
        return Double.valueOf(5 * 1078000);
    }
}
