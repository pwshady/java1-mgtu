package ru.aniks.nested;

import java.util.ArrayList;

public class Invoice {
	
	private double total = 0;
	private String customer;
	private ArrayList<Line> lines = new ArrayList<Line>();

	
	public String getCustomer() {
		return customer;
	}


	public double getTotal() {
		return total;
	}


	public void setCustomer(String customer) {
		this.customer = customer;
	}


	public Invoice(String customer) {
		super();
		setCustomer(customer);
	}
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%-30s : %8.2f", getCustomer(), getTotal())).append("\n-------------\n");
		for(Line l : lines) {
			sb.append(l.toString()).append("\n");
		}
		return sb.toString();
	}
	
	public class Line{
		
		private String good;
		private double price;
		private int quantity;
		private double summa;
		
		public String getGood() {
			return good;
		}
		
		public void setGood(String good) {
			this.good = good;
		}
		
		public double getPrice() {
			return price;
		}
		
		public void setPrice(double price) {
			this.price = price;
			updateSumma();
		}
		
		public int getQuantity() {
			return quantity;
		}
		
		public void setQuantity(int quantity) {
			this.quantity = quantity;
			updateSumma();
		}
		
		public double getSumma() {
			return summa;
		}

		public Line(String good, double price, int quantity) {
			setGood(good);
			setPrice(price);
			setQuantity(quantity);
			updateSumma(true);
			lines.add(this);
		}
		
		private void updateSumma()
		{
			updateSumma(false);
		}
		
		private void updateSumma(boolean isNew) {
			if (isNew) {				
				total -= summa;
			}
			summa = price * quantity;
			total += summa;
		}
		
		@Override
		public String toString() {
			return String.format("%-20s %6.2f %4d %7.2f", getGood(), getPrice(), getQuantity(), getSumma());
		}
		
		
	}
	
}
