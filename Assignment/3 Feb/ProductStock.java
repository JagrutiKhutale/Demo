import java.util.Scanner;
class ProductStock {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product quantity:");
        int qty = sc.nextInt();

        if (qty > 0) {
            System.out.println("Product is In Stock");
        } else {
            System.out.println("Product is Out of Stock");
        }
    }
}
