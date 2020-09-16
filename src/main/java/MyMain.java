import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int pow = 0;
        int sum = 0;
        for(int i = binary.length() - 1; i >= 0; i --){
            if(binary.charAt(i) == '0'){
            }else if(binary.charAt(i) == '1'){
                sum += Math.pow(2,pow);
            }else{
                return -1;
            }
            pow ++;
        }
        // REPLACE WITH YOUR CODE HERE
        return sum;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String b = null;
        int d = -1;
        do{
            System.out.println("Enter a positive number in binary format!");
            b = scan.next();
            d = binaryToDecimal(b);
        }
        while(d == -1);

        System.out.println("Your binary number is equal to " + binaryToDecimal(b) + " in decimal." );
        scan.close();
    }
}
