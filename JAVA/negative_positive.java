import java.util.*;

public class negative_positive {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int size = sn.nextInt();
        int a[] = new int[size];
        int b[] = new int[size];
        int c[] = new int[size];
        System.out.println("Enter Array:");
        for (int i = 0; i < size; i++) {
            a[i] = sn.nextInt();
        }
        int j=0,k=0;
        for (int i = 0; i < size; i++) {
            if (a[i] < 0) {
                b[k] = a[i];
                k++;
            }
            else{
                c[j]=a[i];
                j++;
            }
        }
        for (int i = 0; i <k; i++) {
            System.out.println(b[i]);
        }
        for (int i = 0; i < j; i++) {
            System.out.println(c[i]);
        }
    }
}