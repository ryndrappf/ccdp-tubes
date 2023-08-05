package DecoratorPattern;

public class Emas implements HargaEmas {

    private static final Double harga = 1078000.0;

    @Override
    public Integer hitungHargaEmas(Integer berat) {
        return (int) (berat * harga);
    }
}

