package oop51;

public class Main {

	public static void main(String[] args) {
		IReport P_Report = new PeopleReport();
		IReport PM25_Report = new PM25Report();
		IReport W_Report = new WeatherReport();
		System.out.println(P_Report.getReport());
		System.out.println(PM25_Report.getReport());
		System.out.println(W_Report.getReport());
	}
}
