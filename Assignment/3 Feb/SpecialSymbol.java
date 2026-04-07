import java.util.Scanner;

public class SpecialSymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Character: ");
        char ch = sc.next().charAt(0);

        if (ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' ||
            ch == '^' || ch == '&' || ch == '*' || ch == '-' || ch == '_' ||
            ch == '+' || ch == '/' || ch == '=' || ch == '(' || ch == ')' ||
            ch == '{' || ch == '}' || ch == '[' || ch == ']' || ch == ':' ||
            ch == ';' || ch == '"' || ch == '\'' || ch == '<' || ch == '>' ||
            ch == '?' || ch == ',' || ch == '.') {

            System.out.println("It is a Special Character");
        } else {
            System.out.println("It is not a Special Character");
        }

        sc.close();
    }
}
