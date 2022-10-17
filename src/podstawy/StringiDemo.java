package podstawy;

public class StringiDemo {
    public static void main(String[] args) {

        String name = "Gienek";

        int dlugosc = name.length();

        char inicjal = name.charAt(3);

        System.out.println(inicjal);

        String male, duze;

        name = name.toUpperCase();
        male = name.toLowerCase();

        System.out.println(name);


    }
}
