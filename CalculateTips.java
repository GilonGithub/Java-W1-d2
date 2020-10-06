import java.util.Scanner;

public class CalculateTips {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter subtotal amount: ");
        double subTotal = input.nextDouble();

        System.out.print("Enter gratuity (%): ");
        double gratuity = input.nextDouble();

        gratuity = subTotal * (gratuity/100);
        
        System.out.println("The gratuity is $" + gratuity + " while the total is $" + (gratuity + subTotal));

    }
    
}
