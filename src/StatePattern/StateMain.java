package StatePattern;

public class StateMain {
    public static void main(String[] args) {
        PembelianEmasContext context = new PembelianEmasContext();

        context.choosePecahan();
        context.inputBerat(2);
        context.makePayment();

        System.out.println();

        context.choosePecahan();
        context.makePayment();

        System.out.println();

        context.inputBerat(1.5);
        context.makePayment();
    }
}
