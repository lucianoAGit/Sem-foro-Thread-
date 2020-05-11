public class Semaphore {
    private int count = 0;
    public Semaphore(int valor_inicial) {
	count = valor_inicial;
	}
	public synchronized void down() {
		if (count <= 0)
			try { // esperar até que count > 0
                            wait();
			} catch (InterruptedException e) { }
		count--;
        }
	public synchronized void up() {
		count++;
		notify(); // acordar as threads que estiverem em espera 
	}
}
