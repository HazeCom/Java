package component;

public class Main {
	public static void main(String[] args) {
		MyWorkDao dao = new MyWorkDao();
		dao.add(new MyWork(11,"Arjun","XYZ"));
		dao.getDetails();
	}
}
