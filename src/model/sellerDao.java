package model;
import model.entities.Seller;

import java.util.List;

public interface sellerDao {
    void inset (Seller obj);
    void update (Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll ();
}
