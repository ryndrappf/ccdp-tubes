package DecoratorPattern;

public class HargaEmasDiskon extends HargaEmasDecorator {

    private Double diskon;

    public HargaEmasDiskon(HargaEmas decoratedHargaEmas, Double diskon) {
        super(decoratedHargaEmas);
        this.diskon = diskon;
    }

    @Override
    public Integer hitungHargaEmas(Integer berat) {
        // Menghitung harga emas setelah dikenakan diskon
        Integer hargaSebelumDiskon = super.hitungHargaEmas(berat);
        Integer hargaDiskon = (int) (hargaSebelumDiskon * (1 - diskon));
        return hargaDiskon;
    }
}

