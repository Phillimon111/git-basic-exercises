class ArmstrongNumbers {
    boolean isArmstrongNumber(int numberToCheck) {
        String digits = String.valueOf(numberToCheck);
        int numDigits = digits.length();
        int sum = 0;

        for (char c : digits.toCharArray()) {
            int digit = Character.getNumericValue(c);
            sum += Math.pow(digit, numDigits);
        }

        return sum == numberToCheck;
    }
}