import java.util.Arrays;

public class First {
    public static void main(String[] args){

        int [] numbers = {-1, 10, 6, 7, -7, 1};
        int result = 0;
        boolean done = false;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.abs(numbers[i]);
        }

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++){
            if (i == 0){
                continue;
            }
            else if (numbers[i] == numbers[i-1]){
                result = numbers[i];
                done = true;
            }
            else {
                continue;
            }
        }

        if (done){
            System.out.println(result);
        }
        else {
            System.out.println(-1);
        }






    }

}
