public class Main {
    public static void main(String[] args) {
        try {
            String welcome = "Welcome";
            char[] chars = welcome.toCharArray();
            char lastChar = chars[chars.length-1];
            System.out.println("Last character : "+lastChar);

            String nothing = null;
            System.out.println(nothing.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            //return;
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Code ran successfully");
    }
}
