enum Status{
    Running,Pending,Waiting,Active,Failed
}
public class EnumIf {
    public static void main(String[] args) {
        Status s= Status.Running;
        if(s==Status.Active){
            System.out.println("Currently Working");
        }
        else if(s==Status.Waiting){
            System.out.println("Please Wait");
        }
        else if (s==Status.Pending){
            System.out.println("Please wait more");
        }
        else if(s==Status.Failed){
            System.out.println("Try Again");
        }
        else{
            System.out.println("Done");
        }


    }
}
