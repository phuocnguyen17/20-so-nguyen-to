import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of prime numbers you want to display: ");
        int numbers = input.nextInt();

        int count = 0;
        int N =2;
        while (count < numbers){
            boolean isPrime = true;

            for(int i=2;i<=N/2;i++){
                if(N%i==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(N + " ");
                count++;
            }
            N++;
        }

    }

}