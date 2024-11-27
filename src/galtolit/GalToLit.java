package galToLit;
import java.util.Scanner;
public class GalToLit {
public static void main(String[] args) {

double gallons=10;
double liters=0;

System.out.println("Enter a number of gallons: ");
Scanner in = new Scanner(System.in);

gallons=in.nextDouble();
liters=gallons*3.785;

System.out.println(gallons+" gallons equals "+liters+" liters");
}
}

