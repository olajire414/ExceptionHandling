package exercise1119;

public class Phone {
    private String name;
    private String serialNumber;

    public Phone(String name, String serialNumber) throws ValidationException {
        if (name == null || name.trim().isEmpty()) {
            throw new ValidationException("Phone name cannot be empty.");
        }
        if (serialNumber == null || serialNumber.trim().isEmpty()) {
            throw new ValidationException("Serial number cannot be empty.");
        }
        if (!serialNumber.matches("\\d{16}")) {
            throw new ValidationException("Serial number must be exactly 16 digits.");
        }
        this.name = name;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return  name + " SerialNumber" + serialNumber;
    }

}
