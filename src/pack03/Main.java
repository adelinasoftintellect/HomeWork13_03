package pack03;

public class Main {

	public static void main(String args[]) {
		T1 t = new T1();
		Thread t1 = new Thread() {
			public void run() {
				t.printNums();
			}
		};
		t1.start();

		new Thread() {
			public void run() {
				t.ptintRunning();
			}
		}.start();

	}
}
