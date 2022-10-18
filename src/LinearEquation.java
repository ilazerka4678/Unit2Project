public class LinearEquation {
    private int firstX;
    private int firstY;
    private int secondX;
    private int secondY;

    private double slope;

    public LinearEquation(int firstX, int firstY, int secondX, int secondY)
    {
        this.firstX = firstX;
        this.firstY = firstY;
        this.secondX = secondX;
        this.secondY = secondY;
    }
    public String getSlopeString(){
    int numerator = secondY - firstY;
    int denominator = secondX - firstX;
    return numerator + "/" + denominator;
    }
    public double getSlopeDouble(){
        int numerator = secondY - firstY;
        int denominator = secondX - firstX;
        slope = numerator/denominator;
        return numerator/denominator;
    }
    public double getIntercept(){
    return (firstY - slope*firstX);
    }
    public double pointDistance(){
    double x = (double)Math.sqrt(Math.pow(secondX-firstX,2)+Math.pow(secondY-firstY,2));
    return x;
    }
}
