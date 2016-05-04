import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int figureNumber;
        double perimetr = 0;
        double area = 0;
        String[] figure = {"Rectangle", "Circle", "Square"};
        System.out.println("Enter figure: 0-Rectangle, 1-Circle, 2-Square");
        figureNumber = scanner.nextInt();

        System.out.println("Enter parametrs "+figure[figureNumber]);
        switch (figureNumber) {
            case 0:
                int side1 = scanner.nextInt();
                int side2 = scanner.nextInt();
                GeometricFigure geometricFigure = new Rectangle(side1, side2);
                perimetr = geometricFigure.findPerimetr();
                area = geometricFigure.findArea();
                break;
            case 1:
                int radius = scanner.nextInt();
                GeometricFigure geometricFigure1 = new Circle(radius);
                perimetr = geometricFigure1.findPerimetr();
                area = geometricFigure1.findArea();
                break;
            case 2:
                int side = scanner.nextInt();
                GeometricFigure geometricFigure2 = new Square(side);
                perimetr = geometricFigure2.findPerimetr();
                area = geometricFigure2.findArea();
                break;
            default:
                System.out.println("Error");


        }

        System.out.println("Perimeter of " + figure[figureNumber] + " is " + perimetr);
        System.out.println("Area of " + figure[figureNumber] + " is " + area);


    }
}
