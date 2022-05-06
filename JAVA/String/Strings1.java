//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
import java.util.*;
public class Strings1 {
    public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        int size=sn.nextInt();
        String arr[]=new String[size];
        int total_length=0;
        for(int i=0;i<size;i++){
            arr[i]=sn.next();
            total_length+=arr[i].length();
        }
        System.out.println("Total Length="+total_length);
    }
}
