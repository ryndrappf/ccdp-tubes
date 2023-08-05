package TemplateMethodPattern;

public class HargaEmasDiskon extends HargaEmasTemplate {

    private Double diskon;

    public HargaEmasDiskon(Double diskon) {
        this.diskon = diskon;
    }

    @Override
    protected Integer hitungHarga(Integer berat) {
        // Menghitung harga emas setelah dikenakan diskon
        Integer hargaSebelumDiskon = (int) (berat * HargaEmasTemplate.harga);
        Integer hargaDiskon = (int) (hargaSebelumDiskon * (1 - diskon));
        return hargaDiskon;
    }
}

