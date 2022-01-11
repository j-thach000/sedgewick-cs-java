public class GreatCircle {
    public static void main(String[] args) {
        // mean radius of the earth in km
        double r = 6371.0;

        // 4 double command line arguments, latitude and longitude in degrees
        double lat1 = Double.parseDouble(args[0]);
        double long1 = Double.parseDouble(args[1]);
        double lat2 = Double.parseDouble(args[2]);
        double long2 = Double.parseDouble(args[3]);

        // conversion of arguments from degrees to radians
        double x1 = Math.toRadians(lat1);
        double y1 = Math.toRadians(long1);
        double x2 = Math.toRadians(lat2);
        double y2 = Math.toRadians(long2);

        // formula implementation
        double haversine = Math.pow(Math.sin((x2 - x1) / 2), 2)
                + (Math.cos(x1) * Math.cos(x2))
                * Math.pow(Math.sin((y2 - y1) / 2), 2);
        double arcsine = Math.asin(Math.sqrt(haversine));
        double distance = (2 * r) * arcsine;

        // prints the great circle distance (in km) between them
        System.out.println(distance + " kilometers");
    }
}
