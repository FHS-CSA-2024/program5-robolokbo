//import stuff here?

//Your code here
public class Program {
    public static void main(String[] args) {
        double royaleMpg = (289/9.0)*10;
        royaleMpg = (int) royaleMpg/10.0;
        
        double koopaMpg = (412/40.0)*10;
        koopaMpg = (int) koopaMpg/10.0;
        
        double pipeMpg = (361/18.0)*10;
        pipeMpg = (int) pipeMpg/10.0;
        
        double badwagonMpg = (161/11.0)*10;
        badwagonMpg = (int) badwagonMpg/10.0;
        
        System.out.print("Mushroom Cup Prix Racer Average Miles/Per Gallon:\n\n");
        System.out.println("Royale averaged " + royaleMpg + " m/g");
        System.out.println("Koopa King averaged " + koopaMpg + " m/g");
        System.out.println("Pipe Frame averaged " + pipeMpg + " m/g");
        System.out.println("Badwagon averaged " + badwagonMpg + " m/g");
    }
}
//Paste console output below:
/*

Mushroom Cup Prix Racer Average Miles/Per Gallon:

Royale averaged 32.1 m/g
Koopa King averaged 10.3 m/g
Pipe Frame averaged 20.0 m/g
Badwagon averaged 14.6 m/g

*/
