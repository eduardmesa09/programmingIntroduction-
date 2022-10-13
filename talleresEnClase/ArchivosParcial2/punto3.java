import java.util.Scanner;
public class punto3 {
    static Scanner in= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese un número entero (n):  ");
        int n= in.nextInt();
        if(n%2==0){n= n-1;}
        System.out.print("Resultado: ");
        for(int i=1; i<=n; i+=2){
            System.out.print(i+" ");
        }
    }
}



    