class MicroBlog {
    public String truncate(String input) {
      // Count how many Unicode code points are in the string
        int codePointCount = input.codePointCount(0, input.length());

        // If 5 or fewer, return as is
        if (codePointCount <= 5) {
            return input;
        }

        // Otherwise, find the index in the string where the 5th code point ends
        int endIndex = input.offsetByCodePoints(0, 5);

        // Return substring up to that index
        return input.substring(0, endIndex);

    }
}
