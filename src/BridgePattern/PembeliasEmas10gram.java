package BridgePattern;

public class PembeliasEmas10gram extends PembelianEmas{

    public PembeliasEmas10gram(EmasImplementor implementor) {
        super(implementor);
    }

    @Override
    public double beliEmas(double berat) {
        return implementor.hitungHarga(berat);
    }
}
