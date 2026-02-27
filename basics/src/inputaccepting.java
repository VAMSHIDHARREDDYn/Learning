import java.util.Scanner;
public class inputaccepting {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a;String s;
        System.out.println("Enter your name: ");
        s=sc.nextLine();
        System.out.println("Enter your age: ");
        a=sc.nextInt();
        System.out.println("Name:"+s);
        System.out.println("Age: "+a);
        sc.close();
    }
}
