/*class S3 implements Runnable {
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
class S4 implements Runnable {
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

}*/
// Using anonymous class and Lambda Function
public class RunnableVSThread {
    public static void main(String[] args) {
        Runnable o1=() ->{
        for( int i=1;i<=100;i++){
            System.out.println("hi");
            try{
                Thread.sleep(15);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        } }  ;
        Runnable o2=() ->{
            for( int i=1;i<=100;i++){
                System.out.println("hello");
                try{
                    Thread.sleep(15);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        Thread t1=new Thread(o1);
        Thread t2=new Thread(o2);
        t1.start();
        t2.start();
        }

    }

