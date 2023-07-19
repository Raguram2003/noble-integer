import java.util.Arrays;
import java.util.Scanner;


public class NobleInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size; ");
        int size =sc.nextInt();
        int[] num=new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(findNobleInteger(num,size));
    }
    public static int findNobleInteger(int[] num,int size){
        Arrays.stream(num).sorted();
        int countse = 0;
        int countne = 0;
        if(num[0]==0){
            countne++;
        }
        for (int i = 1; i < size; i++) {
                if(num[i] !=(num[i-1])){
                    countse = i;
                }
                if(countse==num[i])
                {
                    countne++;
                }
        }
        return (countne==0)?-1:countne;
    }
}
