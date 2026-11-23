package ecercise1121;

public class Exercise1121 {
        public static void illegalDivision() {
            try {
                int result = 10 / 0;
                System.out.println("Result: " + result);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException");
            }
        }


}
