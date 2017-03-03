//Clint Madariaga-Zittel
//Pythagorean calculator


import java.util.Scanner;

public class Pythagorean {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the length of side A for a triangle: ");
    double sideA = input.nextDouble();
    System.out.print("Enter the length of side B of the triangle: ");
    double sideB = input.nextDouble();
    double sideC = Math.sqrt((sideA * sideA) + (sideB * sideB));
    System.out.println("The length of side C is: " + sideC);
  }
}