class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        System.out.println("Enter a character: ");
        String sstr = scan.nextLine();
        int strlen = str.length();
        int sstrlen = sstr.length();
        int count = 0;
        
        for(int i=0;i<=strlen-sstrlen;i++){
            boolean found = true;
            for(int j=0;j<sstrlen;j++){
                if(str.charAt(i+j) != sstr.charAt(j)){
                    found = false;
                    break;
                }
               
            }
            if(found){
                count++;
            }
        }
        System.out.println("Number of occurrences: " + count);
    }
}
