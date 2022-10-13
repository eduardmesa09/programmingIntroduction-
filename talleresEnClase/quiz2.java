import java.util.Scanner;
public class quiz2 {
    static Scanner in= new Scanner(System.in);
    public static void main(String[] args) {
        boolean respuesta= false;
        while(!respuesta){
            System.out.print("Ingrese el número que desea buscar: ");
            int num= in.nextInt();
            int[] array= new int[20];
            for(int i=0; i<array.length; i++){
                array[i]= (int)(Math.random()*40+1);
                if(array[i]==num){respuesta=true;}
            }
            if(respuesta){System.out.println(num+" si está!");}
            else{System.out.println(num+" no está!");}
            System.out.print("Array: ");
            for(int i=0; i<array.length; i++){
                if(i!=array.length-1){System.out.print(array[i]+", ");}
                else{System.out.print(array[i]+"\n\n");}
            }
        }
        System.out.println("Fin del programa.");
    }
}

