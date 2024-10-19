public class Main {
    public static void main(String[] args) {
        double celsius = 30.0;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("ტემპერატურა ფარენჰეიტში: " + fahrenheit);


        double fahrenheitt = 65.0;
        double celsiuss = (fahrenheitt - 32) * 5/9;
        System.out.println("ტემპერატურა ცელსიუსებში: " + celsiuss);


        int year = 2024;
        boolean nakiani = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (nakiani) {
            System.out.println(year + " არის ნაკიანი წელი.");
        } else {
            System.out.println(year + " არ არის ნაკიანი წელი.");
        }


        double x = 3.8;
        double y = -2.2;
        if (x > 0 && y > 0) {
            System.out.println("წერტილი არის I მეოთხედში.");
        } else if (x < 0 && y > 0) {
            System.out.println("წერტილი არის II მეოთხედში.");
        } else if (x < 0 && y < 0) {
            System.out.println("წერტილი არის III მეოთხედში.");
        } else if (x > 0 && y < 0) {
            System.out.println("წერტილი არის IV მეოთხედში.");
        } else if (x == 0 && y != 0) {
            System.out.println("წერტილი Y ღერძზეა.");
        } else if (y == 0 && x != 0) {
            System.out.println("წერტილი X ღერძზეა.");
        }


        char operator = '+';
        double num1 = 100;
        double num2 = 57;

        double result;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("ვერ გაიყოფა ნულზე :(((( .");
                return;
            }
        } else {
            System.out.println("არასწორი ოპერატორი. გამოიყენეთ +, -, *, /.");
            return;
        }
        System.out.println("Result: " + result);


    }
}


