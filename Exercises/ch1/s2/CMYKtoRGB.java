public class CMYKtoRGB {
    public static void main(String[] args) {
        // 4 double command-line arguments that correspond to CYMK format
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        // CYMK to RGB conversion
        double white = 1 - black;
        double red = 255 * white * (1 - cyan);
        double green = 255 * white * (1 - magenta);
        double blue = 255 * white * (1 - yellow);

        // print RGB values
        System.out.println("red = " + (int) red);
        System.out.println("green = " + (int) green);
        System.out.println("blue = " + (int) blue);
    }
}
