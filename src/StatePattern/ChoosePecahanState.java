package StatePattern;

public class ChoosePecahanState implements State{

    private PembelianEmasContext context;

    public ChoosePecahanState(PembelianEmasContext context) {
        this.context = context;
    }

    @Override
    public void choosePecahan() {
        System.out.println("Anda telah memilih pecahan emas.");
    }

    @Override
    public void inputBerat(double berat) {
        System.out.println("Pecahan emas belum dipilih.");
    }

    @Override
    public void makePayment() {
        System.out.println("Anda belum memilih pecahan emas dan beratnya.");
    }
}
