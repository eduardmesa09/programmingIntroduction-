import java.util.Scanner;
public class punto5 {
    static Scanner in= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese una palabra:  ");
        String word= in.next();
        System.out.println("El numero de letras que contiene la palabra '"+word+"' es: "+word.length()+".");
    }
}
