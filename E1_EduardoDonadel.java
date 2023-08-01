
import java.util.Scanner;

public class E1_EduardoDonadel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double n1, n2, n3, n4, n5;

        System.out.println("Digite o primeiro número: ");
        n1 = in.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = in.nextDouble();
        System.out.println("Digite o terceiro número: ");
        n3 = in.nextDouble();
        System.out.println("Digite o quarto número: ");
        n4 = in.nextDouble();
        System.out.println("Digite o quinto número");
        n5 = in.nextDouble();

        if (n1>n2 && n1>n3 && n1>n4 && n1>n5 && n2<n3 && n2<n4 && n2<n5) {
            System.out.println((n3+n4+n5)/3);
        }
        else if (n1>n2 && n1>n3 && n1>n4 && n1>n5 && n3<n2 && n3<n4 && n3<n5) {
            System.out.println((n2+n4+n5)/3);
        }
        else if (n1>n2 && n1>n3 && n1>n4 && n1>n5 && n4<n3 && n4<n3&& n4<n5) {
            System.out.println((n3+n2+n5)/3);
        }
        else if (n1>n2 && n1>n3 && n1>n4 && n1>n5 && n5<n2 && n5<n3 && n5<n4) {
            System.out.println((n2+n3+n4)/3);
        }
        else if (n2>n1 && n2>n3 && n2>n4 && n2>n5 && n1<n3 && n1<n4 && n1<n5) {
            System.out.println((n3+n4+n5)/3);
        }
        else if (n2>n1 && n2>n3 && n2>n4 && n2>n5 && n3<n1 && n3<n4 && n3<n5) {
            System.out.println((n1+n4+n5)/3);
        }
        else if (n2>n1 && n2>n3 && n2>n4 && n2>n5 && n4<n3 && n4<n1 && n4<n5) {
            System.out.println((n1+n3+n5)/3);
        }
        else if (n2>n1 && n2>n3 && n2>n4 && n2>n5 && n5<n3 && n5<n4 && n5<n1) {
            System.out.println((n1+n3+n4)/3);
        }
        else if (n3>n1 && n3>n2 && n3>n4 && n3>n5 && n1<n2 && n1<n4 && n1<n5) {
            System.out.println((n2+n4+n5)/3);
        }
        else if (n3>n1 && n3>n2 && n3>n4 && n3>n5 && n2<n1 && n2<n4 && n2<n5) {
            System.out.println((n1+n4+n5)/3);
        } 
        else if (n3>n1 && n3>n2 && n3>n4 && n3>n5 && n4<n1 && n4<n2 && n4<n5) {
            System.out.println((n1+n2+n5)/3);
        }
        else if (n3>n1 && n3>n2 && n3>n4 && n3>n5 && n5<n1 && n5<n4 && n5<n2) {
            System.out.println((n1+n2+n4)/3);
        }
        else if (n4>n1 && n4>n2 && n4>n3 && n4>n5 && n2<n1 && n2<n3 && n2<n5) {
            System.out.println((n1+n3+n5)/3);
        }
        else if (n4>n1 && n4>n2 && n4>n3 && n4>n5 && n1<n2 && n1<n3 && n1<n5) {
            System.out.println((n2+n3+n5)/3);
        }
        else if (n4>n1 && n4>n2 && n4>n3 && n4>n5 && n3<n1 && n3<n2 && n3<n5) {
            System.out.println((n1+n2+n5)/3);
        }
        else if (n4>n1 && n4>n2 && n4>n3 && n4>n5 && n5<n1 && n5<n2 && n5<n3) {
            System.out.println((n1+n2+n3)/3);
        }
        else if (n5>n1 && n5>n2 && n5>n3 && n5>n4 && n1<n2 && n1<n3 && n1<n4) {
            System.out.println((n2+n3+n4)/3);
        }
        else if (n5>n1 && n5>n2 && n5>n3 && n5>n4 && n2<n1 && n2<n3 && n2<n4) {
            System.out.println((n1+n3+n4)/3);
        }
        else if (n5>n1 && n5>n2 && n5>n3 && n5>n4 && n3<n1 && n3<n2 && n3<n4) {
            System.out.println((n1+n2+n4)/3);
        }
        else if (n5>n1 && n5>n2 && n5>n3 && n5>n4 && n4<n1 && n4<n2 && n4<n3) {
            System.out.println((n1+n2+n3)/3);
        }
        if (n1<n2 && n1<n3 && n1<n4 && n1<n5 && n2<n3 && n2<n4 && n2<n5) {
            System.out.println((n3+n4+n5)/3);
        }
        else if (n1<n2 && n1<n3 && n1<n4 && n1<n5 && n3<n2 && n3<n4 && n3<n5) {
            System.out.println((n2+n4+n5)/3);
        }
        else if (n1<n2 && n1<n3 && n1<n4 && n1<n5 && n4<n3 && n4<n3&& n4<n5) {
            System.out.println((n3+n2+n5)/3);
        }
        else if (n1<n2 && n1<n3 && n1<n4 && n1<n5 && n5<n2 && n5<n3 && n5<n4) {
            System.out.println((n2+n3+n4)/3);
        }
        else if (n2<n1 && n2<n3 && n2<n4 && n2<n5 && n1<n3 && n1<n4 && n1<n5) {
            System.out.println((n3+n4+n5)/3);
        }
        else if (n2<n1 && n2<n3 && n2<n4 && n2<n5 && n3<n1 && n3<n4 && n3<n5) {
            System.out.println((n1+n4+n5)/3);
        }
        else if (n2<n1 && n2>n3 && n2<n4 && n2<n5 && n4<n3 && n4<n1 && n4<n5) {
            System.out.println((n1+n3+n5)/3);
        }
        else if (n2<n1 && n2<n3 && n2<n4 && n2<n5 && n5<n3 && n5<n4 && n5<n1) {
            System.out.println((n1+n3+n4)/3);
        }
        else if (n3<n1 && n3<n2 && n3<n4 && n3<n5 && n1<n2 && n1<n4 && n1<n5) {
            System.out.println((n2+n4+n5)/3);
        }
        else if (n3<n1 && n3<n2 && n3<n4 && n3<n5 && n2<n1 && n2<n4 && n2<n5) {
            System.out.println((n1+n4+n5)/3);
        } 
        else if (n3<n1 && n3<n2 && n3<n4 && n3<n5 && n4<n1 && n4<n2 && n4<n5) {
            System.out.println((n1+n2+n5)/3);
        }
        else if (n3<n1 && n3<n2 && n3<n4 && n3<n5 && n5<n1 && n5<n4 && n5<n2) {
            System.out.println((n1+n2+n4)/3);
        }
        else if (n4<n1 && n4<n2 && n4<n3 && n4<n5 && n2<n1 && n2<n3 && n2<n5) {
            System.out.println((n1+n3+n5)/3);
        }
        else if (n4<n1 && n4<n2 && n4<n3 && n4<n5 && n1<n2 && n1<n3 && n1<n5) {
            System.out.println((n2+n3+n5)/3);
        }
        else if (n4<n1 && n4<n2 && n4<n3 && n4<n5 && n3<n1 && n3<n2 && n3<n5) {
            System.out.println((n1+n2+n5)/3);
        }
        else if (n4<n1 && n4<n2 && n4<n3 && n4<n5 && n5<n1 && n5<n2 && n5<n3) {
            System.out.println((n1+n2+n3)/3);
        }
        else if (n5<n1 && n5<n2 && n5<n3 && n5<n4 && n1<n2 && n1<n3 && n1<n4) {
            System.out.println((n2+n3+n4)/3);
        }
        else if (n5<n1 && n5<n2 && n5<n3 && n5<n4 && n2<n1 && n2<n3 && n2<n4) {
            System.out.println((n1+n3+n4)/3);
        }
        else if (n5<n1 && n5<n2 && n5<n3 && n5<n4 && n3<n1 && n3<n2 && n3<n4) {
            System.out.println((n1+n2+n4)/3);
        }
        else if (n5<n1 && n5<n2 && n5<n3 && n5<n4 && n4<n1 && n4<n2 && n4<n3) {
            System.out.println((n1+n2+n3)/3);
        }
        

    }

}
