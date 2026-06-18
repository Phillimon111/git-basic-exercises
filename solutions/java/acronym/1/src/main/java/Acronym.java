class Acronym {
    private final String acronym;

    Acronym(String phrase) {
        StringBuilder sb = new StringBuilder();
        for (String word : phrase.split("[\\s\\-_]+")) {
            String clean = word.replaceAll("[^a-zA-Z]", "");
            if (!clean.isEmpty()) sb.append(clean.charAt(0));
        }
        this.acronym = sb.toString().toUpperCase();
    }

    String get() {
        return acronym;
    }
}