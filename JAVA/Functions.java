import java.util.Scanner;
public class Functions{
    public static void main(String args[]){
        System.out.print("Enter Number:");
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int res=Fact(n);
        System.out.println(res);
    }
    public static int Fact(int a)
    {
        int m=1;
        for(int i=1;i<=a;i++)
        m=m*i;
        return m;
    }
}