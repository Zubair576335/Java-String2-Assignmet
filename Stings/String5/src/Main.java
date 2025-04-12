import java.util.Arrays;

class main
{
    public static void main(String[] args)
    {
        String s1="keep";
        String s2="peek";

        char []ar1=s1.toCharArray();
        char []ar2=s2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        if(Arrays.equals(ar1,ar2))
        {
            System.out.println("Its an Anagram");
        }
        else
        {
            System.out.println("its not an anagram");
        }
    }
}