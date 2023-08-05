package TemplateMethodPattern;

public class HargaEmasDefault extends HargaEmasTemplate {

    @Override
    protected Integer hitungHarga(Integer berat) {
        return (int) (berat * HargaEmasTemplate.harga);
    }
}
