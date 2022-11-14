import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;
        int ebob = 1;
        int ekok=1;
        Scanner scan=new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        n1= scan.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        n2= scan.nextInt();

        //EBOB
        int i=n1;
        while (i>=1){
            if(n1 % i == 0 && n2 % i == 0){
               ebob=i;
               break;
            }
            i--;
        }
        System.out.println(ebob);

        //EKOK
        int k=1;
        while (k <= (n1 * n2)){
            if (k % n1 == 0 && k % n2 == 0){
                ekok=k;
                break;
            }
            k++;
        }
        System.out.println(ekok);
    }
}