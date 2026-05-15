import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Say {

    private static final String[] SMALL_NUMBERS = {
        "zero","one","two","three","four","five","six","seven","eight","nine",
        "ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen",
        "seventeen","eighteen","nineteen"
    };

    private static final String[] TENS = {
        "", "", "twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"
    };

    private static final String[] SCALE = {
        "", "thousand", "million", "billion", "trillion"
    };

    public String say(long number) {
        if (number < 0 || number > 999_999_999_999L) {
            throw new IllegalArgumentException("Number out of range");
        }
        if (number == 0) return "zero";

        List<String> parts = new ArrayList<>();
        int scaleIndex = 0;

        while (number > 0) {
            int chunk = (int)(number % 1000);
            if (chunk != 0) {
                String chunkWords = convertChunk(chunk);
                if (!SCALE[scaleIndex].isEmpty()) {
                    chunkWords += " " + SCALE[scaleIndex];
                }
                parts.add(chunkWords);
            }
            number /= 1000;
            scaleIndex++;
        }

        Collections.reverse(parts);
        return String.join(" ", parts).trim();
    }

    private String convertChunk(int number) {
        List<String> words = new ArrayList<>();
        if (number >= 100) {
            words.add(SMALL_NUMBERS[number / 100]);
            words.add("hundred");
            number %= 100;
        }
        if (number >= 20) {
            String tensWord = TENS[number / 10];
            int ones = number % 10;
            if (ones != 0) {
                // hyphen between tens and ones
                words.add(tensWord + "-" + SMALL_NUMBERS[ones]);
            } else {
                words.add(tensWord);
            }
        } else if (number > 0) {
            words.add(SMALL_NUMBERS[number]);
        }
        return String.join(" ", words);
    }
}