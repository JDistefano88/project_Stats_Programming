public class permAndCombo
{
    static int factorial(int n)
    {
        int f = 1;
        int i = 1;
        while( i <=n)
        {
            f *= i;
            i++;
        }
        return f;
    }
    public static void main(String args[]) // this exicutes the permutation and combination for two numbers
    {
        int n = 6, r = 4, permutation, combination;
        permutation = factorial(n) / factorial(n-r);
        combination = factorial(n) / (factorial(r) * factorial(n-r));
        System.out.println("Permutation of " + n + " and " + r + " is " + permutation);
        System.out.println("combination of " + n + " and " + r + " is " + combination);
    }
}