public class Main {
    public static void main(String[] args) {
        CalcIndex service = new CalcIndex();
        int index = service.calculate(71.2, 1.8);
        System.out.println("Ваш индекс массы тела = " + index);

    }
}