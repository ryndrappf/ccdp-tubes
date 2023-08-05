package BuilderPattern;

public class MainBuilderPattern {

    private static Integer hitungHargaEmas(Integer gram){
        return gram * 1078000;
    }

    public static void main(String[] args) {

        EmasBuilder emasBuilder = new EmasBuilder();

        Emas emas1 = emasBuilder.setGram(5).
                setHarga(Double.valueOf(hitungHargaEmas(5)))
                .build();
        Emas emas2 = emasBuilder.setGram(1)
                .setHarga(Double.valueOf(hitungHargaEmas(1)))
                .build();

        System.out.println("Pembelian Emas :");
        System.out.println("Berat Emas : " + emas1.getGram() + " Gram " + "| Harga Emas : Rp " + emas1.getHarga());
        System.out.println("Berat Emas : " + emas2.getGram() + " Gram " + "| Harga Emas : Rp " + emas2.getHarga());
    }


}
