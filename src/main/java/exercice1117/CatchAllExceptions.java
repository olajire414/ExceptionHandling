package exercice1117;

import java.io.IOException;
public class CatchAllExceptions {
    static void main() {

        try {
            throw new ExceptionA("insufficient fund");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try{
            throw new ExceptionB("wrong input");
        } catch (ExceptionB e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new NullPointerException("Account does not exist");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new IOException("Caught IOException");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }












    }
    }