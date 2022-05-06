import java.util.*;
public class max{
    public static void main(String args[]){
        Scanner sn=new Scanner(System.in);
        int size;
        System.out.print("Enter Size:");
        size=sn.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter Element:");
            a[i]=sn.nextInt();
        }
        int max=a[0];
        int min=a[0];
        for(int i=0;i<size;i++){
        if(a[i]>max){
            max=a[i];
        }
        }
        System.out.println(max);
        for(int i=0;i<size;i++){
            if(a[i]<min){
                min=a[i];
            }
            }
            System.out.println(min);
            
    }
}