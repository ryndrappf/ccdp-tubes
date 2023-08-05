package RepositoryPattern;

import java.util.List;

public class MainRepositoryPattern {

    private static Integer hitungHargaEmas(Integer gram){
        return gram * 1078000;
    }

    public static void main(String[] args) {
        EmasRepository emasRepository = new DataEmasRepository();

        for (int gram = 1; gram <= 5 ; gram++) {
            Double harga = Double.valueOf(hitungHargaEmas(gram));
            Emas emas = new Emas(gram, harga);
            emasRepository.savePembelian(emas);
        }

        List<Emas> emasList = emasRepository.getAllPembelian();

        for (Emas emas : emasList){
            System.out.println("Berat Emas : " + emas.getGram() + " Gram " + "| Harga Emas : Rp " + emas.getHarga());
        }

        Emas emas5Gram = emasRepository.getPembelianByGram(5);

        if (emas5Gram != null){
            System.out.println("Harga Pembelian Untuk Emas 5 Gram : Rp " + emas5Gram.getHarga());
        }else{
            System.out.println("Pembelian Emas 5 Gram Tidak Ditemukan");
        }
    }
}
