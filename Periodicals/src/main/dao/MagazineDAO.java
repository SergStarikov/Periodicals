package main.dao;

import main.entities.Category;
import main.entities.Magazine;

import java.util.List;

public interface MagazineDAO {
    List<Magazine> findAllMagazines();
    List<Category> findAllCategories();
    List<Magazine> searchMagazinesByKeyword(String keyWord);
    void insert(Magazine magazine);
    void update(Magazine magazine);
    void delete(Long magazineId);
}
