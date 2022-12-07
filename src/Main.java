public class Main {
    public static void main(String[] args) {
        String string1 = "United Kingdom";
        String string2 = "Germany";

        //System.out.println((string1.substring(0, 6) + " " + string2 + " " + string1.substring(7, 14)).toUpperCase());

        String sub1 = string1.substring(0, 6);
        String sub2 = string1.substring(7);

        char[] charArray = sub1.concat(" " + string2 + " " + sub2).toUpperCase().toCharArray();

        System.out.println(charArray);

        //System.out.println((sub1 + " " + string2 + " " + sub2).toUpperCase());
    }
}