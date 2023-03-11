import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        maxNumFrom3Int();// lessons_1
        System.out.println("--------------------------------------------------------------------------");
        returnEntrance();// lessons_1.1
        System.out.println("--------------------------------------------------------------------------");
        sumFrom1To200();// lessons_2
        System.out.println("--------------------------------------------------------------------------");
        returnTipTop();// lessons_3
        System.out.println("--------------------------------------------------------------------------");
        smallAlphabet();// lessons_4
        System.out.println("--------------------------------------------------------------------------");
        multipleOfFive();// lessons_5
    }

    public static void maxNumFrom3Int() {
        int var1 = 123;
        int var2 = 234;
        int var3 = 345;
        System.out.print("Max number is: ");

        if (var1 > var2 && var1 > var3) {
            System.out.println(var1);
        } else if (var2 > var1 && var2 > var3) {
            System.out.println(var2);
        } else {
            System.out.println(var3);
        }
    }

    public static void returnEntrance() {
        System.out.println("There are 90 apartments in our building.");
        System.out.println("Please enter the apartment number to find out the entrance number:");

        Scanner scanner = new Scanner(System.in);
        int numberApartment = scanner.nextInt();
        if (numberApartment > 0 && numberApartment < 21) {
            System.out.println("Apartment #" + numberApartment + " is located in the entrance #1");
        } else if (numberApartment > 20 && numberApartment < 49) {
            System.out.println("Apartment #" + numberApartment + " is located in the entrance #2");
        } else if (numberApartment > 48 && numberApartment < 91) {
            System.out.println("Apartment #" + numberApartment + " is located in the entrance #3");
        }
    }

    public static void sumFrom1To200() {
        int sum = 0;
        for (int i = 1; i < 201; i++) {
            sum += i;
        }
        System.out.println("Sum from 1 to 200 is: " + sum);
    }

    public static void returnTipTop() {
        int count = 1;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(count + ". Tip-");
                count++;
            } else {
                System.out.println("Top");
            }
        }
    }

    public static void smallAlphabet() {
        char ch = 'a';
        while (true) {
            System.out.print(ch);
            ++ch;
            if (ch == 'z' + 1) {
                break;
            }
            System.out.print("..");
        }
        System.out.println();
    }

    public static void multipleOfFive() {
        for (int i = 100; i >= 0; i -= 5) {
            if (i == 45 || i == 0) {
                System.out.print(".. ");
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
