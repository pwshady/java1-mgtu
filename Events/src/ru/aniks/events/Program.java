package ru.aniks.events;

public class Program {
	
	public static void fireFig(Object sourse) {
		System.out.println("Go Fire");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switcher sw = new Switcher();
		
		Lamp lamp = new Lamp();
		
		AirCondition ac = new AirCondition();
		
		sw.addElectricityListener(lamp);
		/*
		sw.addElectricityListener(
			new ElectricityListener() {
				public void electricity(Object sourse) {
					System.out.println("AHTUNG");
				}
			}
		);*/
		
		sw.addElectricityListener(sourse -> System.out.println("AHTUNG!!!!"));
		sw.addElectricityListener(ac::on);
		sw.addElectricityListener(e -> Program.fireFig(e));
					
		sw.switchOn();
	}

}
