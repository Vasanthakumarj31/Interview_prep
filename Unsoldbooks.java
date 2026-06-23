import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] total = {1,7,5,4,3,9,8,6,2,10};
        int[] sold  = {1,10,9,3,11,15,8};
        System.out.print("Unsold books: ");
        for(int i=0; i<total.length; i++){
            boolean found = false;
            for(int j=0; j<sold.length; j++){
                if(total[i] == sold[j]){
                    found = true;
                    break;
                }
            }
            if(!found) System.out.print(total[i] + " ");
        }
    }
}
