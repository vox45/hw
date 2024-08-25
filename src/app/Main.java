package src.app;

public class Main {

    public static void main(String[] args) {
        Customer customer = getCustomer(getData());
        String output = "Customer: " + customer.getName() +
                ", phone " + customer.getPhone();
        getOutput(output);
    }

    public static String[] getData() {
        return new String[]{"John Doe", "123-456-7890"}; // Пропишіть значення для об'єкту Customer
    }

    public static Customer getCustomer(String[] data) {
        return new Customer(data[0], data[1]);
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
