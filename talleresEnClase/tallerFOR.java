import java.util.Scanner;
public class tallerFOR {
    static Scanner in= new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int i=0;
        while(i<7){ 
            System.out.println("""
            ¿Qué desea hacer?
            
            1. Sacar promedio.
            2. Sumar los números pares del 2 al 100.
            3. Sumar los números pares del 2 al 100 y saber cuentos pareas hay.
            4. Sumar los números que hay desde el primer número hasta el segundo.
            5. Mostrar los números del 1 al 100 en una caja de 10x10.
            6. Mostar las tablas de multiplicar del 0 al 10.
            7. Salir del programa.""");
            i=in.nextInt();
            switch(i){
                case 1 -> punto1();
                case 2 -> punto2();
                case 3 -> punto3();
                case 4 -> punto4();
                case 5 -> punto5();
                case 6 -> punto6();
                default -> i=7;
            }
        }    
    }

    public static void punto1() {
        System.out.println("Ingrese el número total de notas : ");
        double a = in.nextDouble(), promedio, notaAcumulada = 0.0;
        for (int i=1; i<=a; i++){
            System.out.println("Ingrese nota #" + i);
            notaAcumulada+=in.nextDouble();
        }
        promedio = (notaAcumulada/a);
        System.out.println("Promedio : " + promedio);
    }

    public static void punto2() {
        int a=0;
        for(int i=2; i<=100; i+=2){
            a+=i;
        }
        System.out.println("La suma de los números pares del 2 al 100 es : "+a);
    }

    public static void punto3() {
        int contador=0;
        int a=0;
        for(int i=2; i<=100; i+=2){
            contador++;
            a+=i;
        }
        System.out.println("La cantidad de números pares de 2 hasta 100 es de: "+contador);
        System.out.println("Suma total de los pares del 1 al 100 : "+a);
    }

    public static void punto4(){
        /*Que pida dos números y sume todos los números que van desde el primero al segundo. 
        Se debe controlar que los valores son correctos.*/
        double num1=-0.1, num2=-0.1;
        System.out.println("Ingrese el primer número (Debe ser entero mayor o igual a 0" 
        +" y menor que el segundo número)");
        while(num1<0 || (num1-Math.round(num1))!=0.0){
            num1 = in.nextDouble();
            if(num1<0 || (num1-Math.round(num1))!=0.0){System.out.println("El número no cumple con las condiciones dadas."
            +" Inténtelo nuevamente.");}
        }
        System.out.println("Ingrese el segundo número (Debe ser entero positivo y mayor"
        +" que el primer número)");
        while(num2<=num1 || (num2-Math.round(num2))!=0.0){
            num2 = in.nextDouble();
            if(num2<=num1 || (num2-Math.round(num2))!=0.0){System.out.println("El número no cumple con las condiciones dadas."
            +" Inténtelo nuevamente.");}
        }    
        for(int i= (int)(num2-num1)-1; i>=0; i--){
        System.out.print(num1);
        num1+=num2-i; 
        System.out.println(" + "+ (num2-i) +" = "+num1);
        }
    }

    public static void punto5() {
        //Que muestre los números del 1 al 100 en una tabla de 10x10
        for (int i=0, j=1; i<10; i++){
            for(int k=1; k<=10; j++,k++){
                if(j<10){System.out.print(j+"  ");}
                else{System.out.print(j+" ");}
            }
            System.out.println("");
        }
    }

    public static void punto6() {
        //Que escriba las tablas de multiplicar del 0 al 10
        for (int i=0; i<=11; i++){
            for(int k=0; k<=10; k++){
                int n=(k)*(i-1);
                if(i==0){
                    if(k==0){System.out.print("* | ");}
                    else{System.out.print(k+"    ");}
                }
                else if(k==0){
                    if(i>=11){System.out.print((i-1)+"| ");}
                    else{System.out.print((i-1)+" | ");}
                }
                else{
                    if(n>=10){System.out.print(n+"   ");}
                    else{System.out.print(n+"    ");}
                }
            }
            if(i==0){System.out.print("\n------------------------------------------------------");}
            System.out.println("");
        }
    }
}