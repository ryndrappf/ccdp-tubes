package CommandPattern;

public class CommandPatternMain {

    public static void main(String[] args) {
        // Membuat objek HargaEmasReceiver (receiver)
        HargaEmasReceiver receiver = new HargaEmasReceiver();

        // Membuat objek perintah (command) dan mengaitkannya dengan receiver
        Command command = new HitungHargaEmasCommand(receiver, 2);

        // Memanggil eksekusi perintah
        command.execute();
    }
}

