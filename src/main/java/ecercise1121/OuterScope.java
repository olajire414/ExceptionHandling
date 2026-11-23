package ecercise1121;

public class OuterScope {
         static void main(String[] args) {
            try {
                Exercise1121.illegalDivision();
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException " + e.getMessage());
            }
        }
    }


