/**
 * Created by BennettIronYard on 1/28/16.
 */
public class VolcanoRobot {
    String status;
    int speed;
    float temperature;
    //int power;

    void checkTemperature() {
        if (temperature > 660) {
            status = "Returning Home";
            speed = 5;
        }
    }
    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }

}
