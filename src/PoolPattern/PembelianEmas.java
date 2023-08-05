package PoolPattern;

public class PembelianEmas {

    private double berat;
    private double harga;

    public PembelianEmas(double berat, double harga) {
        this.berat = berat;
        this.harga = harga;
    }

    public double getBerat() {
        return berat;
    }

    public double getHarga() {
        return harga;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
