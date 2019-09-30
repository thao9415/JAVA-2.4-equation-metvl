import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Giải phương trình ax2+bx+c");
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();
        System.out.print("c = ");
        int c = input.nextInt();
        Equation pt=new Equation(a,b,c);
        pt.display();
    }
}
