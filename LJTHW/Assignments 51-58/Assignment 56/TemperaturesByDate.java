import java.util.Scanner;

class TemperatureSample {
	int month, day, year;
	double temperature;
}

public class TemperaturesByDate {
	public static void main(String[] args) throws Exception {

		String url = "http://academic.udayton.edu/kissock/http/Weather/gsod95-current/ORPORTLA.txt";
		Scanner inFile = new Scanner ((new java.net.URL(url)).openStream());
		Scanner keyboard = new Scanner(System.in);

		TemperatureSample[] tempDB = new TemperatureSample[10000];
		int numRecords, i = 0;

		while ( inFile.hasNextInt() && i < tempDB.length ) {
			TemperatureSample e = new TemperatureSample();
			e.month = inFile.nextInt();
			e.day = inFile.nextInt();
			e.year = inFile.nextInt();
			e.temperature = inFile.nextDouble();
			if ( e.temperature == -99 )
				continue;
			tempDB[i] = e;
			i++;
		}
		inFile.close();
		numRecords = i;

		System.out.println(numRecords + " daily temperature records from Portland, Oregon loaded.");

		double total = 0, avg;
		int count = 0;

		System.out.print("Average temperature of which month? (1-12):  ");
		int mon = keyboard.nextInt();
		for ( i = 0; i < numRecords; i++ ) {
			if ( tempDB[i].month == mon ) {
				total += tempDB[i].temperature;
				count++;
			}
		}

		avg = total / count;
		avg = roundToOneDecimal(avg);
		System.out.println("Average daily temperature over " + count + " days in " + monthName(mon) + ":  " + avg);

		// TemperatureSample ts = tempDB[3];
		// System.out.println( ts );
	}
	public static double roundToOneDecimal (double d){
		return Math.round(d*10)/10.0;
	}


	public static String monthName(int mon) {
	String monthName = "error";

	if (mon == 1) {
		monthName = "January";
	} else if (mon == 2) {
		monthName = "February";
	} else if (mon == 3) {
		monthName = "March";
	} else if (mon == 4) {
		monthName = "April";
	} else if (mon == 5) {
		monthName = "May";
	} else if (mon == 6) {
		monthName = "June";
	} else if (mon == 7) {
		monthName = "July";
	} else if (mon == 8) {
		monthName = "August";
	} else if (mon == 9) {
		monthName = "September";
	} else if (mon == 10) {
		monthName = "October";
	} else if (mon == 11) {
		monthName = "November";
	} else if (mon == 12) {
		monthName = "December";
	}
	return monthName;
	}
}