public class StringMethods {
   /*  public static void main(String[] args) {
        String s = "Computer Science Engineer";
        s = s.concat(" Delta");
        System.out.println(s);
    }

    public static void main(String[] args) {
        String s = "Computer Science Engineer";
        String r = "I am";
        s = s.concat(" Delta ");
        r = r.concat(" Tanushka");
        System.out.println(s);
        System.out.println(r);

        // String a = "CSE";
        System.out.println(a.length());
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(2));

    }

    // equals()-String Comparision
    public static void main(String[] args) {
        String S1 = new String("JAVA");
        String S2 = new String("JAVA");
        System.out.println(S1 == S2);
        System.out.println(S1.equals(S2));
    }

    // equals IgnoreCase()
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("Java");
        System.out.println(s1.equalsIgnoreCase(s2));
    }

    // toUpperCase()/toLowerCase():Changes the text into upper or lower cases
    public static void main(String[] args) {
        String s1 = "JaVa";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
    }

    // trim()method: removes unecessary spaces
    public static void main(String[] args) {
        String s = " Hello Tanushka";
        System.out.println(s.trim());
    }

    // Search methods-contains(),startswith(),endswith() respectively
    public static void main(String[] args) {
        String s = "Tanushka is a very good girl";
        System.out.println(s.contains("Tanushka"));
        System.out.println(s.startsWith("S"));
        System.out.println(s.endsWith("l"));
    }*/

    // split() method for tokenization-used to split the string into parts
    public static void main(String[] args) {
        String s = "I,am,Tanushka";
        String[] arr = s.split(",");
        for (String lang : arr) {
            System.out.println(lang);
        }
    }
}