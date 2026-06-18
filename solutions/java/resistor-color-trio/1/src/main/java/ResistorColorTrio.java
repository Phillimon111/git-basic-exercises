class ResistorColorTrio {
    private static final String[] COLORS = {
        "black", "brown", "red", "orange", "yellow",
        "green", "blue", "violet", "grey", "white"
    };

    String label(String[] colors) {
        int main = colorCode(colors[0]) * 10 + colorCode(colors[1]);
        long ohms = (long) (main * Math.pow(10, colorCode(colors[2])));

        if (ohms >= 1_000_000_000) return (ohms / 1_000_000_000) + " gigaohms";
        if (ohms >= 1_000_000)     return (ohms / 1_000_000) + " megaohms";
        if (ohms >= 1_000)         return (ohms / 1_000) + " kiloohms";
        return ohms + " ohms";
    }

    private int colorCode(String color) {
        for (int i = 0; i < COLORS.length; i++) {
            if (COLORS[i].equals(color)) return i;
        }
        throw new IllegalArgumentException("Unknown color: " + color);
    }
}