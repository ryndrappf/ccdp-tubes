package StatePattern;

public class MakePaymentState implements State{
    private PembelianEmasContext context;

    public MakePaymentState(PembelianEmasContext context) {
        this.context = context;
    }

    @Override
    public void choosePecahan() {
        System.out.println("Anda telah memilih pecahan emas sebelumnya.");
    }

    @Override
    public void inputBerat(double berat) {
        System.out.println("Anda telah memasukkan berat emas sebelumnya.");
    }

    @Override
    public void makePayment() {
        double totalHarga = context.getBerat() * (1000000 * context.getDiskon());
        System.out.println("Anda telah membayar sebesar " + totalHarga + " Rupiah.");
        System.out.println("Pembelian emas selesai.");
        context.reset();
    }
}
