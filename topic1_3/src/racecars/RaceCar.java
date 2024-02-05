package racecars;

import car.Car;

public class RaceCar extends Car {
	
	private boolean spoiler;
	private String suspensionType;
	private String tireType;
	private int horsePower;
	
	public RaceCar() {
		//Call the constructor of the superclass (Car)
		super();
		this.spoiler = true;
		this.suspensionType = "Racing";
		this.tireType = "High-Performance";
		this.horsePower = 700;
	}
	
	public void deploySpoiler() {
		System.out.println("Spoiler deployed");
	}
	
	public void tuneEngine() {
		System.out.println("Engine tuned for racing with " + horsePower + " horsepower!");
	}
	
	@Override
	public void run() {
		//invoke the run method of the superclass
		super.run();
		System.out.println("Race car is speeding up!");
	}

	public boolean isSpoiler() {
		return spoiler;
	}

	public void setSpoiler(boolean spoiler) {
		this.spoiler = spoiler;
	}

	public String getSuspensionType() {
		return suspensionType;
	}

	public void setSuspensionType(String suspensionType) {
		this.suspensionType = suspensionType;
	}

	public String getTireType() {
		return tireType;
	}

	public void setTireType(String tireType) {
		this.tireType = tireType;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	
}
