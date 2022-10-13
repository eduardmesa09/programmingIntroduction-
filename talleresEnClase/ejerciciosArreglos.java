import java.util.*;
public class ejerciciosArreglos{
    static Scanner in= new Scanner(System.in);
    static ArrayList<Integer> list= new ArrayList<Integer>();
    static Random n= new Random();
    public static void main(String[] args) {
        int opc= 0;
        while(opc!=6){
            System.out.println("""
                ¿Qué punto desea hacer?
            
                1. Número mayor y menor
                2. Generar números aleatorios y decir cuáles son múltiplos de 3
                3. Generar números aleatorios entre cero y uno 20 veces, y decir cuantos ceros hay
                4. Generar números aleatorios del 1 al 9 y ordenarlos de menor a mayor, luego mostrarlos 
                5. Aplicación para una tienda de dulces
                6. Salir del programa
                """);
            opc= in.nextInt();    
            switch(opc){
                case 1 -> punto1();
                case 2 -> punto2();
                case 3 -> punto3();
                case 4 -> punto4();
                case 5 -> punto5();
                default -> opc= 6;
            }    
        }    
    }
    public static void punto1(){
        ArrayList<String> opc= new ArrayList<String>(List.of("Primer", "Segundo", "Tercer", "Cuarto"));
        for (int i=0; i<opc.size(); i++){
            System.out.println("Ingrese el "+opc.get(i)+" número: ");
            int n= in.nextInt();
            list.add(n);
        }
        Collections.sort(list);
        System.out.println("\nLista: "+list+"\nNúmero menor: "+list.get(0)+"\nNúmero mayor: "+list.get(list.size()-1)+"\n");
        list.clear();
    }
    public static void punto2(){
        System.out.print("Números: ");
        for(int i=0; i<6; i++){
            int num= (int) (Math.random()*100);
            System.out.print(num+" ");
            if (num%3==0){
                list.add(num);
            }
        }    
        System.out.println("\nMúltiplos de 3: "+list+"\n");
        list.clear();
    }
    public static void punto3(){
        int i=0;
        for(int j=0; j<20; j++){
            int num= n.nextInt(2);
            list.add(num);
            if(num==0){i++;}    
        }
        System.out.println(list+"\nCantidad de ceros (0) : "+i+"\n");
        list.clear();
    } 
    public static void punto4(){
        for(int i=0; i<10; i++){
            int num= n.nextInt(10)+1;
            list.add(num);
        }
        System.out.println("Lista original: "+list);
        Collections.sort(list);
        System.out.println("Lista ordenada de menor a mayor: "+list+"\n");
        list.clear();    
    }
    public static void punto5(){
        ArrayList<Integer> priceList= new ArrayList<Integer>(List.of(100, 200, 600));
        ArrayList<String> productList= new ArrayList<String>(List.of("Gomitas", "Galletas", "Quipitos"));
        int ingresos= 0;
        String opcion="";
        while(opcion!="e"){
            System.out.println("""
                ¿Qué desea hacer? 
                
                a. Mostrar los productos y sus precios
                b. Vender un producto
                c. Mostar el total de ingresos
                d. Cambiar el precio de un producto
                e. Volver al menú principal
                """);
            opcion= in.next();
            switch(opcion){
                case "a" -> { 
                    System.out.println("Precio de los dulces: \n");
                    for (int i=0; i<priceList.size(); i++) {  
                    System.out.println(productList.get(i) + ": $" +priceList.get(i));
                    }
                    System.out.println();
                }
                case "b" -> {
                    System.out.println("""
                        ¿Qué producto desea vender?
                        1. Gomitas 
                        2. Galletas
                        3. Quipitos
                        """);
                    int opc= in.nextInt(), cantidad;
                    switch(opc){
                        case 1 -> {
                            System.out.print("Ingrese la cantidad de "+productList.get(0)+" que va a vender:  ");
                            cantidad= in.nextInt(); 
                            ingresos+=cantidad*priceList.get(0);
                            System.out.println("\nProducto vendido! Los ingresos aumentaron en $"+cantidad*priceList.get(0)+"\n");
                        }     
                        case 2 -> {
                            System.out.print("Ingrese la cantidad de "+productList.get(1)+" que va a vender:  ");
                            cantidad= in.nextInt();
                            ingresos+=cantidad*priceList.get(1);
                            System.out.print("\nProducto vendido! Los ingresos aumentaron en $"+cantidad*priceList.get(1)+"\n");
                        }
                        case 3 -> {
                            System.out.print("Ingrese la cantidad de "+productList.get(2)+" que va a vender:  ");
                            cantidad= in.nextInt();
                            ingresos+=cantidad*priceList.get(2);
                            System.out.println("\nProducto vendido! Los ingresos aumentaron en $"+cantidad*priceList.get(2)+"\n");
                        }
                    }
                }
                case "c" -> {
                    System.out.println("Ingresos totales: $"+ingresos+"\n");
                }
                case "d" -> {
                    System.out.println("""
                        ¿A qué producto desea cambiarle el precio?
                        1. Gomitas 
                        2. Galletas
                        3. Quipitos
                        """);
                    int opc= in.nextInt(), price;
                    switch(opc){
                        case 1 -> {
                            System.out.print("Ingrese el nuevo precio de las "+productList.get(0)+":  ");
                            price= in.nextInt(); 
                            priceList.set(0, price);
                            System.out.println("\nEl precio se ha actualizado!\n");
                        }     
                        case 2 -> {
                            System.out.println("Ingrese el nuevo precio de las "+productList.get(1)+":  ");
                            price= in.nextInt(); 
                            priceList.set(1, price);
                            System.out.println("\nEl precio se ha actualizado!\n");
                        }
                        case 3 -> {
                            System.out.println("Ingrese el nuevo precio de los "+productList.get(2)+":  ");
                            price= in.nextInt(); 
                            priceList.set(2, price);
                            System.out.println("\nEl precio se ha actualizado!\n");
                        }
                    }
                }
                default -> opcion= "e";     
            }
        }         
    }
}    