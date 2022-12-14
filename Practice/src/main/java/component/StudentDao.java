package component;

import javax.persistence.*;

public class StudentDao {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student");
	private EntityManager em = emf.createEntityManager();
	
	void add(Student student) {
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		System.out.println("Data has been added");
	}
	
	void getName(int roll) {
		Student student = em.find(Student.class,roll);
		if(student!=null) {
			System.out.println(student.getMarks());
		}else
			System.out.println("Sorry did not found");
	}
	
	void updateMarks(int marks, int roll) {
		Student student = em.find(Student.class, roll);
		if(student!=null) {
			em.getTransaction().begin();
			student.setMarks(student.getMarks()+marks);
			em.getTransaction().commit();
		}else {
			System.out.println("no student with the given roll no was found");
		}
	}
	
}
