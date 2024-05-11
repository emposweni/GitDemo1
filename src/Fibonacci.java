public class Fibonacci {
    public static void main(String[] args) {
        int count = 0;
        int nextVal = 1;
        int prevVal = 0;
        int sum = 0;

        while(count <= 10){
            System.out.print(prevVal+" ");

            sum = prevVal+nextVal;
            prevVal = nextVal;
            nextVal = sum;
            count++;
        }
    }
}
