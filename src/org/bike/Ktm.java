package org.bike;

public class Ktm implements Bike{

	@Override
	public void cost() {
		System.out.println("cost--750000");
		
			}

	@Override
	public void speed() {
		
		System.out.println("speed ----km/hr");
	}

	
	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.cost();
		k.speed();
	}
}
