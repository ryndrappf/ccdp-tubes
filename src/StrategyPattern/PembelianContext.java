package StrategyPattern;

public class PembelianContext {

    private PembelianEmas pembelianEmas;

    public void setPembelianEmas(PembelianEmas pembelianEmas) {
        this.pembelianEmas = pembelianEmas;
    }

    public void beliGramEmas(){
        if (pembelianEmas != null){
            pembelianEmas.beliEmas();
        }else{
            System.out.println("Tidak Ada Pembelian Emas");
        }
    }
}
