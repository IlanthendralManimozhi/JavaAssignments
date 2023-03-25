package transport;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class TransportLorry {
    private double speed;

    public TransportLorry(double speed) {
        this.speed = speed;
    }

    public LocalTime calculateArrivalTime(LocalDate date, LocalTime time, double distance) {
        LocalDateTime startDateTime = LocalDateTime.of(date, time);
        LocalDateTime endDateTime = startDateTime.plusSeconds((long) (distance / speed * 3600));

        // Check if the driver can drive on the start date
        if (!canDrive(startDateTime.toLocalDate())) {
            startDateTime = getNextDriveDate(startDateTime.toLocalDate());
            endDateTime = startDateTime.plusSeconds((long) (distance / speed * 3600));
        }

        // Check if the driver can drive on the end date
        if (!canDrive(endDateTime.toLocalDate())) {
            endDateTime = getNextDriveDate(endDateTime.toLocalDate());
        }

        return endDateTime.toLocalTime();
    }
    public LocalDate calculateArrivalDate(LocalDate date, LocalTime time, double distance) {
        LocalDateTime startDateTime = LocalDateTime.of(date, time);
        LocalDateTime endDateTime = startDateTime.plusSeconds((long) (distance / speed * 3600));

        // Check if the driver can drive on the start date
        if (!canDrive(startDateTime.toLocalDate())) {
            startDateTime = getNextDriveDate(startDateTime.toLocalDate());
            endDateTime = startDateTime.plusSeconds((long) (distance / speed * 3600));
        }

        // Check if the driver can drive on the end date
        if (!canDrive(endDateTime.toLocalDate())) {
            endDateTime = getNextDriveDate(endDateTime.toLocalDate());
        }

        return endDateTime.toLocalDate();
    }
    private boolean canDrive(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.SUNDAY || dayOfWeek == DayOfWeek.SATURDAY) {
            return false;
        }

        if (isPublicHoliday(date)) {
            return false;
        }

        return true;
    }

    private boolean isPublicHoliday(LocalDate date) {
        if (date.getMonthValue() == 1 && date.getDayOfMonth() == 1) {
            return true;
        }

        if (date.getMonthValue() == 8 && date.getDayOfMonth() == 15) {
            return true;
        }

        if (date.getMonthValue() == 1 && date.getDayOfMonth() == 26) {
            return true;
        }

        if (date.getMonthValue() == 2 && date.getDayOfMonth() == 29 && date.isLeapYear()) {
            return true;
        }

        return false;
    }

    private LocalDateTime getNextDriveDate(LocalDate date) {
        while (!canDrive(date)) {
            date = date.plusDays(1);
        }

        return LocalDateTime.of(date, LocalTime.of(8, 0));
    }

    public static void main(String[] args) {
    	double speedGot;
    	int year;
    	int month;
    	int day;
    	int hrs;
    	int min;
    	double distance ; 
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Speed :");
    	speedGot=sc.nextDouble();
    	System.out.println("Enter Year :");
    	year=sc.nextInt();
    	System.out.println("Enter Month :");
    	month=sc.nextInt();
    	System.out.println("Enter Date :");
    	day=sc.nextInt();
    	System.out.println("Enter Time :");
    	hrs=sc.nextInt();
    	min=sc.nextInt();
    	System.out.println("Enter Distance :");
    	distance=sc.nextDouble();
 
        TransportLorry lorry = new TransportLorry(speedGot); // Assume speed is  km/h
        LocalDate date = LocalDate.of(year, month, day); // given value
        LocalTime time = LocalTime.of(10, 0); // given time
        // Assume distance in km

        LocalTime arrivalTime = lorry.calculateArrivalTime(date, time, distance);
        LocalDate arrivalDate=lorry.calculateArrivalDate(date, arrivalTime, distance);
        System.out.println("Arrival at: " +arrivalDate+" "+ arrivalTime);
    }
}
