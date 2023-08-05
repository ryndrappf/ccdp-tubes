package BridgePattern;

public abstract class PembelianEmas {
    protected EmasImplementor implementor;

    public PembelianEmas(EmasImplementor implementor) {
        this.implementor = implementor;
    }

    public abstract double beliEmas(double berat);
}
