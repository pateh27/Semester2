package week1;
import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       
    System.out.print("Input Nim: ");
    String nim = sc.nextLine();
    //Mengambil 2 digit terkahir dari NIM sebagai n
    int n = Integer.parseInt(nim.substring(nim.length()-2));
    if (n <10) {
        n += 10;
    }

    System.out.println("Ouput: ");
    for (int i = 0; i <= n; i++) {
        if(i == 6 || i == 10){
            continue;
        }else if (i % 2 == 0) {
            System.out.print(i);
        }else {
            System.out.print("*");
        }
      }
      System.out.println();
    }
}
    

