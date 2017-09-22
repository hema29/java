import java.util.Scanner;

public class PositiveOrNegative {
2
 
3
    public void check(int number) {
4
        if (number > 0) {
5
            System.out.println(number + " is a positive number");
6
        } else if (number < 0) {
7
            System.out.println(number + " is a negative number");
8
        } else {
9
            System.out.println(number + " is neither positive nor negative");
10
        }
11
    }
12
}