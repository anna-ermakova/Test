public class Strings {
    public static void main(String[] args) {

        String str = new String("abc");
        String str1 = "abc";

        String habr = "habr";
        char[] habrAsArrayOfChars = {'h', 'a', 'b', 'r'};
        byte[] habrAsArrayOfBytes = {104, 97, 98, 114, 97};

        String first = new String();
        String second = new String(habr);

        String a = "Строка";
        String b = "Строка";

        System.out.println(a == b);//true


        StringBuffer buf = new StringBuffer("Строка");

        System.out.println(a == buf.toString());//false

        StringBuilder bild = new StringBuilder("Строка");

        System.out.println(buf.toString() == bild.toString());//false
    }
}