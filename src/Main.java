//Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n , k;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        n = input.nextInt();

        System.out.print("Üs olacak sayı : ");
        k = input.nextInt();

        int total = 1;

        // 3^4 = 3 * 3 * 3 * 3

        for(int i=1; i<=k; i++){
            total *= n;
        }
        System.out.println("Cevap : "+total);

    }
}
