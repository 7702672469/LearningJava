public class VowelsOnly {
    public static void main(String[] args) {
       String s= vowels("HEllo wOrld ae");
       System.out.println(s);
    }

    private static String vowels(String str) {
        String vowels="aeiou";
        StringBuilder sb=new StringBuilder();
        for(char c:str.toCharArray()) {
            if (vowels.contains((String.valueOf(c)).toLowerCase())){
                sb.append(c);
               // System.out.println(sb);
            }
        }
        return sb.toString();
    }
}
