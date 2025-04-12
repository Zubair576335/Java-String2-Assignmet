//3 WAP to print Duplicates characters from the String>
class Main
{
    public static void main(String[] args)
    {
        int countduplicates=0;
        String s = "rratt";
        System.out.println("Original String: " + s);

        String duplicates = ""; // Initialize an empty string to store the result
        for (int i = 0; i < s.length(); i++)
        {
            char currentChar = s.charAt(i);

            if (duplicates.indexOf(currentChar) == -1)
            {
                if(duplicates.indexOf(currentChar,i+1) != -1);
                {
                    duplicates += currentChar;
                    countduplicates++;
                }
            }
        }

        System.out.println("String after removing duplicates: " + duplicates);
       }
}
