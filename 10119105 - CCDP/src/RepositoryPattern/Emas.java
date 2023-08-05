package RepositoryPattern;

public class Emas {

    private Integer gram;

    private Double harga;

    public Emas(Integer gram, Double harga) {
        this.gram = gram;
        this.harga = harga;
    }

    public Integer getGram() {
        return gram;
    }

    public void setGram(Integer gram) {
        this.gram = gram;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }
}
