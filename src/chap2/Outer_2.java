package chap2;

public class Outer_2 {
    int outerMember = 2;
    void outerMethod(){
        int a = 10;
        class Inner{
            public void innerMethod(){
                System.out.println("innnerMethodです");
                System.out.println(outerMember+a);
            }
        }
        Inner ic = new Inner();
        ic.innerMethod();
    }

}
