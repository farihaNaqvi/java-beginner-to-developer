package day12_exceptionhandling;

public class MultipleCatchExample {

    public static void main(String[] args) {

        try {
            String text = null;
            System.out.println(text.length());  // NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        } catch (NullPointerException e) {
            System.out.println("Null value encountered");
        } catch (Exception e) {
            System.out.println("General Exception");
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}
