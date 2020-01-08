package jpaCustomer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CustomerDAO {
	private EntityManager entityManager;
	private EntityManagerFactory factory; 
	
	public CustomerDAO(){
		factory = Persistence.createEntityManagerFactory("JPA-PU");
		entityManager = factory.createEntityManager();
	}
	
	public Customer getCustomerById(int id){
		Customer customer = entityManager.find(Customer.class, id);
		return customer;
	}
	
	public void addCustomer(Customer customer){
		beginTransaction();
		entityManager.persist(customer);
		commitTransaction();	
	}

	public void removeCustomer(Customer customer){
		beginTransaction();
		entityManager.remove(customer);
		commitTransaction();	
	}

	public void updateCustomer(Customer customer){
		beginTransaction();
		entityManager.merge(customer);
		commitTransaction();	
	}

	public void beginTransaction(){
		entityManager.getTransaction().begin();
	}
	
	public void commitTransaction(){
		entityManager.getTransaction().commit();
	}

}