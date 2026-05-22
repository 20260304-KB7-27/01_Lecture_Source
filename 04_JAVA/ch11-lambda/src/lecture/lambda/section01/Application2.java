package lecture.lambda.section01;

public class Application2 {

    public static void main(String[] args) {

        OuterCalculator.Sum sum = (x, y) -> x + y;
        OuterCalculator.Sum minus = (x, y) -> x - y;
        OuterCalculator.Devide devide = (x, y) -> x / y;
    }
}
