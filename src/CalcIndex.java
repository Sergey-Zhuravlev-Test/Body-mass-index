public class CalcIndex {

    public int calculate(double weight, double height) {

        int result = (int) (weight / (height*height));
        return result;

    }
}
