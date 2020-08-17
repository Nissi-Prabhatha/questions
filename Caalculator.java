interface test {
    int operate(int a ,int b);
}
    public class Calculator{

        public static void main(String args[]) {
            test addi = (int a, int b) -> (a + b);
            test diff = (int a,int b) -> (a - b);
            test product = (int a,int b) -> (a * b);
            test safediv=(a,b)->{
             if(b==0) return 0;
             return a/b; };

           System.out.println( addi.operate(10,20));
           System.out.println( diff.operate(3,2));
            System.out.println(product.operate(5,2));
            System.out.println(safediv.operate(10,2));
        }
    }