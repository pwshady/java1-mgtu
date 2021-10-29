package ru.aniks.events;

public class Lamp implements ElectricityListener{

	@Override
	public void electricity(Object sourse) {
		System.out.println("Lamp ON");
	}
}
