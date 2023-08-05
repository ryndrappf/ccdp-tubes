package BridgePattern;

public class Emas1GramImplementor implements EmasImplementor{
    @Override
    public double hitungHarga(double berat) {
        return 1000000 * berat - (1000000 * (1 * 0.025));
    }
}
