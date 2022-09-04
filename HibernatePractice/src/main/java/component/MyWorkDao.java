package component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;
import java.io.*;

public class MyWorkDao {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyWork");
	private EntityManager em = emf.createEntityManager();
	void add(MyWork data) {
		em.getTransaction().begin();
		em.persist(data);
		em.getTransaction().commit();
	}
	void getDetails() {
		List<MyWork> result = em.createQuery("from MyWork",MyWork.class).getResultList();
		System.out.println(result);
	}
}
