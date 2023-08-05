package ProxyPattern;

public class HargaEmasProxy implements HargaEmas {

    private Emas emas;

    @Override
    public Integer hitungHargaEmas(Integer berat) {
        // Inisialisasi objek Emas saat dibutuhkan (lazy initialization)
        if (emas == null) {
            emas = new Emas();
        }
        return emas.hitungHargaEmas(berat);
    }
}
