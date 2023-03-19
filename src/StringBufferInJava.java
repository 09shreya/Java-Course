

public class StringBufferInJava {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Shreya");
        System.out.println(s.lastIndexOf("Shreya"));
        System.out.println(s.capacity());
        System.out.println(s.length());
        System.out.println(s.append(" Singh"));
        System.out.println(s.insert(3,"hh"));
        System.out.println(s.deleteCharAt(4));
       String str=s.toString();
        System.out.println(str);
        s.setLength(40);
        System.out.println(s);
        s.ensureCapacity(100);
        System.out.println(s);
        System.out.println(s.lastIndexOf("Singh"));
        System.out.println(s.substring(2,6));

    }
}
