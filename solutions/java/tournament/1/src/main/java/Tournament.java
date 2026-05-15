import java.util.*;

public class Tournament {

    // Inner helper class to track stats
    private static class TeamStats {
        int matchesPlayed = 0;
        int wins = 0;
        int draws = 0;
        int losses = 0;
        int points = 0;
    }

    // Map of team name → stats
    private final Map<String, TeamStats> teams = new HashMap<>();

    public void applyResults(String resultString) {
        // Split into lines, handle multiple matches
        String[] lines = resultString.split("\\n");
        for (String line : lines) {
            if (line.isBlank()) continue;
            String[] parts = line.split(";");
            if (parts.length != 3) {
                throw new IllegalArgumentException("Invalid input line: " + line);
            }

            String team1 = parts[0].trim();
            String team2 = parts[1].trim();
            String result = parts[2].trim();

            teams.putIfAbsent(team1, new TeamStats());
            teams.putIfAbsent(team2, new TeamStats());

            TeamStats stats1 = teams.get(team1);
            TeamStats stats2 = teams.get(team2);

            stats1.matchesPlayed++;
            stats2.matchesPlayed++;

            switch (result) {
                case "win":
                    stats1.wins++;
                    stats1.points += 3;
                    stats2.losses++;
                    break;
                case "loss":
                    stats1.losses++;
                    stats2.wins++;
                    stats2.points += 3;
                    break;
                case "draw":
                    stats1.draws++;
                    stats2.draws++;
                    stats1.points++;
                    stats2.points++;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown result: " + result);
            }
        }
    }

    public String printTable() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-30s | MP |  W |  D |  L |  P%n", "Team"));

        teams.entrySet().stream()
                .sorted((a, b) -> {
                    int cmp = Integer.compare(b.getValue().points, a.getValue().points);
                    if (cmp == 0) {
                        return a.getKey().compareTo(b.getKey());
                    }
                    return cmp;
                })
                .forEach(entry -> {
                    String team = entry.getKey();
                    TeamStats s = entry.getValue();
                    sb.append(String.format("%-30s | %2d | %2d | %2d | %2d | %2d%n",
                            team, s.matchesPlayed, s.wins, s.draws, s.losses, s.points));
                });

        return sb.toString();
    }
}