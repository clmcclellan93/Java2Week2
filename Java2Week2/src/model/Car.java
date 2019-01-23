package model;

public class Car {
	
	private String make;
	private String model;
	private int year;
	private int speed;
	private int gear;
	
	public Car() {
		this.speed = 0;
		this.gear = 0;
	}

	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.speed = 0;
		this.gear = 0;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		try {
			if (year <= 2019 && year >= 1908) {
				this.year = year;
			}
			else throw new Exception("Invalid year");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int getSpeed() {
		return speed;
	}

	public int getGear() {
		return gear;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", speed=" + speed + ", gear=" + gear
				+ "]";
	}
	
	public void accelerate(int acc) {
		try {
			if ((this.speed + acc) <= 200) {
				this.speed += acc;
			}
			else {
				this.speed = 200;
				throw new Exception("Speed cannot go above 200");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void brake(int br) {
		try {
			if ((this.speed - br) >= 0) {
				this.speed -= br;
			}
			else {
				this.speed = 0;
				throw new Exception("Speed cannot go below 0");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void shiftUp() {
		try {
			if (this.gear <= 4) {
				this.gear++;
			}
			else throw new Exception("Gear cannot go above 5");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void shiftDown() {
		try {
			if (this.gear >= 0) {
				this.gear--;
			}
			else throw new Exception("Gear cannot go below -1");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
