//package com.mediatheque.serviceTest;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.EntityNotFoundException;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.mediatheque.entity.Emprunt;
//import com.mediatheque.entity.Items;
//import com.mediatheque.entity.User;
//import com.mediatheque.service.EmpruntLimitReachedException;
//import com.mediatheque.service.EmpruntService;
//import com.mediatheque.service.ItemsNotAvailableException;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.fail;
//
//@SpringBootTest
//public class EmpruntServiceTest {
//    @Autowired
//    EmpruntService empruntService;
//
//    @Test
//    void testeffectuerEmprunt() throws EmpruntLimitReachedException, ItemsNotAvailableException, EntityNotFoundException{
//        User user = new User();
//        user.setId((long) 2);
//
//        Set<Items> empruntUtilisateur = new HashSet<>();
//        Items item1 = new Items();
//        item1.setId(2L);
//        empruntUtilisateur.add(item1);
//
//        Items item2 = new Items();
//        item2.setId(3L);
//        empruntUtilisateur.add(item2);
//
//        Emprunt emprunt = empruntService.effectuerEmprunt(user.getId(), empruntUtilisateur);
//        assertEquals(2,emprunt.getItems().size());
//    }
//}