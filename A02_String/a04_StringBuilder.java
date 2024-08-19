// String is immutable so we use string builder

public class a04_StringBuilder {
    public static void main(String[] args) {
        // Integer a = 10;
        // String str = a.toString();
        // System.out.println(str);

        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z';ch++){
            sb.append(ch);
        }

        System.out.println(sb);
    }
}
