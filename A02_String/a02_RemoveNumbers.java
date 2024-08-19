public class a02_RemoveNumbers {
    public static void main(String[] args) {
        String str = "Mun4af4B8ada3rpu3ra";

        for(int i=0;i<str.length();i++){
            // System.out.println(i);
            if(str.charAt(i) <= '0' || str.charAt(i) <= '9'){
                continue;
            }
            else{
                // System.out.println(i);
                System.out.print(str.charAt(i));
            }
        }
    }
}
