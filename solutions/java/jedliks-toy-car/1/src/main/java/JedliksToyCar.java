public class JedliksToyCar {
    private int distanceDriven;
    private int batteryPercentage;

    // Public constructor so tests can call new JedliksToyCar()
    public JedliksToyCar() {
        this.distanceDriven = 0;
        this.batteryPercentage = 100;
    }

    // 1. Buy a brand-new car
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    // 2. Display the distance driven
    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    // 3. Display the battery percentage
    public String batteryDisplay() {
        if (batteryPercentage == 0) {
            return "Battery empty";
        }
        return "Battery at " + batteryPercentage + "%";
    }

    // 4, 5, 6. Drive the car
    public void drive() {
        if (batteryPercentage > 0) {
            distanceDriven += 20;
            batteryPercentage -= 1;
        }
    }
}