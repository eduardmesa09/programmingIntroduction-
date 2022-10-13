import java.util.Scanner;
import java.util.Arrays;
public class punto6 {
    static Scanner in= new Scanner(System.in);
    static String[] listaSemilla= {"Maíz","Papa","Yuca"};
    static String[] listaParcela= new String[20];
    static int contador= 0;
    public static void main(String[] args) {
        //"0" : vacío.
        for(int i=0; i<listaParcela.length; i++){
            listaParcela[i]= (i+1)+": "+listaSemilla[(int)(Math.random()*4-1)];
        }
        System.out.println(Arrays.toString(listaParcela)); 
        int opc=0;
        while(opc != 6){
            System.out.println("""
                ¿Qué deseas hacer?

                1. Ver cuantas y cuales parcelas se sembraron con Maíz.
                2. Ver cuantas y cuales parcelas se sembraron con Papa.
                3. Ver cuantas y cuales parcelas se sembraron con Yuca.
                4. Cosechar una parcela
                5. Volver a sembrar una parcela
                6. Terminar el programa.
                """);
            opc= in.nextInt();
            switch(opc){
                case 1->{
                    for(int i=0; i<listaParcela.length; i++){
                        if(listaParcela[i].contains(listaSemilla[0])){
                            System.out.println("[Parcela #"+listaParcela[i]+"]");
                            contador++;
                        }
                    }
                    System.out.println("\nEl número total de parcelas donde se sembró Maíz fue: "+ contador+".\n");
                    contador=0;
                }
                case 2->{
                    for(int i=0; i<listaParcela.length; i++){
                        if(listaParcela[i].contains(listaSemilla[1])){
                            System.out.println("[Parcela #"+listaParcela[i]+"]");
                            contador++;
                        }
                    }
                    System.out.println("El número total de parcelas donde se sembró Papa fue: "+ contador+".\n");
                    contador=0;
                }
                case 3->{
                    for(int i=0; i<listaParcela.length; i++){
                        if(listaParcela[i].contains(listaSemilla[2])){
                            System.out.println("[Parcela #"+listaParcela[i]+"]");
                            contador++;
                        }
                    }
                    System.out.println("El número total de parcelas donde se sembró Yuca fue: "+ contador+".\n");
                    contador=0;
                }
                case 4->{
                    System.out.print("¿Qué parcela desea cosechar? (20 en total):  ");
                    int n= in.nextInt();
                    listaParcela[n-1]=String.valueOf(n)+": ";
                    System.out.println("La parcela #"+n+" ha sido cosechada y ahora está lista para sembrar!\n");
                }
                case 5->{
                    System.out.println("¿En que parcela desea sembrar? (Recuerde que la parcela debe estar vacía).");
                    System.out.println(Arrays.toString(listaParcela));
                    int n= in.nextInt();
                    if(listaParcela[n-1].contains(" ")){
                        System.out.print("""
                            ¿Qué semilla desea sembrar?
                            
                            1. Maíz 
                            2. Papa
                            3. Yuca
                            """);
                        int x= in.nextInt();    
                        switch(x){
                            case 1-> listaParcela[n-1]+= listaSemilla[0];
                            case 2-> listaParcela[n-1]+= listaSemilla[1];
                            case 3-> listaParcela[n-1]+= listaSemilla[2];
                        }
                    }else{
                        System.out.println("Lo siento esta parcela ya se encuentra ocupada.");
                    }
                    System.out.println("\n"+Arrays.toString(listaParcela)+"\n");
                }
            }
        }
    }
}

