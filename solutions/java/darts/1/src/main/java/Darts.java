class Darts {
    int score(double xOfDart, double yOfDart) {
        double distance = Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart);

        if (distance <= 1) {
            return 10; // inner circle
        } else if (distance <= 5) {
            return 5;  // middle circle
        } else if (distance <= 10) {
            return 1;  // outer circle
        } else {
            return 0;  // miss
        }
    }
}