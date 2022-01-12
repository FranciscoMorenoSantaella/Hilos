
public class Ejecutable	 {
	public static void main(String[] args) throws InterruptedException {
		Well w1 = new Well(32);
		
		//Creamos los hilos
		Pipe p1 = new Pipe(1,16);
		Thread h1 = new Thread(p1);
		Pipe p2 = new Pipe(2,10);
		Thread h2 = new Thread(p2);
		Pipe p3 = new Pipe(3,7);
		Thread h3 = new Thread(p3);
		Pipe p4 = new Pipe(w1,4,20);
		Pipe p5 = new Pipe(w1,5,14);
		Thread h4 = new Thread(p4);
		Thread h5 = new Thread(p5);
		
		//Iniciamos los hilos con join para que se ejecute uno y cuando dicho hilo acabe pase al siguiente
		h1.start();
		h1.join();
		h2.start();
		h2.join();
		h3.start();
		h3.join();
		h4.start();
		h4.join();
		h5.start();
		h5.join();
		System.out.println("----------------------------------------");
		
		
	}
		
}
