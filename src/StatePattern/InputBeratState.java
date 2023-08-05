package StatePattern;

public class InputBeratState implements State{

    private PembelianEmasContext context;

    public InputBeratState(PembelianEmasContext context) {
        this.context = context;
    }

    @Override
    public void choosePecahan() {
        System.out.println("Anda telah memilih pecahan emas sebelumnya.");
    }

    @Override
    public void inputBerat(double berat) {
        context.setBerat(berat);
        System.out.println("Berat emas telah dimasukkan.");
    }

    @Override
    public void makePayment() {
        System.out.println("Anda belum memilih pecahan emas.");
    }
}
