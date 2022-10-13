import javax.swing.JOptionPane;
public class segundoEjercicio {
    public static void main (String[]args){
        int array1 [][] = new int[5][5];
        int array2 [][] = new int[5][5];
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array1[i].length; j++){
                array1[i][j]= (int)(Math.random()*10-1);
            }
        }
        for(int i=0; i<array2.length; i++){
            for(int j=0; j<array2[i].length; j++){
                array2[i][j]= (int)(Math.random()*10-1);
            }
        }
        int entrada= Integer.parseInt(JOptionPane.showInputDialog("""
            Ingrese la opcion que desea: 
            1-suma 
            2-resta 
            3-multiplicación"""));
        switch (entrada) {
            //SUMA DE MATRICES
            case 1 ->{
                //array 1
                System.out.print("\narray1= A= \n[ ");
                for(int i=0; i<array1.length; i++){
                    for(int j=0; j<array1[i].length; j++){
                        System.out.print(array1[i][j]+" ");
                    }
                    if(i!=array1.length-1){System.out.println();}
                }
                System.out.println("]");
                //array 2
                System.out.print("\narray2= B= \n[ ");
                for(int i=0; i<array2.length; i++){
                    for(int j=0; j<array2[i].length; j++){
                        System.out.print(array2[i][j]+" ");
                    }
                    if(i!=array2.length-1){System.out.println();}
                }
                System.out.println("]");
                //A+B
                System.out.print("\nA+B= \n[");
                for (int i=0; i<array1.length; i++){
                    for(int j=0; j<array1.length; j++){
                        if(i!=0){
                            if(j!=0){
                                if((array1[i][j]+array2[i][j]+10)<20){System.out.print(" "+(array1[i][j]+array2[i][j])+"  ");}
                                else{System.out.print(" "+(array1[i][j]+array2[i][j])+" ");}
                            }
                            else{
                                if((array1[i][j]+array2[i][j]+10)<20){System.out.print(" "+(array1[i][j]+array2[i][j])+"  ");}
                                else{System.out.print(" "+(array1[i][j]+array2[i][j])+" ");}
                            }     
                        }
                        else{
                            if(i==0){
                                if((array1[i][j]+array2[i][j]+10)<20){System.out.print((array1[i][j]+array2[i][j])+"   ");}
                                else{System.out.print((array1[i][j]+array2[i][j])+"  ");}
                            }
                            else{
                                if((array1[i][j]+array2[i][j]+10)<20){System.out.print(" "+(array1[i][j]+array2[i][j])+"  ");}
                                else{System.out.print(" "+(array1[i][j]+array2[i][j])+" ");}
                            }
                        }
                    }  
                    if(i!=array1.length-1){System.out.println();}  
                }
                System.out.print("]");    
            }

            case 2 ->{//RESTA
                //array 1
                System.out.print("\narray1= A= \n[ ");
                for(int i=0; i<array1.length; i++){
                    for(int j=0; j<array1[i].length; j++){
                        System.out.print(array1[i][j]+" ");
                    }
                    if(i!=array1.length-1){System.out.println();}
                }
                System.out.println("]");
                //array 2
                System.out.print("\narray2= B= \n[ ");
                for(int i=0; i<array2.length; i++){
                    for(int j=0; j<array2[i].length; j++){
                        System.out.print(array2[i][j]+" ");
                    }
                    if(i!=array2.length-1){System.out.println();}
                }
                System.out.println("]");
                //A-B
                System.out.print("\nA-B= \n[");
                for (int i=0; i<array1.length; i++){
                    for(int j=0; j<array1.length; j++){
                        if(i!=0){
                            if(j!=0){
                                if((array1[i][j]-array2[i][j])<0){System.out.print(" "+(array1[i][j]-array2[i][j])+" ");}
                                else{System.out.print(" "+(array1[i][j]-array2[i][j])+"  ");}
                            }
                            else{
                                if((array1[i][j]-array2[i][j])<0){System.out.print(" "+(array1[i][j]-array2[i][j])+" ");}
                                else{System.out.print(" "+(array1[i][j]-array2[i][j])+"  ");}
                            }     
                        }
                        else{
                            if(i==0){
                                if((array1[i][j]-array2[i][j])<0){System.out.print((array1[i][j]-array2[i][j])+"  ");}
                                else{System.out.print((array1[i][j]-array2[i][j])+"   ");}
                            }
                            else{
                                if((array1[i][j]-array2[i][j])<0){System.out.print(" "+(array1[i][j]-array2[i][j])+" ");}
                                else{System.out.print(" "+(array1[i][j]-array2[i][j])+"  ");}
                            }
                        }
                    }  
                    if(i!=array1.length-1){System.out.println();}  
                }
                System.out.print("]");
            }

            case 3 ->{//MULTILICACIÓN
                //array 1
                System.out.print("\narray1= A= \n[ ");
                for(int i=0; i<array1.length; i++){
                    for(int j=0; j<array1[i].length; j++){
                        System.out.print(array1[i][j]+" ");
                    }
                    if(i!=array1.length-1){System.out.println();}
                }
                System.out.println("]");
                //array 2
                System.out.print("\narray2= B= \n[ ");
                for(int i=0; i<array2.length; i++){
                    for(int j=0; j<array2[i].length; j++){
                        System.out.print(array2[i][j]+" ");
                    }
                    if(i!=array2.length-1){System.out.println();}
                }
                System.out.println("]");
                //A*B
                System.out.print("\nA*B= \n[");
                for (int i=0; i<array1.length; i++){
                    for(int j=0; j<array1.length; j++){
                        if(i!=0){
                            if(j!=0){
                                if((array1[i][j]*array2[i][j]+10)<20){System.out.print(" "+(array1[i][j]*array2[i][j])+"  ");}
                                else{System.out.print(" "+(array1[i][j]*array2[i][j])+" ");}
                            }
                            else{
                                if((array1[i][j]*array2[i][j]+10)<20){System.out.print(" "+(array1[i][j]*array2[i][j])+"  ");}
                                else{System.out.print(" "+(array1[i][j]*array2[i][j])+" ");}
                            }     
                        }
                        else{
                            if(i==0){
                                if((array1[i][j]*array2[i][j]+10)<20){System.out.print((array1[i][j]*array2[i][j])+"   ");}
                                else{System.out.print((array1[i][j]*array2[i][j])+"  ");}
                            }
                            else{
                                if((array1[i][j]*array2[i][j]+10)<20){System.out.print(" "+(array1[i][j]*array2[i][j])+"  ");}
                                else{System.out.print(" "+(array1[i][j]*array2[i][j])+" ");}
                            }
                        }
                    }  
                    if(i!=array1.length-1){System.out.println();}  
                }
                System.out.print("]"); 
            }
        }
    }
}
