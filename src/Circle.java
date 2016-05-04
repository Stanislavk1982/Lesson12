public class Circle extends GeometricFigure {

    Circle (int radius) {
        this.operand1=radius;
    }
    @Override
    double findPerimetr() {
        double result = 2*3.14*operand1;
        return result;
    }

    @Override
    double findArea() {
        double result = 3.14*operand1*operand1;
        return result;
    }
}
