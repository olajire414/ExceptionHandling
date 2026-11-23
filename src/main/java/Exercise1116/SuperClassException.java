package Exercise1116;

public class SuperClassException {
        public static void main(String[] args) {
            try {
                throw new ExceptionB("Thrown ExceptionB");
            } catch (ExceptionA e) {
                System.out.println("Caught by ExceptionA  " + e.getMessage());
            }

            try {
                throw new ExceptionC("Thrown ExceptionC");
            } catch (ExceptionA e) {
                System.out.println("Caught by ExceptionA block: " + e.getMessage());
            }
        }
    }


