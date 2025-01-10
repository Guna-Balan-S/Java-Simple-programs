//Prime or not 1 to n numbers
import java.util.Scanner;
class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        for(int i=2;i<n;i++){
            
            if(n%i==0){
                System.out.println("Not a Prime");
                break;
                
            }
            else{
                System.out.println("Prime");
                break;
            }
        }
        
    }
}
