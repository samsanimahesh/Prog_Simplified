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
public class UpdateStaff {
        public static void main(String args[]){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJpaAppPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Staff staff = em.find(Staff.class,1);
        System.out.println("Staff name is : "+staff.getName());
        staff.setName("Sample name");
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
