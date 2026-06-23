import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        System.out.println("Enter 3x3 matrix:");
        for(int i=0; i<3; i++)
            for(int j=0; j<3; j++)
                a[i][j] = sc.nextInt();
        int sum = 0;
        for(int i=0; i<3; i++){
            sum += a[i][i];       // main diagonal
            sum += a[i][2-i];     // anti diagonal
        }
        if(3%2 == 1) sum -= a[1][1]; // subtract centre (counted twice)
        System.out.println("Diagonal sum: " + sum);
    }
}
