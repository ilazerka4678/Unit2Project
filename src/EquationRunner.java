import java.util.Scanner;

public class EquationRunner {
    public double yIntercept;
    public double slopeValue;
    public int firstX;
    public int firstY;
    public int secondY;
    public int secondX;
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the coordinates for the first point: ");
    String firstPoint = input.nextLine();
    int firstX = Integer.parseInt(firstPoint.substring(1,firstPoint.indexOf(",")));
    int firstY = Integer.parseInt(firstPoint.substring(firstPoint.indexOf(",")+1, firstPoint.length()-1));
    System.out.println(firstX);
    System.out.println(firstY);
    System.out.print("Enter the coordinates for the second point: ");
    String secondPoint = input.nextLine();
    int secondX = Integer.parseInt(secondPoint.substring(1,secondPoint.indexOf(",")));
    int secondY = Integer.parseInt(secondPoint.substring(secondPoint.indexOf(",")+1, secondPoint.length()-1));
    LinearEquation linEquation = new LinearEquation(firstX, firstY, secondX, secondY);
    double slopeValue = linEquation.getSlopeDouble();
    double yIntercept = linEquation.getIntercept();
    double distance = linEquation.pointDistance();
        System.out.println(secondX);
        System.out.println(secondY);
        System.out.println(slopeValue);
        System.out.println(yIntercept);
        System.out.println(distance);
    }
}
