import java.util.Scanner;
public class inputoutput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you name: ");
        String s=sc.nextLine();
        System.out.println("Enter your age: ");
        int a=sc.nextInt();
        System.out.println("Enter your score: ");
        int m=sc.nextInt();
        System.out.println("Welcome "+s+"\n"+"Age "+a+"\n"+"Marks "+m);
    }
}
