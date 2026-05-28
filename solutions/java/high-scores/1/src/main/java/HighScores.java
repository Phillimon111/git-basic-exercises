import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HighScores {
    private final List<Integer> highScores;

    // Constructor
    public HighScores(List<Integer> highScores) {
        // Defensive copy to avoid external modification
        this.highScores = new ArrayList<>(highScores);
    }

    // Return all scores
    List<Integer> scores() {
        return new ArrayList<>(highScores);
    }

    // Return the latest score (last added)
    Integer latest() {
        return highScores.get(highScores.size() - 1);
    }

    // Return the highest score
    Integer personalBest() {
        return Collections.max(highScores);
    }

    // Return the top three scores in descending order
    List<Integer> personalTopThree() {
        List<Integer> sorted = new ArrayList<>(highScores);
        sorted.sort(Collections.reverseOrder());
        return sorted.subList(0, Math.min(3, sorted.size()));
    }
}