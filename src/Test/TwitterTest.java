/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Model.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Maxime
 */
public class TwitterTest {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TwitterPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        Person person = new Person();
        person.setLogin("Maxoo63");
        person.setName("Maxime CHAUVET");
        person.setPassword("maxoo");
        
        tx.begin();
        em.persist(person);
        tx.commit();
        
        em.close();
        emf.close();
    }
}
