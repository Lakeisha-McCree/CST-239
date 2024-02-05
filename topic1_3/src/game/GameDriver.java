package game;

import car.Car;
import car.Engine;
import car.Tire;

public class GameDriver {

	public static void main(String[] args) {
		Car myCar = new Car();
		Engine myEngine = new Engine();
		Tire[] myTires = { new Tire(), new Tire(), new Tire(), new Tire() };
	
		//Set tire pressure 
		for (Tire tire : myTires) {
			tire.setPressure(70);
		}
		
		//Before starting the engine, check the tire pressure
		boolean allTiresOK = true;
		for (Tire tire : myTires) {
			if (!tire.checkPressure()) {
				allTiresOK = false;
				break;
			}
		}
		
		if (allTiresOK) {
			myCar.start();
			myEngine.start();
			myCar.run();
			myCar.stop();
			myCar.restart();
		} else {
			System.out.println("Cannot start the car. Insufficient tire pressure.");
		}
	}

}
