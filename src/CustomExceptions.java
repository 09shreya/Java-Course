class MyException extends Exception{
    public MyException(String Str){
        super(Str);
    }
}
public class CustomExceptions {
    public static void main(String[] args) {
                int i=20;
                int j=0;
                try{
                    j=18/i;
                    if(j==0)
                        throw new MyException("i do not want to print zero" );
                }
                catch(MyException e){
                    j=18/1;
                    System.out.println("that is the default output" +e);
                }
                catch(Exception e){
                    System.out.println("Something Went Wrong" + e);
                }
                System.out.println(j);
                System.out.println("End");
            }
        }



