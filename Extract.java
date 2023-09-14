import java.util.Scanner;
import java.io.*;

class Extract{
    public static void main(String args[]){
        String s1;
        int m,n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string :");
        s1=in.nextLine();
        System.out.println("Enter required number of required character :");
        n=in.nextInt();
        System.out.println("Enter required number of character to be extracted" );
        m=in.nextInt();
        int i=s1.length();
        
        if(m+n-1<i){
            System.out.println(s1.substring(n,m+n));
        }else{
            System.out.println("String extraction is not possible");
        }
        }
    }