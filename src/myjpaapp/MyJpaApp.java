/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjpaapp;

import javaapp.entities.Staff;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyJpaApp {


    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJpaAppPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Staff staff = new Staff();
        staff.setAge(26);
        staff.setGender("Male");
        staff.setName("Mahesh");
        staff.setSalary(25000);
        em.persist(staff);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
