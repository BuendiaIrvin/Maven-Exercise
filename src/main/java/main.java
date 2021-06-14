import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something:  ");
        String userInput = sc.nextLine();
        System.out.println("You entered: " + userInput);
        if(!StringUtils.isNumeric(userInput)) {
            System.out.println(userInput + " is not a number!");
        } else {
            System.out.println(userInput + " is a number!");
        }

        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.isNumeric(userInput));
    }
}


//import java.util.Scanner;
//
//        import static org.apache.commons.lang3.StringUtils.*;
//
//public class HelloWorld {
//    public static void sayHello() {
//        System.out.println("Hello");
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter something");
//        String userInput = scanner.nextLine();
//
//        System.out.println(isNumeric(userInput));
//        System.out.println(upperCase(userInput));
//        System.out.println(reverse(userInput));
//
//    }
//
//}