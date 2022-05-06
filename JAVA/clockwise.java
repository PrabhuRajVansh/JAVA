import java.util.*;
public class clockwise{
    public static void main(String args[]){
        Scanner sn=new Scanner(System.in);
        int N=sn.nextInt();
        int A[]=new int[N];
        int B[]=new int[N+1];
        System.out.println("Array Input:");
        for(int i=0;i<N;i++){
            A[i]=sn.nextInt();
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N+1;j++){
                B[j]=A[i+1];
                System.out.println(B[j]);
            }
        }
    }
}