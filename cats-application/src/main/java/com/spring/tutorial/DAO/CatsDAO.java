package com.spring.tutorial.DAO;

import com.spring.tutorial.model.Cat;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
import java.util.List;

/**
 * Created by HD29QN on 2017-02-22.
 */
@Component
@Repository
public class CatsDAO {

//    @PersistenceContext
//    EntityManager entityManager;

    public CatsDAO() {
    }
//
//
//    @Transactional
//    public void addCatToDB(Cat cat) {
//        entityManager.persist(cat);
//    }
//
//
//    @Transactional
//    public List<String> getAllCatNamesFromDB(){
//
//        Query getAllCats = entityManager.createNativeQuery("SELECT c.name FROM Cat c");
//        List<String> catsFromDb = getAllCats.getResultList();
//
//        return catsFromDb;
//
//    }
//
//
//    public Cat getCatByNameFromDB(String catName) {
//
//        @SuppressWarnings("JpaQlInspection")
//        Query getCatByNameFromDB  = entityManager.createQuery("SELECT c.id FROM Cat c WHERE c.name = :catName")
//                .setParameter("catName",catName);
//        List<Integer> resultFromDB = getCatByNameFromDB.getResultList();
//
//        int catIndexFromQuery = resultFromDB.get(0);
//        Cat detailedCat = entityManager.find(Cat.class, catIndexFromQuery);
//
//        return detailedCat;
//
//    }
//
//
//    @Transactional
//    public boolean deleteCatByNameFromDB(String catName){
//
//        Query deleteCat = entityManager.createQuery("DELETE FROM Cat c WHERE c.name = :catNameParameter")
//                .setParameter("catNameParameter", catName);
//        int amoutOfDeletedCats = deleteCat.executeUpdate();
//
//        if (amoutOfDeletedCats > 0){
//            return true;
//        }
//        else{
//            return false;
//        }
//
//    }

}
