package parallel;

public class Mythread extends Thread {
	Mythread(String nom){
		super(nom);
	}
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("i="+i+getName());
		}
	}

}
