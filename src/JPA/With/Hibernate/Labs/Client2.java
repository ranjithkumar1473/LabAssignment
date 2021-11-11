package JPA.With.Hibernate.Labs;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Client2 {
	
	public static void main(String[] args) {
		
		 System.out.println("start");
		 
		 EntityManagerFactory emf= Persistence.createEntityManagerFactory("abcd");
		 EntityManager em = emf.createEntityManager();
		 EntityTransaction tr= em.getTransaction();
		 
		 tr.begin();
		// Author au= new Author(101, "Sonu","monu","Gonu", 777777777);
			//em.persist(au);
			 Author au2= new Author(109, "Ponu","Kumar","G", 989899888);
			//	em.persist(au2);
				
				au2.setMiddleName("yes");
				em.merge(au2);
				
			tr.commit();

			 
			 System.out.println("end");

}
}