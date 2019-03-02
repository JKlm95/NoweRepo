import static java.lang.Math.pow;

public class PowEquation implements ICalculable
{

    double n;
    double pow;



    public double calculate(double pow, double n)
    {
        return Math.pow(pow, n);

    }
}
