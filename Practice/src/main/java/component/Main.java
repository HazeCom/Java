package component;

public class Main {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
//		studentDao.add(new Student(2,"Raju","abc",400));
		studentDao.getName(1);
		studentDao.updateMarks(20, 1);
	}
	

}
