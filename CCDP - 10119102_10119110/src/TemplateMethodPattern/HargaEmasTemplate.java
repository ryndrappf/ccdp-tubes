package TemplateMethodPattern;

public abstract class HargaEmasTemplate {

    static final Double harga = 1078000.0;

    // Metode getter untuk mengakses atribut 'harga'
    protected static Double getHarga() {
        return harga;
    }

    public Integer hitungHargaEmas(Integer berat) {
        Integer hargaEmas = hitungHarga(berat);
        System.out.println("Harga Emas - Berat: " + berat + " Gram, Harga: Rp. " + hargaEmas);
        return hargaEmas;
    }

    // Langkah-langkah perhitungan harga emas yang harus diimplementasikan oleh subkelas
    protected abstract Integer hitungHarga(Integer berat);
}

