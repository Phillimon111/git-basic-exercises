class NeedForSpeed {
    private final int speed;
    private final int batteryDrain;
    private int distanceDriven;
    private int battery;

    // Constructor
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriven = 0;
        this.battery = 100; // full battery at start
    }

    // Drive method
    public void drive() {
        if (!batteryDrained()) {
            distanceDriven += speed;
            battery -= batteryDrain;
        }
    }

    // Returns distance driven
    public int distanceDriven() {
        return distanceDriven;
    }

    // Checks if battery is drained
    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    // Nitro car factory method
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    // Getters for RaceTrack to use
    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }
}

class RaceTrack {
    private final int distance;

    // Constructor
    RaceTrack(int distance) {
        this.distance = distance;
    }

    // Can the car finish the race?
    public boolean canFinishRace(NeedForSpeed car) {
        int maxDrives = 100 / car.getBatteryDrain(); // number of drives possible
        int maxDistance = maxDrives * car.getSpeed();
        return maxDistance >= distance;
    }
}