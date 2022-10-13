public class punto4 {
    public static void main(String[] args) {
        Integer[] strArr = new Integer[11]; 
        String separador = "";
        for (int i=1; i<=strArr.length; i +=2) { 
            strArr[i-1]=i;
            System.out.print(separador + strArr[i-1]); 
            separador= " , ";
        }
    }
}