class S1 extends Thread{
    public void run(){
        for( int i=1;i<=100;i++){
            System.out.println("hi");
            try{
                Thread.sleep(15);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class S2 extends Thread{
    public void run(){
        for( int i=1;i<=100;i++){
            System.out.println("hi Shreya");
            try{
                Thread.sleep(15);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
public class Threading {
    public static void main(String[] args) {
        S1 ob = new S1();
        S2 obj = new S2();
        ob.start();
        try{
            Thread.sleep(15);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        obj.start();
    }
}
