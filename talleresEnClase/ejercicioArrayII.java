public class ejercicioArrayII{
    static String matriz[][]= {{"a11","a12","a13"},{"a21","a22","a23"}};
    static int arreglo[]= {17,22,23,15,28,16,20};
    public static void main(String[] args) {
        puntoMatriz();
        puntoArrayEdades();
    }
    static public void puntoMatriz(){
        for (int i=0; i<matriz.length-1; i++){
            for (int j=0; j<matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
                System.out.println(matriz[i+1][j]+" ");
            }
        }
    }
    static public void puntoArrayEdades(){
        /*- determine a través de booleanos que edades son mayores de edad. Es decir, 
        para la edad 17, ser mayor es falso​
        - cálcule la edad promedio del arreglo */
        for(int i=0, j=0; i<arreglo.length; i++){
            System.out.println(arreglo[i]+" años. ¿Es mayor de edad? -> ["+(arreglo[i]>18)+"]");
            j+= arreglo[i];
            if(i==(arreglo.length-1)){
                j/= arreglo.length;
                System.out.println("\nEdad promedio: "+j+" años.");
            }
        }
    }
}

