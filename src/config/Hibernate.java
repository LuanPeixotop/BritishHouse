package config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Hibernate {
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("britishHouse");

	public EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
}
