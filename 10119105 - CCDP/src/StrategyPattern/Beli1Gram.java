package StrategyPattern;

public class Beli1Gram implements PembelianEmas{
    @Override
    public void beliEmas() {
        System.out.println("Berat Emas :  1 Gram " + "| Harga Emas : Rp " + hitungTotal());
    }

    @Override
    public Double hitungTotal() {
        return Double.valueOf(1 * 1078000);
    }
}
