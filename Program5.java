//import stuff here?

//Your code here
public class Program5 {
    public static void main(String[] args) {

        //declare variables
        int royMi = 286;
        int royGal = 9;
        double royMpg = 0;

        int kooMi = 412;
        int kooGal = 40;
        double kooMpg = 0;

        int pipMi = 361;
        int pipGal = 18;
        double pipMpg = 0;

        int badMi = 161;
        int badGal = 11;
        double badMpg = 0;

        //calculate
        royMpg = ((double)royMi / royGal)*10;
        kooMpg = ((double)kooMi / kooGal)*10;
        pipMpg = ((double)pipMi / pipGal)*10;
        badMpg = ((double)badMi / badGal)*10;


        System.out.print("Mushroom Cup Prix Racer Average Miles/Per Gallon:\n\n");
        System.out.println("Royale averaged " + (int)royMpg/10.0 + " m/g");
        System.out.println("Koopa King averaged " + (int)kooMpg/10.0 + " m/g");
        System.out.println("Pipe Frame averaged " + (int)pipMpg/10.0 + " m/g");
        System.out.println("Badwagon averaged " + (int)badMpg/10.0 + " m/g");
    }
}
//Paste console output below:
/*

Mushroom Cup Prix Racer Average Miles/Per Gallon:

Royale averaged 31.7 m/g
Koopa King averaged 10.3 m/g
Pipe Frame averaged 20.0 m/g
Badwagon averaged 14.6 m/g

*/
