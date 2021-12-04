package com.exam.jspservlet.dao;


import com.exam.jspservlet.entity.EmployeeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class EmployeeDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();

    public List<EmployeeEntity> getAllEmployee(){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<EmployeeEntity> listEmp = em.createQuery("select p from EmployeeEntity p").getResultList();
        em.getTransaction().commit();
        em.close();
        return listEmp;
    }

    public void addEmployee(EmployeeEntity employee){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();
        em.close();
    }
}
