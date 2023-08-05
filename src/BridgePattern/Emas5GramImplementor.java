package BridgePattern;

public class Emas5GramImplementor implements EmasImplementor{
    @Override
    public double hitungHarga(double berat) {
        return 1000000 * berat - (1000000 * (5 * 0.025));
    }
}
