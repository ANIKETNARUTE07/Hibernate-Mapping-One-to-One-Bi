package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	public static void main(String[] args) {
		
	
	
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("aniket");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	Pan pan = new Pan();
	pan.setPan_no(7896549465l);
	
	Person p= new Person();
	p.setName("amit");
	p.setEmail("amit12@gmail.com");
	p.setPan(pan);
	pan.setPerson(p);
	
	
	entityTransaction.begin();
	entityManager.persist(pan);
	entityManager.persist(p);
	entityTransaction.commit();

}
}
