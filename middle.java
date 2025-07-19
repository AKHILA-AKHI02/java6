public class middle
{
    public static void main(String[] args)
    {
        int a=34;
        int b=56;
        int c=45;
        if(a>b)
        {
            if(b>c)
            {
                System.out.println(b);
            }
            else if(a>c)
            {
                System.out.println(c);
            }
            else
            {
                System.out.println(a);
            }
        }
        else
        {
            if(a>c)
            {
                System.out.println(a);
            }
            else if(b>c)
            {
                System.out.println(c);
            }
            else
            {
                System.out.println(b);
            }
        }
    }
}
