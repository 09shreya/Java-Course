public class WhileLoop {
    public static void main(String[] args) {
        int i= 1;
        while(i<=6){
            System.out.println("Hi"+i);
            i++;
        }
        System.out.println("Bye"+i);  //as itis out of while loop it will take i value more than 6
    }
}
