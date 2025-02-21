/* 19. Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.
Calculate percentage and grade according to following:

Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F */

package com.madhur;
import java.util.Scanner;

public class Subject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Physics Marks: ");
        float phy = in.nextFloat();
        System.out.println("Chemistry Marks: ");
        float chem = in.nextFloat();
        System.out.println("Maths Marks: ");
        float math = in.nextFloat();
        System.out.println("Biology Marks: ");
        float bio = in.nextFloat();
        System.out.println("Computer Marks: ");
        float comp = in.nextFloat();

        float per = ((phy + chem + math + bio + comp) / 500) * 100;
        if(per >= 90) {
            System.out.print("Grade A");
        } else if (per >= 80) {
            System.out.print("Grade B");
        } else if (per >= 70) {
            System.out.print("Grade C");
        } else if (per >= 60) {
            System.out.print("Grade D");
        } else if (per >= 40) {
            System.out.print("Grade E");
        } else {
            System.out.println("Grade F");
        }
    }
}
