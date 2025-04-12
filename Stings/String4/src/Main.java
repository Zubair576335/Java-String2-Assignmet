class Main
{
    public static void main(String[] args)
    {
        String str = "abcdefghijklmnopqrstuvwxyz1234567890@#$%^&*";
        str = str.toLowerCase();

        int vowels = 0, consonants = 0, specialCharacters = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z')
            {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                }
                else
                {
                    consonants++;
                }
            }
            else if (ch >= '0' && ch <= '9')
            {

            }
            else
            {
                specialCharacters++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Special Characters: " + specialCharacters);
    }
}
