package advanced;

class MyCode implements Runnable {
	@Override
	public void run() {
		System.out.println("In Thread!!!!");
	}
}

public class LambdaDemo {

	public static void numbers() {
		for (int i = 1; i <= 5; i++)
			System.out.println(i);
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyCode());
		t1.start();

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("In Thread2!!!!");
			}
		});
		t2.start();

		// Lambda Expression
		Thread t3 = new Thread(() -> System.out.println("In Thread3 !!!"));
		t3.start();

		// Lambda Block
		Thread t4 = new Thread(() -> {
			for (int i = 1; i <= 5; i++)
				System.out.println(i);
		});
		t4.start();

		// Method Reference
		Thread t5 = new Thread(LambdaDemo::numbers);
		t5.start();
	}

}
