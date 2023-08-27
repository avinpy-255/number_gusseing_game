package JavaProjects;
import java.util.Random;
import java.util.Scanner;

class statements{
     int Computer;
     public statements(){
        Random rand = new Random();
        Computer = rand.nextInt(100);
        System.out.println("Choose The Number Between 1 to 100");
     }
     public int ComputerNo() {return Computer;}
}
public class NGM{
     static int FromUser(){
        int User;
        System.out.println("ENTER");
        Scanner sc = new Scanner(System.in);
        User=sc.nextInt();
        return User;
     }

    static void isCorrectNumber(int x,int y){
        if(x==y){
            System.out.println("Correct Guess You Win");
        }
        else if(x>y){
            System.out.println("Your No. is High then Computer No.");

        }
        else{
            System.out.println("Your No. is Low then Computer No.");

        }
    }
    public static void main(String[]args){
        int User=0,Computer=0,itteration=0;
        statements s = new statements();
        do{
           User = FromUser();
           Computer = s.ComputerNo();

           isCorrectNumber(User, Computer);
           itteration++;
        }while (User!=Computer);
        System.out.println("Your Guess is Right, in " + itteration + " Attempts");
    }
}