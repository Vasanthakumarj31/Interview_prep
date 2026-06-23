class Main{
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        boolean isprime = true;
        if(n<=1){
            isprime = false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                isprime = false;
                break;
            }else{
                isprime = true;
            }
        }
        if(isprime){
            System.out.println(n + " is a prime number");

        }else{
            System.out.println(n + " is not a prime number");
        }
    }
}
