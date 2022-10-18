import java.text.DecimalFormat;
import java.util.Scanner;

public class EquationRunner {
    public double yIntercept;
    public double slopeValue;
    public int firstX;
    public int firstY;
    public int secondY;
    public int secondX;
    public static void main(String[] args) {
    DecimalFormat round = new DecimalFormat("###.##");
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the coordinates for the first point: ");
    String firstPoint = input.nextLine();
    int firstX = Integer.parseInt(firstPoint.substring(1,firstPoint.indexOf(",")));
    int firstY = Integer.parseInt(firstPoint.substring(firstPoint.indexOf(",")+1, firstPoint.length()-1));

    System.out.print("Enter the coordinates for the second point: ");
    String secondPoint = input.nextLine();
    int secondX = Integer.parseInt(secondPoint.substring(1,secondPoint.indexOf(",")));
    int secondY = Integer.parseInt(secondPoint.substring(secondPoint.indexOf(",")+1, secondPoint.length()-1));
    LinearEquation linEquation = new LinearEquation(firstX, firstY, secondX, secondY);
    double slopeValue = linEquation.getSlopeDouble();
    double yIntercept = linEquation.getIntercept();
    double distance = linEquation.pointDistance();
    System.out.println("First pair: " + firstPoint);
    System.out.println("Second pair: " + secondPoint);
    System.out.println("Slope of line: " + slopeValue);
    System.out.println("Y-intercept: " + round.format(yIntercept));
    System.out.println("Slope intercept form: y = " + linEquation.getSlopeString() + "x + " + yIntercept);
    System.out.println("Distance between points: " + round.format(distance));
    System.out.print("Enter an x-value: ");
    double xCoordinate = input.nextDouble();
    System.out.print(round.format(linEquation.findY(xCoordinate)));

    }
}
