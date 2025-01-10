import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("Choose your operator click numbers");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Given your choice:");
        int choice = scanner.nextInt();
        System.out.println("Give an first value");
        int a = scanner.nextInt();
        System.out.println("Give an second value");
        int b = scanner.nextInt();
        if (choice == 1){
            System.out.println("Addition :"+(a+b));
        }
        else if(choice == 2){
            System.out.println("Subtraction :"+(a-b));
        }
        else if(choice == 3){
            System.out.println("multiplication :"+(a*b));
        }
        else if(choice == 4){
            float val = a/b;
            System.out.println("Division :"+val);
        }
        else{
            System.out.println("your input is wrong");
        }
        System.out.println("Thank You");


    }
}
