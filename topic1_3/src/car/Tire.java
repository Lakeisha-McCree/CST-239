package car;

public class Tire {

	
	private int pressure;
	
	public void setPressure(int pressure) {
		this.pressure = pressure;
		System.out.println("Tire pressure set to: " + pressure + " psi");
	}
	
	public boolean checkPressure() {
		return pressure >= 32;
	}
}
