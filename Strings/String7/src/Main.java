class UniqueCharacter
{
    public static boolean hasUniqueCharavters(String s)
     {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "abdefgh019*****&*&*&*&92";
        if (hasUniqueCharavters(input)) {
            System.out.println("\"The string \\\"\" + input + \"\\\" contains all unique characters.");
        } else {
            System.out.println("The string \"" + input + "\" does not contain all unique characters.");
        }

    }
}