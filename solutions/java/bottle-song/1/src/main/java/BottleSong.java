class BottleSong {

    String recite(int startBottles, int takeDown) {
        StringBuilder song = new StringBuilder();

        int bottles = startBottles;
        for (int i = 0; i < takeDown; i++) {
            song.append(verse(bottles)).append("\n");
            bottles--;
            if (i < takeDown - 1) {
                song.append("\n");
            }
        }

        return song.toString();
    }

    private String verse(int bottles) {
        String current = bottlesToWords(bottles, true);
        String next = bottlesToWords(bottles - 1, false);

        return current + " hanging on the wall,\n"
             + current + " hanging on the wall,\n"
             + "And if one green bottle should accidentally fall,\n"
             + "There'll be " + next + " hanging on the wall.";
    }

    private String bottlesToWords(int bottles, boolean capitalize) {
        String phrase;
        if (bottles == 0) {
            phrase = "no green bottles";
        } else if (bottles == 1) {
            phrase = "one green bottle";
        } else {
            phrase = numberWord(bottles) + " green bottles";
        }
        return capitalize ? capitalizeFirst(phrase) : phrase;
    }

    private String numberWord(int n) {
        switch (n) {
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            case 10: return "ten";
            default: return String.valueOf(n);
        }
    }

    private String capitalizeFirst(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}