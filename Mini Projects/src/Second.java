import java.util.Scanner;

public class Second {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;

        System.out.print("Enter the row size: ");
        rows = scanner.nextInt();
        scanner.nextLine(); // to prevent scanner to get the wrong input

        System.out.print("Enter the column size: ");
        columns = scanner.nextInt();

        int [][] numbers = new int[rows][columns];

        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= columns; j++){
                numbers[i - 1][j - 1] = i * j;
            }
        }

        for (int [] r : numbers){
            for (int number : r){
                System.out.print(number + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
