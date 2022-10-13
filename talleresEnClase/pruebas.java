import java.util.Random;
public class pruebas {   
    public static void main(String[] args){
        for(int i=0; i<=10; i++){
            Random x = new Random();
            int x1= x.nextInt(100);
            
            System.out.println(x1);
        }
    }
}
