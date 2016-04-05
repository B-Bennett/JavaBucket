/**
 * Created by BennettIronYard on 1/28/16.
 */
public class VolcanoApplication {
    public static void main(String[] args) {
        VolcanoRobot dante = new VolcanoRobot();
        dante.status = "Exploring";
        dante.speed = 2;
        dante.temperature = 510;

        VolcanoRobot virgil = new VolcanoRobot();
        System.out.println("\nVirgil:");
        virgil.status = "exploring";
        virgil.speed = 4;
        virgil.temperature = 535;
        virgil.showAttributes();

        dante.showAttributes();
        System.out.println("Increasing speed to 3.");
        dante.speed = 3;
        dante.showAttributes();
        System.out.println("Changing temperature to 670.");
        dante.temperature = 670;
        dante.showAttributes();
        System.out.println("Checking the temperature.");
        dante.checkTemperature();
        dante.showAttributes();
    }
}
