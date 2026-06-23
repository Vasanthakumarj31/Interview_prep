import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int len = str.length();
        if(len%2==1){
            System.out.println(str.charAt(len/2));

        }else{
            System.out.println(str.charAt(len/2-1)+" "+str.charAt(len/2));

        }

    }
}
