package StatePattern;

public class PembelianEmasContext {

    private State state;
    private double berat;
    private final double diskon = 1 - 0.025;

    public PembelianEmasContext() {
        state = new ChoosePecahanState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void choosePecahan() {
        state.choosePecahan();
    }

    public void inputBerat(double berat) {
        state.inputBerat(berat);
    }

    public void makePayment() {
        state.makePayment();
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getDiskon() {
        return diskon;
    }

    public void reset() {
        setBerat(0);
        setState(new ChoosePecahanState(this));
    }
}
