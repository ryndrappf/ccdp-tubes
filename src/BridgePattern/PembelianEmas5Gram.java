package BridgePattern;

public class PembelianEmas5Gram extends PembelianEmas{

    public PembelianEmas5Gram(EmasImplementor implementor) {
        super(implementor);
    }

    @Override
    public double beliEmas(double berat) {
        return implementor.hitungHarga(berat);
    }
}
