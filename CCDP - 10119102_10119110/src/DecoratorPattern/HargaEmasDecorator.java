package DecoratorPattern;

public abstract class HargaEmasDecorator implements HargaEmas {

    protected HargaEmas decoratedHargaEmas;

    public HargaEmasDecorator(HargaEmas decoratedHargaEmas) {
        this.decoratedHargaEmas = decoratedHargaEmas;
    }

    @Override
    public Integer hitungHargaEmas(Integer berat) {
        return decoratedHargaEmas.hitungHargaEmas(berat);
    }
}

