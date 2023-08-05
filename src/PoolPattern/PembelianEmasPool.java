package PoolPattern;

import java.util.ArrayList;
import java.util.List;

public class PembelianEmasPool {
    private static final int POOL_SIZE = 10;
    private List<PembelianEmas> pool;

    public PembelianEmasPool() {
        pool = new ArrayList<>();
        for (int i = 0; i < POOL_SIZE; i++) {
            pool.add(createNewPembelianEmas());
        }
    }

    public PembelianEmas acquirePembelianEmas(double berat, double harga) {
        if (pool.isEmpty()) {
            return createNewPembelianEmas(berat, harga);
        } else {
            PembelianEmas pembelianEmas = pool.remove(0);
            pembelianEmas = resetPembelianEmas(pembelianEmas, berat, harga);
            return pembelianEmas;
        }
    }

    public void releasePembelianEmas(PembelianEmas pembelianEmas) {
        if (pool.size() < POOL_SIZE) {
            pool.add(pembelianEmas);
        }
    }

    private PembelianEmas createNewPembelianEmas() {
        return new PembelianEmas(0, 0);
    }

    private PembelianEmas createNewPembelianEmas(double berat, double harga) {
        return new PembelianEmas(berat, harga);
    }

    private PembelianEmas resetPembelianEmas(PembelianEmas pembelianEmas, double berat, double harga) {
        pembelianEmas.setBerat(berat);
        pembelianEmas.setHarga(harga);
        return pembelianEmas;
    }
}
