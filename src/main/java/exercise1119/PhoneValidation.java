package exercise1119;

public class PhoneValidation {
     static void main(String[] args) {
        try {
            Phone validPhone = new Phone("Galaxy S26", "1234567890123456");
            System.out.println("Created: " + validPhone);
        } catch (ValidationException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Phone invalidName = new Phone("", "1234567890123456");
        } catch (ValidationException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Phone invalidSerial = new Phone("iPhone 18", "12345");
        } catch (ValidationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}