package BridgePattern;

public class PembelianEmas1Gram extends PembelianEmas {


    public PembelianEmas1Gram(EmasImplementor implementor) {
        super(implementor);
    }

    @Override
    public double beliEmas(double berat) {
        return implementor.hitungHarga(berat);
    }

}
