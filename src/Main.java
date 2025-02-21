import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int num = (int)(45.99f);
//        System.out.println(num);

//        int count = 1;
//        while (count != 6) {
//            System.out.println(count);
//            count++;
        System.out.println("Enter Temp. in Celcius: ");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);
    }
}