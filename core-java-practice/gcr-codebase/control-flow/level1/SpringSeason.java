public class SpringSeason {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error: Please provide exactly 2 command-line arguments: <month> and <day>.");
            System.out.println("Usage: java SpringSeason <month> <day>");
            return;
        }
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        boolean isSpring = (month == 3 && day >= 20 && day <= 31) ||
                           (month == 4 && day >= 1 && day <= 30) ||
                           (month == 5 && day >= 1 && day <= 31) ||
                           (month == 6 && day >= 1 && day <= 20);
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
