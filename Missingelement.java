package com.company;
import java.util.Scanner;
class missing
{
    public void  missingelement()
    {
        int count=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i,j;
        int []a = new int[100];
        for(i=0;i<n;i++)
            a[i]=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=0;j<n;j++) {
                if (a[j] == i)
                    count++;
                }
            if (count == 0) {
                System.out.println("The missing element is " + " " + i);
                break;
            }
            if(count>1)
                System.out.println("The Duplictae element is "+" "+a[i]);
            count=0;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        missing m =new missing();
        m.missingelement();
    }
}
