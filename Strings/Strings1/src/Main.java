class Main
{
    public static void main(String[] args)
    {
        String s = "zzuubbaaiirr";
        System.out.println("Original String: " + s);

        String result = "";
        for (int i = 0; i < s.length(); i++)
        {
            char currentChar = s.charAt(i);

            if (result.indexOf(currentChar) == -1)
            {
                result += currentChar;
            }
        }

        System.out.println("String after removing duplicates: " + result);
    }
}
