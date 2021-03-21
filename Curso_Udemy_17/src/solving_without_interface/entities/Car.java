package solving_without_interface.entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Car {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	public String model;
	public Date pickup;
	public Date returning;
	public Double priceHour;
	public Double priceDay;
	
	public Car(String model, Date pickup, Date returning, Double priceHour, Double priceDay) {
		this.model = model;
		this.pickup = pickup;
		this.returning = returning;
		this.priceHour = priceHour;
		this.priceDay = priceDay;
	}
	
	public Car() {
		
	}

	public String getModel() {
		return model;
	}

	public Date getPickup() {
		return pickup;
	}

	public Date getReturning() {
		return returning;
	}

	public Double getPriceHour() {
		return priceHour;
	}

	public void setPriceHour(Double priceHour) {
		this.priceHour = priceHour;
	}

	public Double getPriceDay() {
		return priceDay;
	}

	public void setPriceDay(Double priceDay) {
		this.priceDay = priceDay;
	}
	
	public int rentingTime() {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(pickup);
		c2.setTime(returning);
		int pickupHour = c1.get(Calendar.HOUR_OF_DAY);
		int returnHour = c2.get(Calendar.HOUR_OF_DAY);
		int pickupMinutes = c1.get(Calendar.MINUTE);
		int returnMinutes = c2.get(Calendar.MINUTE);
		int pickupDay = c1.get(Calendar.DAY_OF_MONTH);
		int returnDay = c2.get(Calendar.DAY_OF_MONTH);
		int days = 0;
		
		int hoursElapsed = returnHour - pickupHour;
		int minutesElapsed = returnMinutes - pickupMinutes;
		
		if (hoursElapsed >= 12 || (returnDay > pickupDay)) {
			days++;
			int daysPassed = (returnDay - pickupDay);
			return (days+daysPassed)*24;
		} else {
			int timePassed = hoursElapsed;
			if (minutesElapsed > 0) {
				timePassed++;
			}
			return timePassed;
		}
	}
	
	public Double basicPayment() {
		int timePassed = rentingTime();
		if (timePassed > 12) {
			timePassed /= 24;
			return timePassed * priceDay;
		} else {
			return timePassed * priceHour;
		}
	}
	
	public Double taxPayment() {
		double payment = basicPayment();
		if (payment > 100) {
			return payment * 0.15;
		} else {
			return payment * 0.2;
		}
	}
	
	public Double totalPayment() {
		return basicPayment() + taxPayment();
	}
	
	public String toString() {
		return "INVOICE:" + "\n" + "Basic Payment: " + basicPayment() + "\n" + "Tax: " + taxPayment() + "\n" + "Total Payment: " + totalPayment();
	}
	
	
	


}
