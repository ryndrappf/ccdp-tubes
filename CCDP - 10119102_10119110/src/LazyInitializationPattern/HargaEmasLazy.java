package LazyInitializationPattern;

public class HargaEmasLazy {

    private static HargaEmasLazy instance;
    private static final Double harga = 1078000.0;

    private HargaEmasLazy() {
        // Private constructor untuk mencegah instansiasi dari luar kelas.
    }

    public static HargaEmasLazy getInstance() {
        if (instance == null) {
            synchronized (HargaEmasLazy.class) {
                if (instance == null) {
                    instance = new HargaEmasLazy();
                }
            }
        }
        return instance;
    }

    public Integer hitungHargaEmas(Integer berat) {
        return (int) (berat * harga);
    }
}
