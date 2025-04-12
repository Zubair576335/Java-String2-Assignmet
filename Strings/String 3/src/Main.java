class Main
{
    public static void main(String[] args)
    {
        String number = "2552";
        String reversedNumber = new StringBuilder(number).reverse().toString();


        if (number.equals(reversedNumber))
        {
            System.out.println("The number is a palindrome.");
        }
        else
        {
            System.out.println("The number is not a palindrome.");
        }
    }
}
