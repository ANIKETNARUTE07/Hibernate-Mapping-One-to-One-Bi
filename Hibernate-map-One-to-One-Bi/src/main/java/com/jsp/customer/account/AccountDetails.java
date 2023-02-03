package com.jsp.customer.account;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AccountDetails {
	public static void main(String[] args) {
		
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("aniket");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	Customer customer= new Customer();
	customer.setName("milind");
	customer.setAdhaarno(789654123);
	customer.setEmail("milind@gmail.com");
	
	
	
	Account account= new Account();
	account.setAccount_no(12457821);
	account.setCustomer(customer);
	customer.setAccount(account);
	
	
	entityTransaction.begin();
	entityManager.persist(customer);
	entityManager.persist(account);
	entityTransaction.commit();
	System.out.println("all good");

}
}