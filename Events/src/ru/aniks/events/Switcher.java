package ru.aniks.events;

import java.util.ArrayList;

public class Switcher {
	
	private ArrayList<ElectricityListener> el = new ArrayList<ElectricityListener>();
	
	public void addElectricityListener(ElectricityListener l) {
		el.add(l);
	}
	
	public void removeElectricityListener(ElectricityListener l) {
		el.remove(l);
	}	
	
	public void switchOn() {
		System.out.println("On");
		for(ElectricityListener l : el){
			l.electricity(this);
		}
	}

}
