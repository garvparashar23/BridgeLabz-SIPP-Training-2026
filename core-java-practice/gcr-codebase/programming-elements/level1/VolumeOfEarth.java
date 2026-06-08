public class VolumeOfEarth {
    public static void main(String[] args) {
        // Create variable radiusKm to store the radius of the Earth in kilometers
        double radiusKm = 6378.0;
        
        // Create variable kmToMilesRatio to store the conversion factor (1 mile = 1.6 km)
        double kmToMilesRatio = 1.6;
        
        // Calculate the volume of the Earth in cubic kilometers: (4/3) * pi * r^3
        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        
        // Calculate the radius in miles
        double radiusMiles = radiusKm / kmToMilesRatio;
        
        // Calculate the volume of the Earth in cubic miles using the radius in miles
        double volumeMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        
        // Print the result matching the output format: The volume of earth in cubic kilometers is ____ and cubic miles is ____
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}
