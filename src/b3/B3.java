
package b3;

import java.util.Scanner;
public class B3 {

  
    public static void main(String[] args) {
       int n;
       int sum = 0;
       System.out.print("nhap n:");
       Scanner scanner = new Scanner(System.in);
       n = (int)scanner.nextInt();
       for(int i =1;i<=n;i++)
       {
           sum+=i;
       }
       System.out.print(sum);
    }
    
}
