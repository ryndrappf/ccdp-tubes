package StrategyPattern;

public class MainStrategyPattern {

    public static void main(String[] args) {
        PembelianContext pembelianContext = new PembelianContext();

        pembelianContext.setPembelianEmas(new Beli1Gram());
        pembelianContext.beliGramEmas();

        pembelianContext.setPembelianEmas(new Beli5Gram());
        pembelianContext.beliGramEmas();

    }
}
