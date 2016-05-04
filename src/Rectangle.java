public class Rectangle extends GeometricFigure {

    Rectangle(int side1, int side2) {
        this.operand1 = side1;
        this.operant2 = side2;
    }

    @Override
    double findPerimetr() {
        int result = 2*(operand1+operant2);
        return result;
    }

    @Override
    double findArea() {
        int result=operand1*operant2;
        return result;
    }
}
