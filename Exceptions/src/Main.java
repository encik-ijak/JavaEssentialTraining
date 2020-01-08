public class Main {
    public static void main(String[] args) {
        String welcome = "Welcome";
        char[] chars = welcome.toCharArray();
        char lastChar = chars[chars.length-1];
        for (char character:
             chars) {
            System.out.println(character);
        }
    }
}
