class OOPSBannerApp {

    public static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // UTILITY METHOD
    public static CharacterPattern[] buildPatterns() {
        return new CharacterPattern[]{
                new CharacterPattern('O', new String[]{
                        " ***** ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        " ***** "
                }),
                new CharacterPattern('P', new String[]{
                        " ***** ",
                        "*     *",
                        "*     *",
                        " ***** ",
                        "*      ",
                        "*      ",
                        "*      "
                }),
                new CharacterPattern('S', new String[]{
                        " ***** ",
                        "*      ",
                        "*      ",
                        " ***** ",
                        "      *",
                        "      *",
                        " ***** "
                })
        };
    }

    // MAIN
    public static void main(String[] args) {
        CharacterPattern[] patterns = buildPatterns();
        String word = "OOPS";

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                for (CharacterPattern cp : patterns) {
                    if (cp.getCharacter() == c) {
                        line.append(cp.getPattern()[row]).append("  ");
                    }
                }
            }
            System.out.println(line);
        }
    }
}