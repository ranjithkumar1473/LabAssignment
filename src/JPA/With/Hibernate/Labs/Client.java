package JPA.With.Hibernate.Labs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("abcd");
		EntityManager em = factory.createEntityManager();
		
		 EntityTransaction tr= em.getTransaction();
		 
		 tr.begin();
		
		Greet greet = new Greet();
		greet.setMessage("Welcome to JPA!");
		
		em.persist(greet);
		
		System.out.println("Added greeting to database.");

		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}