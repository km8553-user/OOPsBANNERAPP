import java.util.HashMap;
import java.util.Map;

class OOPsBannerApp {

    /**
     * Builds and returns character pattern map
     */
    public static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return map;
    }

    /**
     * Displays banner message
     */
    public static void displayBanner(String message, Map<Character, String[]> map) {
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                line.append(map.get(ch)[i]).append(" ");
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> patternMap = buildPatternMap();
        displayBanner("OOPS", patternMap);
    }
}