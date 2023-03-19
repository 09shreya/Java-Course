public class LogicalOperator {
    public static void main(String args[]){
        int x=4;
        int y=8;
        int a=9;
        int b=6;
        boolean res=x>y && a>b;
        System.out.println(res);
        boolean res1=x>y && a<b;
        System.out.println(res1);
        boolean res2=x<y && a>b;
        System.out.println(res2);
        boolean res3=x>y || a>b;
        System.out.println(res3);
        boolean res4=x<y || a>b;
        System.out.println(res4);
        boolean res5=x>y || a<b;
        System.out.println(res5);
        boolean res6=x>y || a>b || a>1;
        System.out.println(res6);

        boolean res7=x>y && a>b && x>2;
        System.out.println(res7);
        boolean res8=x>y && a>b && x>2;
        System.out.println(!res8);//NOT operator


    }
}
