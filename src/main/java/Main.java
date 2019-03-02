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
        String komenda;

//        String komenda = sc.nextLine();
        do {
            System.out.println("Podaj a");
            double a = Double.parseDouble(sc.nextLine());
            System.out.println("Podaj b");
            double b = Double.parseDouble(sc.nextLine());
            System.out.println("Podaj komende sum/sub/mul/div/pow/quit" );
            komenda = sc.nextLine();
            switch (komenda){
                case "sum":
                    System.out.println(sumEquation.calculate(a, b));
                    break;
                case "sub":
                    System.out.println(substractEquation.calculate(a, b));
                    break;
                case "mul":
                    System.out.println(mulEquation.calculate(a,b));
                    break;
                case "div":
                    System.out.println(divEquasion.calculate(a, b));
                    break;
                case "pow":
                    System.out.println(powEquation.calculate(a, b));
                    break;
            }

        } while (!komenda.equals("quit"));

    }
}
