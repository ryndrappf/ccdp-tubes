package DecoratorPattern;

public class HargaEmasPajak extends HargaEmasDecorator {

    private Double pajak;

    public HargaEmasPajak(HargaEmas decoratedHargaEmas, Double pajak) {
        super(decoratedHargaEmas);
        this.pajak = pajak;
    }

    @Override
    public Integer hitungHargaEmas(Integer berat) {
        // Menghitung harga emas setelah dikenakan pajak
        Integer hargaSebelumPajak = super.hitungHargaEmas(berat);
        Integer hargaPajak = (int) (hargaSebelumPajak * (1 + pajak));
        return hargaPajak;
    }
}

