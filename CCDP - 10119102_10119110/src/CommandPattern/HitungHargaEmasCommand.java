package CommandPattern;

public class HitungHargaEmasCommand implements Command {

    private HargaEmasReceiver hargaEmasReceiver;
    private Integer berat;

    public HitungHargaEmasCommand(HargaEmasReceiver hargaEmasReceiver, Integer berat) {
        this.hargaEmasReceiver = hargaEmasReceiver;
        this.berat = berat;
    }

    @Override
    public void execute() {
        hargaEmasReceiver.hitungHargaEmas(berat);
    }
}

