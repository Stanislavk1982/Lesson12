public class Square extends GeometricFigure {

    Square (int squaresSide) {
        this.operand1=squaresSide;
    }
    @Override
    double findPerimetr() {
        int result = 4*operand1;
        return result;
    }

    @Override
    double findArea() {
        int result = operand1*operand1;
        return result;
    }
}
