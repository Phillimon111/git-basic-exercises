import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    // Check if list is empty
    public boolean isEmpty() {
        return languages.isEmpty();
    }

    // Add a language to the list
    public void addLanguage(String language) {
        languages.add(language);
    }

    // Remove a language from the list
    public void removeLanguage(String language) {
        languages.remove(language);
    }

    // Get the first language in the list
    public String firstLanguage() {
        if (languages.isEmpty()) {
            return null; // or throw an exception if you prefer
        }
        return languages.get(0);
    }

    // Count how many languages are in the list
    public int count() {
        return languages.size();
    }

    // Check if a specific language is in the list
    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    // Check if the list contains an "exciting" language
    // Let's define exciting as containing "Java" or "Kotlin"
    public boolean isExciting() {
        return languages.contains("Java") || languages.contains("Kotlin");
    }
}