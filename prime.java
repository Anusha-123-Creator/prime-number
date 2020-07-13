package prime;

import java.util.Scanner;

public class Prime {
    
    public static void main(String[] args) {
        int n;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                    
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.print(n+"is a prime number");
        }
        else{
            System.out.print(n+"is not a prime number");
        }
      
    }
    
}
