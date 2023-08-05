package RepositoryPattern;

import java.util.ArrayList;
import java.util.List;

public class DataEmasRepository implements EmasRepository {

    private List<Emas> emasList;

    public DataEmasRepository() {
        emasList = new ArrayList<>();
    }

    @Override
    public void savePembelian(Emas emas) {
        emasList.add(emas);
    }

    @Override
    public List<Emas> getAllPembelian() {
        return new ArrayList<>(emasList);
    }

    @Override
    public Emas getPembelianByGram(Integer gram) {
        for (Emas emas : emasList){
            if (emas.getGram() == gram){
                return emas;
            }
        }
        return null;
    }
}
