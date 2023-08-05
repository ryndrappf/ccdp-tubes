package RepositoryPattern;

import RepositoryPattern.Emas;

import java.util.List;

public interface EmasRepository {

    void savePembelian(Emas emas);

    List<Emas> getAllPembelian();

    Emas getPembelianByGram(Integer gram);

}
