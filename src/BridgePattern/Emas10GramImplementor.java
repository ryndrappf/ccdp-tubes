package BridgePattern;

public class Emas10GramImplementor implements EmasImplementor{
    @Override
    public double hitungHarga(double berat) {
        return 1000000 * berat - (1000000 * (10 * 0.025));
    }
}
