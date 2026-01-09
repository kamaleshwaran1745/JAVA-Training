import java.util.Scanner;

class testcase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String season = sc.nextLine();

        switch (season.toLowerCase()) {   // normalize input
            case "january", "february", "march", "jan", "feb", "mar" -> 
                System.out.println("Winter");

            case "april", "may", "june" -> 
                System.out.println("Summer");

            case "july", "august", "september" -> 
                System.out.println("Spring");

            case "october", "oct", "november", "nov", "december", "dec" -> 
                System.out.println("Autumn");

            default -> 
                System.out.println("Invalid input");
        }
    }
}