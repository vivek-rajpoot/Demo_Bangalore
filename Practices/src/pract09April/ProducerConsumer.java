package pract09April;

public class ProducerConsumer extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread Run "+i);
		}
	}
	public static void main(String[] args) {
		
		ProducerConsumer t1=new ProducerConsumer();
		ProducerConsumer t2=new ProducerConsumer();
		t1.start();
		t2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread main "+i);
		}
	}
}
