package PrototypePattern;

public class Emas implements Cloneable {

    private Integer berat;
    private static final Double harga = 1078000.0;

    public Emas(Integer berat) {
        this.berat = berat;
    }

    public Integer getBerat() {
        return berat;
    }

    public void setBerat(Integer berat) {
        this.berat = berat;
    }

    public static Double getHarga() {
        return harga;
    }

    @Override
    public Emas clone() {
        try {
            return (Emas) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
