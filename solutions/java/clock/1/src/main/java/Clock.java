class Clock {
    private int hours;
    private int minutes;

    // Constructor
    Clock(int hours, int minutes) {
        int totalMinutes = hours * 60 + minutes;
        normalize(totalMinutes);
    }

    // Add minutes
    void add(int minutesToAdd) {
        int totalMinutes = this.hours * 60 + this.minutes + minutesToAdd;
        normalize(totalMinutes);
    }

    // Normalize time to 24-hour format
    private void normalize(int totalMinutes) {
        // Ensure positive wrap-around
        totalMinutes = ((totalMinutes % (24 * 60)) + (24 * 60)) % (24 * 60);
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }

    @Override
    public String toString() {
        // Format as HH:MM with leading zeros
        return String.format("%02d:%02d", hours, minutes);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same object
        if (!(obj instanceof Clock)) return false;
        Clock other = (Clock) obj;
        return this.hours == other.hours && this.minutes == other.minutes;
    }

    @Override
    public int hashCode() {
        return 60 * hours + minutes; // unique hash per minute of the day
    }
}