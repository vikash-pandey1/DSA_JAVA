package variable;

public class Type_conversion {
    public static void main(String[] args) {

        // implicit conversion
        byte b = 43;
        short s= b;
        System.out.println(s);

        // explicit conversion
        long a= 3;
        byte h = (byte)a;
        System.out.println(h);

        char ch = 'z';
        int nu = ch;
        System.out.println(nu);
    }
}
