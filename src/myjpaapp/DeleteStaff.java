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

/**
 *
 * @author MAHESH
 */
public class DeleteStaff {
            public static void main(String args[]){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJpaAppPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Staff staff = em.find(Staff.class,1);
        System.out.println("Removing Staff with name : "+staff.getName());
        em.remove(staff);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
