package BuilderPattern;

public class EmasBuilder {

    private Integer gram;

    private Double harga;

    public EmasBuilder setGram(Integer gram) {
        this.gram = gram;
        return this;
    }

    public EmasBuilder setHarga(Double harga) {
        this.harga = harga;
        return this;
    }

    public Emas build() {
        return new Emas(gram, harga);
    }
}
