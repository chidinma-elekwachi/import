import java.util.Scanner;

public class practice {
    

    static void question(){
        Scanner input = new Scanner(System.in);
        // Scanner object is inside because the method is static 
        System.out.println("Enter First number: ");
        int num1 = input.nextInt();

        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        input.close();
        System.out.println("Sum: " +(num1 + num2));
        System.out.println("Product:" +(num1 * num2));
    }
    static void question1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle: ");
        double Length = input.nextDouble();

        System.out.println("Enter Breadth of Rectangle: ");
        double Breadth = input.nextDouble();
        input.close();
        System.out.println("Area of the Rectangle is:" + Length * Breadth) ;
    }
    static void question2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        input.close();
        int sqrt = num * num;
        System.out.println(sqrt);
    }
    static void conditions(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length:");
        double length = input.nextDouble();
        
        System.out.println("Enter breadth:");
        double breadth = input.nextDouble();
        input.close();
        if (length==breadth) {
            System.out.println("This is a square");
        }else{
            System.out.println("This is a rectangle of area " + length*breadth);
        }

    }
    static void call(){
        String menu = "1) Room  2) Laundry 3) Kitchen";
        Scanner input = new Scanner(System.in);
        System.out.println(menu);
        System.out.println("Enter Code for service");
        int code = input.nextInt();
        if (code==1) {
            System.out.println("Room");
        }else if (code==2) {
                System.out.println("laundry");
                
            }            else if (code==2) {
                System.out.println("Kitchen");
                
            } else {
               System.out.println("wrong input"); 
            }
        

        }
    
    static void purchase(){
        final int cost = 100;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter quantity of goods:");
        int qty = input.nextInt();
        double total_cost = cost * qty;
        input.close();

        if (qty > 1000) {
            total_cost = total_cost - (total_cost * 0.1);

            System.out.println("Total cost is with discount applied:" + total_cost);
        }else {
            System.out.println(total_cost);
        }
    }
    public static void main(String[]  args) {
        purchase();
    }
}
