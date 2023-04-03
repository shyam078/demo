package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import com.jsp.dto.StudentDemo;

@Component
public class StudentDemoDao {

	public StudentDemo saveStudentDemo(StudentDemo demo)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dbinfo");
		EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.persist(demo);
		transaction.commit();
		return demo;
	}
}
