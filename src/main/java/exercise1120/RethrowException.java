package exercise1120;

public class RethrowException {
         static void main(String[] args) {
            try {
                someMethod();
            } catch (Exception e) {
                System.err.println("Exception caught in main");
                e.printStackTrace();
            }
        }

        public static void someMethod() throws Exception {
            try {
                someMethod2();
            } catch (Exception e) {
                System.out.println("Exception caught in someMethod, Rethrowing");
                throw e;
            }
        }

        public static void someMethod2() throws Exception {
            throw new Exception("Initial exception thrown in someMethod2");
        }
    }



