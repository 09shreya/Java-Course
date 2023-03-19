public class MultipleCatch {
    public static void main(String[] args) {
        int i=2;
        int j=0;
        String num="";
        int n[]=new int[5];
        n[1]=2;
        try{
            j=18/i;
            System.out.println(n[1]);
            System.out.println(n[6]);

        }
        catch(ArithmeticException e){
            System.out.println("Dividing by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your Limits");
        }
        catch(Exception e){
            System.out.println("Something Went Wrong");
        }
        System.out.println(j);
        System.out.println("end");
    }
}
