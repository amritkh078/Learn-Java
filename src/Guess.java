import java.util.Scanner;
public class Guess {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int myNum = (int)(Math.random()*1000);
        int userNumber = 0;

        do{
            System.out.println("Guess the number : ");
            userNumber = sc.nextInt();

            if(userNumber == myNum){
                System.out.println("Correct guess");
                break;
            }
            else if(userNumber > myNum){
                System.out.println("Number is too large");
                }
            else{
                System.out.println("Number is too small");
            }
        }while(userNumber >= 0);
        System.out.println("The number is :");
        System.out.println(myNum);
    }
}
