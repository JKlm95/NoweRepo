import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        DivEquasion divEquasion = new DivEquasion();
        MulEquation mulEquation = new MulEquation();
        SubstractEquation substractEquation = new SubstractEquation();
        SumEquation sumEquation = new SumEquation();
        PowEquation powEquation = new PowEquation();

        System.out.println("Podaj a");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Podaj b");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Podaj komende add/sub/mul/div: ");
        String komenda = sc.nextLine();
        switch (komenda){
            case "sum":
                sumEquation.calculate(a, b);
                break;
            case "sub":
                substractEquation.calculate(a, b);
                break;
            case "mul":
                mulEquation.calculate(a,b);
                break;
            case "div":
                divEquasion.calculate(a, b);
                break;
            case "pow":

        }
    }
}
