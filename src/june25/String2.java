package june25;

public class String2 {

    public static void main(String[] args) {
        String a = "New York";
        String b = "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run anywhere (WORA),[16] meaning that compiled Java code can run on all platforms that support Java without the need to recompile.[17] Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. Although its syntax is similar to that of C and C++, the Java language has fewer low-level facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code modification) that are typically not available in traditional compiled languages.";

        System.out.println(a.length());
        System.out.println(a.charAt(0));
        System.out.println(a.contains("New"));
        System.out.println(a.contains("York"));

        System.out.println(b.length());

        System.out.println(b.toUpperCase());
        System.out.println(b.toLowerCase());
        System.out.println(b.indexOf("p"));
        System.out.println(b.contains("language"));

        String[] words = b.split(" ");

        for(int i= 0; i < words.length; i++){
            System.out.println(words[i]);
        }

        System.out.println(b.substring(25, 35));

        System.out.println(b.substring(0,15));

        System.out.println(b.trim());

        System.out.println(b);

    }
}
