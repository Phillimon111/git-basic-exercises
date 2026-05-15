class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    // 1. Last week's counts
    public int[] getLastWeek() {
        return new int[] { 0, 2, 5, 3, 7, 8, 4 };
    }

    // 2. Today's count
    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    // 3. Increment today's count
    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    // 4. Check if there was a day with no birds
    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay) {
            if (count == 0) {
                return true;
            }
        }
        return false;
    }

    // 5. Count for first number of days
    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    // 6. Number of busy days (>= 5 birds)
    public int getBusyDays() {
        int busy = 0;
        for (int count : birdsPerDay) {
            if (count >= 5) {
                busy++;
            }
        }
        return busy;
    }
}
