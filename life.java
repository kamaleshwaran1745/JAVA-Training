import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;  
import java.util.Scanner;

class life {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDateTime now = LocalDateTime.now();
        LocalDate today = now.toLocalDate();

        System.out.println("Now: " + now);
        System.out.println("Today: " + today);

        System.out.println("Enter DOB (dd-MM-yyyy):");
        String dobstr = sc.nextLine();

        LocalDate dob = LocalDate.parse(dobstr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDateTime sd = dob.atStartOfDay();

        System.out.println("DOB (string): " + dobstr);
        System.out.println("DOB (parsed): " + dob);
        System.out.println("Start time: " + sd);
        
        Period p = Period.between(dob, today);
        System.out.println("Age:" + p.getYears());
        
        System.out.println("Born day:" + dob.getDayOfWeek());
        System.out.println("Days lived:" + ChronoUnit.DAYS.between(dob, today));

        // Inline calculations in sysout
        System.out.println("Approx hours slept:" + (ChronoUnit.DAYS.between(dob, today) * 8));
        System.out.println("Approx days sleeping:" + ((ChronoUnit.DAYS.between(dob, today) * 8) / 24));
        System.out.println("Approx months sleeping:" + (((ChronoUnit.DAYS.between(dob, today) * 8) / 24) / 30));
        System.out.println("Approx heartbeats:" + (ChronoUnit.DAYS.between(dob, today) * 24 * 60 * 72));
    }
}
