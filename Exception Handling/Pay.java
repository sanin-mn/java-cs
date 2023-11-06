import java.util.Scanner;

class Pay{
    public static void main (String args[])
    {
        int p,commission;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the pa :");
        p=in.nextInt();
        try
        {
            if(p>5000)
            {
                throw new myException ("pa Greater than 5000");
            }
            else
            {
                commission=p+p*20/100;
                System.out.println("commission :"+commission);
            }
        }
        catch (myException e)
        {
            System.out.println("Pay out of bounds");
            System.out.println(e.getMessage());
        }
    }
}

class myException extends Exception{
    myException (String msg)
    {
        super(msg);
    }
}