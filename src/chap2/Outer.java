package chap2;

public class Outer {
    int outerField; static int outerStaticField;
    static class Inner{
        void innnerMethod(){
            outerStaticField = 10;
        }
    }
    void outerMethod(){
        Inner ic = new Inner();
    }
}
