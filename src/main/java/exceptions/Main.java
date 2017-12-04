package exceptions;


public class Main {

    public static void divide(Integer a, Integer b) throws Exception{
        try {
            System.out.println("a/b = " + a / b);
        } catch (ArithmeticException ex) {
            System.out.println("Аргумент некорректный: " + b);
        } catch (NullPointerException ex) {
            System.out.println("Значение делителя = null!!");
        } finally {
            System.out.println("закрыл соединение");
        }

    }

    public static void main(String[] args) throws Exception{

        divide(6, 0);
    }
}
