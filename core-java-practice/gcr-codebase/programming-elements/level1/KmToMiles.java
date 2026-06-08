public class KmToMiles {
    public static void main(String[] args) {
        // Create variable km to store the distance in kilometers
        double km = 10.8;
        
        // Create variable kmToMilesRatio to store the conversion factor (1 mile = 1.6 km)
        double kmToMilesRatio = 1.6;
        
        // Calculate distance in miles
        double miles = km / kmToMilesRatio;
        
        // Print the result matching the output format: The distance ___ km in miles is ___
        System.out.println("The distance " + km + " km in miles is " + miles);
    }
}
