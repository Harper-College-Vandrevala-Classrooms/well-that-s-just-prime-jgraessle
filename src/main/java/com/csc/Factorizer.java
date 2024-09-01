package com.csc;
import java.util.Scanner;

public class Factorizer {

  // You should implement your solution here.
  // Feel free to delete this example method when you implement your solution.
  public String Primer(int primenum) {
    if (primenum <= 1) {
      return null;
    }
    String numbers = "";
    while (primenum % 2 == 0) {
      numbers = numbers + "2 ";
      primenum = primenum / 2;
    }
    for (int i = 3; i <= primenum;i = i + 2) {
      while (primenum % i == 0) {
        numbers = numbers + i + " ";
        primenum = primenum / i;
      }
    }
    return numbers;
  } 

public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Please enter prime number to be factorized: ");
  int primenum = in.nextInt();
  in.close();
  Factorizer factorizer = new Factorizer();
  String numbers = factorizer.Primer(primenum);
  System.out.println(numbers);
}
}