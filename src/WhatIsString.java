import java.util.Locale;

public class WhatIsString {
    public static void main(String args[]){
        String name = new String("Shreya");
        System.out.println(name);
        System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(name.codePointAt(4));
        System.out.println(name.compareTo("Shreya"));
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.concat("  Singh"));

    }

}
