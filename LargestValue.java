class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest: "+ largest); 
    }
}
