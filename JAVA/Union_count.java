import java.util.*;

public class Union_count{
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter Size of Set 1");
        int size1 = sn.nextInt();
        int a[] = new int[size1];
        System.out.println("Enter Size of Set 2");
        int size2 = sn.nextInt();
        int b[] = new int[size2];
        System.out.println("Set 1 :");
        for (int i = 0; i < size1; i++) {
            a[i] = sn.nextInt();
        }
        System.out.println("Set 2 :");
        for (int i = 0; i < size2; i++) {
            b[i] = sn.nextInt();
        }
        System.out.println("Union");
        for (int i = 0; i < size1; i++)
            System.out.println(a[i]);
        for (int i = 0; i < size2; i++)
            System.out.println(b[i]);
        System.out.println("Intersection");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j])
                System.out.println(a[i]);
            }
        }
    }
}