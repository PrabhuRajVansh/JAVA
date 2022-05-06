import java.util.*;
public class test{
    public static void main(String args[]){
        Scanner sn=new Scanner(System.in);
        System.out.println("Number of elements to input:");
        int n=sn.nextInt();
        System.out.println("Number of iterations:");
        int q=sn.nextInt();
        int A[]=new int[n];
        int prime[]=new int[n];
        // System.out.println("Input Elements:");
        // for(int i=0;i<n;i++){
        // A[i]=sn.nextInt();
        // }
        //prime till q
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
            count++;
        }
        if(count==2){
            for(int j=1;j<=n;j++){
            prime[j-1]=j;
            }
        }
        for(int i=0;i<n;i++)
        System.out.println(prime[i]);
    }
}