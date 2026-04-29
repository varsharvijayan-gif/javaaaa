import java.util.Scanner;
public class hw5 {
    public static void main(String arg[]) {
        int total = 0;
    int[][] a = new int[5][3];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the values:");
    for(int i=0; i<5;i++){
        for(int j=0; j<3;j++){
            a[i][j] = sc.nextInt();
        }
    }
    System.out.println("The values are:");
    for(int i=0; i<5;i++){
        for(int j=0; j<3;j++){
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
       for (int j = 0; j < 3; j++) {
           

            for (int i = 0; i < 5; i++) {
                total += a[i][j];
            }
            System.out.println("Total for column " + j + ": " + total);
        }
         if (total >= 500) {
                System.out.println("Target Achieved");
            } else if (total >= 300) {
                System.out.println("Average Performance");
            } else {
                System.out.println("Needs Improvement");
            }
        }
    }


