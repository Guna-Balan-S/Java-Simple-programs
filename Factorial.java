import java.util.Scanner;
class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int val=1;
        for (int i=a;i>=2;i--){
            val*=a;
            a-=1;
        }
        System.out.println(val);
    }
}
