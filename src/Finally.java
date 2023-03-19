public class Finally {
    public static void main(String[] args) {
        int j=0;
        int i=0;
        try{
            j=20/i;
            System.out.println("Arithmetic Exception");
        }
        catch(Exception e){
            System.out.println("Something Wrong");
        }
        finally {
            System.out.println("End");
        }
    }
}
