package CommandPattern;

public class HargaEmasReceiver {

    private static final Double harga = 1078000.0;

    public void hitungHargaEmas(Integer berat) {
        Integer hargaEmas = (int) (berat * harga);
        System.out.println("Emas - Berat: " + berat + " Gram, Harga: Rp. " + hargaEmas);
    }
}

