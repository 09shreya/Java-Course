public class Throw {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try{
            j=18/0;
            if(j==0)
                throw new ArithmeticException("I don't want to print zero");
        }
        catch(ArithmeticException e){
            j=18/i;
            System.out.println("that is the default output" +e);
        }
        catch(Exception e){
            System.out.println("Something Went Wrong" + e);
        }
        System.out.println(j);
        System.out.println("End");
    }
}
