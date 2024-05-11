import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }
        List<Integer> theNumbers = List.of(12,34,56,76,341);

        int index = 0;
        for(int number: theNumbers){
            System.out.println(theNumbers.get(index));
            index++;
        }

        int tempo = 0;
        int[] numbers = {65,74,22,55,7,4};
        for(int x=0; x<numbers.length; x++){
            for(int i=x+1; i<numbers.length-1;i++){
                if(numbers[x] < numbers[i]){
                    tempo = numbers[i];
                    numbers[i] = numbers[x];
                    numbers[x] = tempo;
                }
            }
        }
        System.out.println("Sorting");
     for(int x=0; x<numbers.length; x++){
         System.out.println(numbers[x]);
     }

        System.out.println("==========Lowest========");
     int lowest = numbers[0];
     for(int x=0; x<numbers.length; x++){
         if(numbers[x] > lowest){
             System.out.println(lowest);
         }
     }
    }
}