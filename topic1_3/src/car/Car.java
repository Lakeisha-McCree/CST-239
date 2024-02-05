package car;

public class Car {

	private int speed;
	
	public void start() {
		System.out.println("Car started");
	}
	
	public void run() {
		//value is set between 1 and 60 mph
		this.speed = 55;
		System.out.println("Car running at " + speed + " mph");
	}
	
	public void stop() {
		System.out.println("Car stopped");
	}
	
	public void restart() {
		System.out.println("Car restarted");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
